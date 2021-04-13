import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDTF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;

import java.util.*;

public class DataLineOnOff extends GenericUDTF {


    private PrimitiveObjectInspector stringOI = null;

    private String startStatusFlag = "3";
    private String endStatusFlag = "4";
    /**
     *对传入的参数进行初始化
     *判断参数个数/类型
     * 初始化表结构
     */
    @Override
    public StructObjectInspector initialize(ObjectInspector[] objectInspectors) throws UDFArgumentException {

        // 异常检测
        if ( !( objectInspectors.length == 1 | objectInspectors.length == 3 ) ) {
            throw new UDFArgumentException("NameParserGenericUDTF() takes exactly two argument");
        }

        if (objectInspectors[0].getCategory() != ObjectInspector.Category.PRIMITIVE && ((PrimitiveObjectInspector) objectInspectors[0]).getPrimitiveCategory() != PrimitiveObjectInspector.PrimitiveCategory.STRING) {
            throw new UDFArgumentException("NameParserGenericUDTF() takes a string as a parameter");
        }

        //输入
//        stringOI = (PrimitiveObjectInspector) objectInspectors[0];
        stringOI = (PrimitiveObjectInspector)objectInspectors[0];

        // 输出
        //初始化表结构
        //创建数组列表存储表字段
        List<String> fieldNames = new ArrayList<String>(2);
        List<ObjectInspector> fieldOIs = new ArrayList<ObjectInspector>(2);

        // 输出列名
        fieldNames.add("start_time_split");
        fieldNames.add("end_time_split");


        //创建数组列表存储表字段
        fieldOIs.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);
        fieldOIs.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);

        return ObjectInspectorFactory.getStandardStructObjectInspector(fieldNames, fieldOIs);
    }


    @Override
    public void process(Object[] record) throws HiveException {

        String input = record[0].toString();
        String[] TimeLineAndStatus = input.split(";");

        this.startStatusFlag = record[1].toString();
        this.endStatusFlag = record[2].toString();

        try {


            ArrayList<Object[]> results = sortToPairs(TimeLineAndStatus);

            Iterator<Object[]> it = results.iterator();
            while (it.hasNext()) {
                try {
                    Object[] r = it.next();
                    forward(r);
                } catch (HiveException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("+==============process step error*************");
        }
    }



    @Override
    public void close() throws HiveException {

    }


    /**
     * 生成多列数据
     *
     * @param TimeLineAndStatus

     * @return
     */
    public ArrayList<Object[]> sortToPairs(String[] TimeLineAndStatus) throws Exception{

        ArrayList<Object[]> resultList = new ArrayList<Object[]>();
//        Collections.sort
        ArrayList<DateLineAction> dateLineActionList = new ArrayList<>();
//        timeList.stream().collect()
        for (int i = 0; i < TimeLineAndStatus.length; i++) {
            String[] x = TimeLineAndStatus[i].split(":");
            dateLineActionList.add(new DateLineAction(Long.valueOf(x[0]), Integer.parseInt(x[1] )  ));
        }
        Collections.sort(dateLineActionList);

        //            如果第一行是下线时间，则剔除
        while (true){
            if( dateLineActionList.get(0).getAction() == Integer.parseInt(this.endStatusFlag)  ){
                dateLineActionList.remove(0);
            } else {
                break;
            }
        }
        int forLenth = dateLineActionList.size();
        for (int i = 1; i < forLenth; i++) {

//            指针1
            DateLineAction dateLineActionFist =  dateLineActionList.get(i-1);
//            指针2
            DateLineAction dateLineActionSecond =  dateLineActionList.get(i);

//            理论上指针1 指针2 对应的数据是交替进行  01010101 如果不是这样，则去重处理
            if (dateLineActionFist.getAction() == dateLineActionSecond.getAction()) {

//                如果start flag 重复，则删除最早的
                if (dateLineActionFist.getAction() == Integer.parseInt(this.startStatusFlag)){
                    dateLineActionList.remove(i-1);
                    i--;
                    forLenth--;
//                如果 end flag 重复，则删除最晚的
                } else if (dateLineActionFist.getAction() == Integer.parseInt(this.endStatusFlag)) {
                    dateLineActionList.remove(i);
                    i--;
                    forLenth--;
                }
            }

        }

        int pairLenth =  dateLineActionList.size();

        if (pairLenth >= 2 ) {
            if (pairLenth%2 == 0){
                for (int j = 1; j < pairLenth; j++) {
                    if ( dateLineActionList.get(j-1).getAction() == Integer.parseInt(this.startStatusFlag) ) {
                        Long[] resultj = new Long[2];
                        resultj[0] = dateLineActionList.get(j-1).getDateline();
                        resultj[1] = dateLineActionList.get(j).getDateline();
                        resultList.add(resultj);
                    }

                }
            } else {
                for (int j = 1; j < pairLenth-1; j+=2) {
                    if ( dateLineActionList.get(j-1).getAction() == Integer.parseInt(this.startStatusFlag) ) {
                        Long[] resultj = new Long[2];
                        resultj[0] = dateLineActionList.get(j-1).getDateline();
                        resultj[1] = dateLineActionList.get(j).getDateline();
                        resultList.add(resultj);
                    }
                }
            }
        }

        return resultList;


    }


}