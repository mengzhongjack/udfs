import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName: udtf_time_series_online_offline
 * @Package: PACKAGE_NAME
 * @ClassName: Student
 * @Author: Tarzan
 * @Description:
 * @Date: 2021/3/5 15:32
 */
public class DateLineAction implements Comparable {

    private Long dateline;
    private int Action;

    public DateLineAction(Long dateline, int action) {
        this.dateline = dateline;
        Action = action;
    }

    @Override
    public int compareTo(Object o) {
        DateLineAction compareDateLineAction = (DateLineAction) o;
        return  (int)(this.dateline - compareDateLineAction.dateline);
    }

    @Override
    public String toString() {
        return String.valueOf(dateline)+
                ":"+ String.valueOf(Action);
    }

    public Long getDateline() {
        return dateline;
    }

    public void setDateline(Long dateline) {
        this.dateline = dateline;
    }

    public int getAction() {
        return Action;
    }

    public void setAction(int action) {
        Action = action;
    }

    public Long generaDateFirstTimeLine() throws ParseException {

        Date dt = new Date (this.dateline);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat simpleDateFormat_01 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");


        String datetime_YMD = sfd.format(dt);
//        System.out.println(datetime_YMD);


        Date date = simpleDateFormat_01.parse(datetime_YMD);

        long ts = date.getTime();
//        System.out.println(ts);
        return ts;
    }


    public Long generaDateLatestTimeLine() throws ParseException {

        Date dt = new Date (this.dateline);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat simpleDateFormat_01 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");


        String datetime_YMD = sfd.format(dt);
//        System.out.println(datetime_YMD);


        Date date = simpleDateFormat.parse(datetime_YMD+" 23:59:59");

        long ts = date.getTime();
//        System.out.println(ts);
        return ts;
    }
    }
