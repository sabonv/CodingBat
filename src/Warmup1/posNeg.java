package Warmup1;

/**
 * Created by v.usov on 18.07.2016.
 */
public class posNeg {

    public static boolean posNeg(int a, int b, boolean negative) {

        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }

    }

}
