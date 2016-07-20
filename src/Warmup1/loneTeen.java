package Warmup1;

/**
 * Created by v.usov on 20.07.2016.
 */
public class loneTeen {

    public static boolean loneTeen(int a, int b) {

        return (((a>=13 && a<=19)&&(b<13 || b>19))||((b>=13 && b<=19)&&(a<13 || a>19)));

    }

}
