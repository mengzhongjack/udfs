import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Test03 {

    @Test
    public void test01CheckFormat() throws ParseException {
        DateLineAction dateLineAction = new DateLineAction(1613149342045L,4);
        dateLineAction.generaDateFirstTimeLine();
    }

    @Test
    public void test02CheckFormat() throws ParseException {
        DateLineAction dateLineAction = new DateLineAction(1613149342045L,4);
        Long sss = dateLineAction.generaDateLatestTimeLine();
        System.out.println(sss);
    }



    @Test
    public void  test04sortToPairs(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        SimpleDateFormat dt=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        DataLineOnOff dataLineOnOff = new DataLineOnOff();
        try {
//
//            50afbd47c8b391841kzF38	1613146689842	2021-02-13 00:18:09	4
//            50afbd47c8b391841kzF38	1613149342045	2021-02-13 01:02:22	4
//            50afbd47c8b391841kzF38	1613189729618	2021-02-13 12:15:29	4
//            50afbd47c8b391841kzF38	1613282752966	2021-02-14 14:05:52	3
//            50afbd47c8b391841kzF38	1613285728700	2021-02-14 14:55:28	4
//            50afbd47c8b391841kzF38	1613285777707	2021-02-14 14:56:17	3

//            --2021-02-14 14:05:52--2021-02-14 14:55:28
            String[] datetimeStringList = {
                     "1613146689842:4"
                    ,"1613149342045:4"
                    ,"1613189729618:4"
                    ,"1613282752966:3"
                    ,"1613285728700:4"
                    ,"1613285777707:3"
            };
            ArrayList<Object[]> resultList = dataLineOnOff.sortToPairs(datetimeStringList);
            for (Object[] resulti: resultList){
                String s0 = datetime.format(resulti[0]);
                String s1 = datetime.format(resulti[1]);
                System.out.println(resulti[0]+"--"+s0+"==========="+resulti[1]+"--"+s1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }



}







