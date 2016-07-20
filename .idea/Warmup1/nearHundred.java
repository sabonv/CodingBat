package Warmup1;

/**
 * Created by v.usov on 18.07.2016.
 */
public class nearHundred {

    public static boolean nearHundred(int n) {

        //в пределах 10 от точки 100 или 200
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));

    }

}
