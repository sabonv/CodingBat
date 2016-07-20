package Warmup1;

/**
 * Created by v.usov on 18.07.2016.
 */
public class missingChar {

    public static String missingChar(String str, int n) {

        return (str.substring(0,n)+str.substring(n+1,str.length()));

    }

}
