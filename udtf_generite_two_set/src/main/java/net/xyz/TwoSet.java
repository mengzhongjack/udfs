package net.xyz;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSON;

import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDTF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;

import java.util.*;

public class TwoSet extends GenericUDTF {


    private PrimitiveObjectInspector stringOI = null;

    @Override
    public StructObjectInspector initialize(ObjectInspector[] objectInspectors) throws UDFArgumentException {

        // 异常检测
        if (objectInspectors.length != 1) {
            throw new UDFArgumentException("NameParserGenericUDTF() takes exactly one argument");
        }

        if(objectInspectors[0].getCategory()!=ObjectInspector.Category.PRIMITIVE&&((PrimitiveObjectInspector) objectInspectors[0]).getPrimitiveCategory() != PrimitiveObjectInspector.PrimitiveCategory.STRING) {
            throw new UDFArgumentException("NameParserGenericUDTF() takes a string as a parameter");
        }

        //输入
        stringOI = (PrimitiveObjectInspector) objectInspectors[0];

        // 输出
        List<String> fieldNames = new ArrayList<String>(1);
        List<ObjectInspector> fieldOIs = new ArrayList<ObjectInspector>(1);

        // 输出列名
        fieldNames.add("ruleSetA");
//        fieldNames.add("ruleSetB");
        fieldOIs.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);
//        fieldOIs.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);
        return ObjectInspectorFactory.getStandardStructObjectInspector(fieldNames, fieldOIs);
    }


    @Override
    public void process(Object[] record) throws HiveException {

        final String feature = stringOI.getPrimitiveJavaObject(record[0]).toString();
        ArrayList<Object[]> results = parseInputRecord(feature);
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




//    /**
//     * 解析函数，将json格式字符格式化成多行数据
//     * @param feature
//     * @return
//     */
//    public ArrayList<Object[]> parseInputRecord(String feature){
//        ArrayList<Object[]> resultList = null;
//        try {
//            JSONObject json = JSON.parseObject(feature);
//            resultList = new ArrayList<Object[]>();
//            for (String nameSpace : json.keySet()) {
//                JSONObject dimensionJson = json.getJSONObject(nameSpace);
//                for (String dimensionName : dimensionJson.keySet()) {
//                    JSONObject featureJson = dimensionJson.getJSONObject(dimensionName);
//                    for (String featureName : featureJson.keySet()) {
//                        String property_name = nameSpace + ":" + dimensionName + ":" + featureName;
//                        Object[] item = new Object[2];
//                        item[0] = property_name;
//                        item[1] = featureJson.get(featureName);
//                        resultList.add(item);
//                    }
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return resultList;
//    }
    /**
          * 解析函数，将json格式字符格式化成多行数据
          * @param ruleListString
          * @return
          */
    public ArrayList<Object[]> parseInputRecord(String ruleListString){
        ArrayList<Object[]> resultList = null;
        try {

            List<String> ruleSetList = Arrays.asList(ruleListString.split(","));


            resultList = new ArrayList<Object[]>();

            if(ruleSetList.size()==1){
                String[] ruleSet = new String[1];
                ruleSet[0]=ruleListString+","+ruleListString;
//                ruleSet[1]=ruleListString;
                resultList.add(ruleSet);
                return resultList;
            }

            Collections.sort(ruleSetList);
            for ( int i=0;i<=ruleSetList.size()-1;i++ ) {
                for(int j=i+1;j<=ruleSetList.size()-1;j++){
//                    List<String> ruleSet =new ArrayList<String>();
//                    ruleSet.add("1");
                    String[] ruleSet = new String[1];
                    ruleSet[0]=(ruleSetList.get(i)+","+ruleSetList.get(j));
//                    ruleSet[1]=(ruleSetList.get(j));
//
                    resultList.add(ruleSet);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultList;
    }



    @Override
    public void close() throws HiveException {

    }
}