package Warmup1;

/**
 * Created by v.usov on 19.07.2016.
 */
public class icyHot {

    public static boolean icyHot(int temp1, int temp2) {

        return ((temp1<0 || temp2<0) && ((temp1>100 || temp2>100)));

    }

}
