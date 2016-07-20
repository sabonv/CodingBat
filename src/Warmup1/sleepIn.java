package Warmup1;

/**
 * Created by v.usov on 18.07.2016.
 */
public class sleepIn {

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        boolean result = false;
        if((!weekday) || (vacation)) result = true;
        return result;
    }

}
