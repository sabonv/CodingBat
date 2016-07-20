package Warmup1;

/**
 * Created by v.usov on 20.07.2016.
 */
public class lastDigit {

    public static boolean lastDigit(int a, int b) {

        while (a>=10||b>=10){
            if(a>=10) a=a%10;
            if(b>=10) b=b%10;
        }

        return a == b;
    }

}
