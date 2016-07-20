package Warmup1;

/**
 * Created by v.usov on 20.07.2016.
 */
public class endUp {

    public static String endUp(String str) {

        String temp;
        if(str.length()<=3) temp=str.toUpperCase();
        else temp=str.substring(0,str.length()-3)+str.substring(str.length()-3,str.length()).toUpperCase();
        return temp;

    }

}
