import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateAdd {

//    public static void main(String[] arg){
//        Date now = new Date();
//
//        addAndSubtractDaysByGetTime(now,-5);
//        addAndSubtractDaysByGetTime(now,5);
//        addAndSubtractDaysByCalendar(now,-5);
//        addAndSubtractDaysByCalendar(now,5);
//    }

    public static Date addAndSubtractDaysByGetTime(Date dateTime/*待处理的日期*/,int n/*加减天数*/){

        //日期格式
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(df.format(new Date(dateTime.getTime() + n * 24 * 60 * 60 * 1000L)));
        //System.out.println(dd.format(new Date(dateTime.getTime() + n * 24 * 60 * 60 * 1000L)));
        //注意这里一定要转换成Long类型，要不n超过25时会出现范围溢出，从而得不到想要的日期值
        return new Date(dateTime.getTime() + n * 24 * 60 * 60 * 1000L);
    }

    public static Date addAndSubtractDaysByCalendar(Date dateTime/*待处理的日期*/,int n/*加减天数*/){

        //日期格式
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        java.util.Calendar calstart = java.util.Calendar.getInstance();
        calstart.setTime(dateTime);

        calstart.add(java.util.Calendar.DAY_OF_WEEK, n);

        System.out.println(df.format(calstart.getTime()));
        //System.out.println(dd.format(calstart.getTime()));
        return calstart.getTime();
    }

    public static Long generateInstanceStartDate(Long LongTimeMillisecond){
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String s = df.format(LongTimeMillisecond);

        try {
            return df.parse(s).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return  null;
        }
    }

    public static Long generateInstanceEndDate(Long LongTimeMillisecond) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String s = df.format(LongTimeMillisecond);

        try {
            return df.parse(s).getTime() + (86400 * 1000-1);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}

    //日期格式
//    SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
//    SimpleDateFormat dd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");