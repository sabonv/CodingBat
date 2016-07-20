package Warmup1;

/**
 * Created by v.usov on 20.07.2016.
 */
public class close10 {

    public static int close10(int a, int b) {

        if(Math.abs(10-a)==Math.abs(10-b)) return 0;
        if(Math.abs(10-a)>Math.abs(10-b)) return b;
        else return a;

    }

}
