package Warmup1;

/**
 * Created by v.usov on 19.07.2016.
 */
public class startHi {

    public static boolean startHi(String str) {
        if (str.length()>=2)
        return (str.substring(0, 2).equals("hi"));
        else return false;
    }

}
