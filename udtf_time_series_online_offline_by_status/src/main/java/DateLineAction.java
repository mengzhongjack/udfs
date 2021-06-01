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
}