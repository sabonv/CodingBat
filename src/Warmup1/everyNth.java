package Warmup1;

/**
 * Created by v.usov on 20.07.2016.
 */
public class everyNth {

    public static String everyNth(String str, int n) {
        String temp="";
        if (str.length()!=0&&n>=1){

            for (int i = 0; i < str.length();) {
                temp = temp + str.charAt(i);
                i=i+n;
            }

        }
        return temp;
    }

}
