package Warmup1;

/**
 * Created by v.usov on 18.07.2016.
 */
public class front22 {

    public static String front22(String str) {

        if (str.length()<2) return (str+str+str);
        else return (str.substring(0,2)+str+str.substring(0,2));

    }


}
