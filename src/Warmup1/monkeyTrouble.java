package Warmup1;

/**
 * Created by v.usov on 18.07.2016.
 */
public class monkeyTrouble {

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        boolean result = false;

        if (((aSmile)&&(bSmile)) || ((!aSmile)&&(!bSmile)) ) result = true;

        return result;
    }

}
