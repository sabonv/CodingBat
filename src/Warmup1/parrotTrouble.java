package Warmup1;

/**
 * Created by v.usov on 18.07.2016.
 */
public class parrotTrouble {

    public static boolean parrotTrouble(boolean talking, int hour) {

        boolean result = false;
        if ((hour<7 || hour>20)&&talking) result = true;
        return result;
    }
}
