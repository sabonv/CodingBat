package Warmup1;

/**
 * Created by v.usov on 20.07.2016.
 */
public class stringE {

    public static boolean stringE(String str) {

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='e') count++;
        }
        return ((count>=1)&&(count<=3));

    }


}
