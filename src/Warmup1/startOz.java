package Warmup1;

/**
 * Created by v.usov on 20.07.2016.
 */
public class startOz {

    public static String startOz(String str) {
        String temp="";
        if(str.length()!=0) {
            if (str.substring(0, 1).equals("o")) temp = temp + "o";
        }
        if(str.length()>=2) {
            if (str.substring(1, 2).equals("z")) temp = temp + "z";
        }

        return temp;

    }

}
