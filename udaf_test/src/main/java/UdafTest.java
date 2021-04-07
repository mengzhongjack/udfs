import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDTF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UdafTest extends GenericUDTF {


    private PrimitiveObjectInspector stringOI = null;


    /**
     *对传入的参数进行初始化
     *判断参数个数/类型
     * 初始化表结构
     */
    @Override
    public StructObjectInspector initialize(ObjectInspector[] objectInspectors) throws UDFArgumentException {

        // 异常检测
        if ( objectInspectors.length != 2 ) {
            throw new UDFArgumentException("NameParserGenericUDTF() takes exactly two argument");
        }

        if (objectInspectors[0].getCategory() != ObjectInspector.Category.PRIMITIVE && ((PrimitiveObjectInspector) objectInspectors[0]).getPrimitiveCategory() != PrimitiveObjectInspector.PrimitiveCategory.STRING) {
            throw new UDFArgumentException("NameParserGenericUDTF() takes a string as a parameter");
        }

        if (objectInspectors[1].getCategory() != ObjectInspector.Category.PRIMITIVE && ((PrimitiveObjectInspector) objectInspectors[1]).getPrimitiveCategory() != PrimitiveObjectInspector.PrimitiveCategory.STRING) {
            throw new UDFArgumentException("NameParserGenericUDTF() takes a string as a parameter");
        }



        //输入
        stringOI = (PrimitiveObjectInspector) objectInspectors[0];

        // 输出
        //初始化表结构
        //创建数组列表存储表字段
        List<String> fieldNames = new ArrayList<String>(3);
        List<ObjectInspector> fieldOIs = new ArrayList<ObjectInspector>(3);

        // 输出列名
        fieldNames.add("start_time_split");
        fieldNames.add("end_time_split");
        fieldNames.add("duration_split");

        //创建数组列表存储表字段
        fieldOIs.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);
        fieldOIs.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);
        fieldOIs.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);
        return ObjectInspectorFactory.getStandardStructObjectInspector(fieldNames, fieldOIs);
    }


    @Override
    public void process(Object[] record) throws HiveException {


//
        final String inputStartTimeString= stringOI.getPrimitiveJavaObject(record[0]).toString();
        final String inputEndTimeString = stringOI.getPrimitiveJavaObject(record[1]).toString();


        try {
            if (record[0] == null || record[1] == null) {

                ArrayList<Object[]> results = new ArrayList<Object[]>();

                Iterator<Object[]> it = results.iterator();
                while (it.hasNext()) {
                    try {
                        Object[] r = it.next();
                        forward(r);
                    } catch (HiveException e) {
                        e.printStackTrace();
                    }
                }
            }

            System.out.println("+==============inputStartTimeString:*************");
            System.out.println(inputStartTimeString);

            System.out.println("+==============inputEndTimeString:*************");
            System.out.println(inputEndTimeString);


            ArrayList<Object[]> results = parseInputRecord(inputStartTimeString, inputEndTimeString);

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


    /**
     * 生成多列数据
     *
     * @param inputStartTimeString
     * @param inputEndTimeString
     * @return
     */
    public ArrayList<Object[]> parseInputRecord(String inputStartTimeString, String inputEndTimeString) throws Exception{

        ArrayList<Object[]> resultList = new ArrayList<Object[]>();
        String[] result = new String[3];
        result[0]= "123";
        result[1]= "456";
        result[2]= "789";
        resultList.add(result);

        return resultList;

    }



    @Override
    public void close() throws HiveException {

    }

}