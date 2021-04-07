import net.xyz.TwoSet;
import org.junit.Test;

import java.util.ArrayList;

public class Test01 {

    TwoSet twoSet = new TwoSet();

    @Test
    public void testAdd() {
        ArrayList<Object[]>  result = twoSet.parseInputRecord("R01,R02,R03,R04,R05");

        for(Object[] s:result){
            for(Object t :s){
                System.out.print((String)t+" ");
            }
            System.out.print("\n");
        }
    }
}
