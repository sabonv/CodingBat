package Warmup1;

/**
 * Created by v.usov on 20.07.2016.
 */
public class max1020 {

    public static int max1020(int a, int b) {

        if ((a<10||a>20)&&(b<10||b>20)) return 0;
        else if ((a>=10&&a<=20)&&(b>=10&&b<=20)) {
            if(a>b) return a;
            else return b;
        }
        if ((a<10||a>20)&&(b>=10&&b<=20)) return b;
        else return a;


    }


}
