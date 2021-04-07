import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Test01 {


    @Test
    public void testSort(){
        ArrayList<DateLineAction> arraylist = new ArrayList<DateLineAction>();
        arraylist.add(new DateLineAction(223L, (short) 26));
        arraylist.add(new DateLineAction(245L, (short) 24));
        arraylist.add(new DateLineAction(209L, (short) 32));
        Collections.sort(arraylist);
        for (DateLineAction str : arraylist) {
            System.out.println(str);
        }
    }




    @Test
    public void  test03generateDateList(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        SimpleDateFormat dt=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        SortDateLineAndStatusIntoPairs sortDateLineAndStatusIntoPairs = new SortDateLineAndStatusIntoPairs();
        try {
//            50afbd47c8b391841kzF38	1613143598179	2021-02-12 23:26:38	4
//            50afbd47c8b391841kzF38	1613146689842	2021-02-13 00:18:09	4
//            50afbd47c8b391841kzF38	1613149342045	2021-02-13 01:02:22	4
//            50afbd47c8b391841kzF38	1613189729618	2021-02-13 12:15:29	4
//            50afbd47c8b391841kzF38	1613282752966	2021-02-14 14:05:52	3
//            50afbd47c8b391841kzF38	1613285728700	2021-02-14 14:55:28	4
            String[] datetimeStringList = {"1613143598179:4"
                    ,"1613146689842:4"
                    ,"1613149342045:4"
                    ,"1613189729618:4"
                    ,"1613282752966:3"
                    ,"1613285728700:4"
            };
            ArrayList<Object[]> resultList = sortDateLineAndStatusIntoPairs.sortToPairs(datetimeStringList);
            for (Object[] resulti: resultList){
                String s0 = datetime.format(resulti[0]);
                String s1 = datetime.format(resulti[1]);
                System.out.println("--"+s0+"--"+s1);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }



    @Test
    public void  test04sortToPairs(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        SimpleDateFormat dt=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        SortDateLineAndStatusIntoPairs sortDateLineAndStatusIntoPairs = new SortDateLineAndStatusIntoPairs();
        try {
//            50afbd47c8b391841kzF38	1613143598179	2021-02-12 23:26:38	4
//            50afbd47c8b391841kzF38	1613146689842	2021-02-13 00:18:09	4
//            50afbd47c8b391841kzF38	1613149342045	2021-02-13 01:02:22	4
//            50afbd47c8b391841kzF38	1613189729618	2021-02-13 12:15:29	4
//            50afbd47c8b391841kzF38	1613282752966	2021-02-14 14:05:52	3
//            50afbd47c8b391841kzF38	1613285728700	2021-02-14 14:55:28	4
//            50afbd47c8b391841kzF38	1613285777707	2021-02-14 14:56:17	3

            String[] datetimeStringList = {
                     "1613143598179:4"
                    ,"1613146689842:4"
                    ,"1613149342045:4"
                    ,"1613189729618:4"
                    ,"1613282752966:3"
                    ,"1613285728700:4"
                    ,"1613285777707:3"
            };
            ArrayList<Object[]> resultList = sortDateLineAndStatusIntoPairs.sortToPairs(datetimeStringList);
            for (Object[] resulti: resultList){
                String s0 = datetime.format(resulti[0]);
                String s1 = datetime.format(resulti[1]);
                System.out.println("--"+s0+"--"+s1);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    @Test
    public void  test05sortToPairs(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        SimpleDateFormat dt=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        SortDateLineAndStatusIntoPairs sortDateLineAndStatusIntoPairs = new SortDateLineAndStatusIntoPairs();
        try {
//            50afbd47c8b391841kzF38	1613294736150	2021-02-14 17:25:36	3
//            50afbd47c8b391841kzF38	1613297367128	2021-02-14 18:09:27	4
//            50afbd47c8b391841kzF38	1613297412766	2021-02-14 18:10:12	3
//            50afbd47c8b391841kzF38	1613298056533	2021-02-14 18:20:56	4
//            50afbd47c8b391841kzF38	1613446558824	2021-02-16 11:35:58	4


            String[] datetimeStringList = {
                     "1613294736150:3"
                    ,"1613297367128:4"
                    ,"1613297412766:3"
                    ,"1613298056533:4"
                    ,"1613446558824:4"
            };
            ArrayList<Object[]> resultList = sortDateLineAndStatusIntoPairs.sortToPairs(datetimeStringList);
            for (Object[] resulti: resultList){
                String s0 = datetime.format(resulti[0]);
                String s1 = datetime.format(resulti[1]);
                System.out.println("--"+s0+"--"+s1);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }



    @Test
    public void  test06sortToPairs(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        SimpleDateFormat dt=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        SortDateLineAndStatusIntoPairs sortDateLineAndStatusIntoPairs = new SortDateLineAndStatusIntoPairs();
        try {
//            50afbd47c8b391841kzF38	1613297367128	2021-02-14 18:09:27	4
//            50afbd47c8b391841kzF38	1613297412766	2021-02-14 18:10:12	3
//            50afbd47c8b391841kzF38	1613298056533	2021-02-14 18:20:56	4
//            50afbd47c8b391841kzF38	1613446558824	2021-02-16 11:35:58	4
//            50afbd47c8b391841kzF38	1613455291545	2021-02-16 14:01:31	3
//            50afbd47c8b391841kzF38	1613455349513	2021-02-16 14:02:29	3
//            50afbd47c8b391841kzF38	1613455427021	2021-02-16 14:03:47	3
//            50afbd47c8b391841kzF38	1613460278850	2021-02-16 15:24:38	4
//            50afbd47c8b391841kzF38	1613460414397	2021-02-16 15:26:54	3
//            50afbd47c8b391841kzF38	1613460718419	2021-02-16 15:31:58	4
//            50afbd47c8b391841kzF38	1613460720344	2021-02-16 15:32:00	4
//            50afbd47c8b391841kzF38	1613460731304	2021-02-16 15:32:11	3



            String[] datetimeStringList = {
                     "1613297367128:4"
                    ,"1613297412766:3"
                    ,"1613298056533:4"
                    ,"1613446558824:4"
                    ,"1613455291545:3"
                    ,"1613455349513:3"
                    ,"1613455427021:3"
                    ,"1613460278850:4"
                    ,"1613460414397:3"
                    ,"1613460718419:4"
                    ,"1613460720344:4"
                    ,"1613460731304:3"
            };
            ArrayList<Object[]> resultList = sortDateLineAndStatusIntoPairs.sortToPairs(datetimeStringList);
            for (Object[] resulti: resultList){
                System.out.println("--"+resulti[0]+"--"+resulti[1]);
                String s0 = datetime.format(resulti[0]);
                String s1 = datetime.format(resulti[1]);
                System.out.println("--"+s0+"--"+s1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}







