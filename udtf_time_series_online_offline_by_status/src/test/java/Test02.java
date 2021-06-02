import org.junit.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: DataLineOnOff
 * @Package: PACKAGE_NAME
 * @ClassName: Test02
 * @Author: Tarzan
 * @Description:
 * @Date: 2021/6/1 16:47
 */
public class Test02 {


    @Test
    public void  test07sortToPairs(){
        try {
            String filePath = "src/test/resources/test02.txt";
            File file=new File(filePath);
            SimpleDateFormat dateTimeFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            if(file.isFile() && file.exists()) { //判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file));//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;


                List<String> listDatelineString =new ArrayList<String>();
                String[] datetimeStringList = new String[142];
                Integer lineCount = 0 ;
                while ((lineTxt = bufferedReader.readLine()) != null) {

                    String[] lineTxtArray = lineTxt.split("\t");
                    listDatelineString.add( lineTxtArray[2] +":" + lineTxtArray[4] ) ;
                    datetimeStringList[lineCount] = lineTxtArray[2] +":" + lineTxtArray[4];
                    lineCount += 1 ;
                }
                read.close();
//                String[] datetimeStringList = (String[])listDatelineString.toArray();



                DataLineOnOff dataLineOnOff = new DataLineOnOff();
                ArrayList<Object[]> resultList = dataLineOnOff.sortToPairs(datetimeStringList);
                for (Object[] resulti: resultList){
//                    System.out.println("--"+resulti[0]+"--"+resulti[1]);
                    String s0 = dateTimeFormat.format(resulti[0]);
                    String s1 = dateTimeFormat.format(resulti[1]);
                    System.out.println("--"+s0+"--"+s1);
                }
            } else {
                System.out.println("not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
