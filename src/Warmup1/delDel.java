package Warmup1;

/**
 * Created by v.usov on 20.07.2016.
 */
public class delDel {

    public static String delDel(String str) {

        if(str.length()>=4&&str.substring(1,4).equals("del")) return str.substring(0,1)+str.substring(4,str.length());
        else return str;

    }

}
