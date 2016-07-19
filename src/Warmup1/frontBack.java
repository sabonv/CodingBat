package Warmup1;

/**
 * Created by v.usov on 18.07.2016.
 */
public class frontBack {

    public static String frontBack(String str) {

        if (str.length()<=1) return str;
        else return (str.substring(str.length()-1)+ str.substring(1,str.length()-1)+str.substring(0,1));

    }

}
