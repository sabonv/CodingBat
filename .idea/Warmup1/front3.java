package Warmup1;

/**
 * Created by v.usov on 18.07.2016.
 */
public class front3 {

    public static String front3(String str) {

        if(str.length()<3) return (str+str+str);
        else return (str.substring(0,3)+str.substring(0,3)+str.substring(0,3));

    }

}
