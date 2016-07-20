package Warmup1;

/**
 * Created by v.usov on 18.07.2016.
 */
public class notString {

    public static String notString(String str) {

        if(str.length()>=3) {
            String temp = str.substring(0, 3);
            if (temp.equals("not")) return str;

        }
        return ("not " + str);

    }

}
