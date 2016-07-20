package Warmup2;

/**
 * Created by v.usov on 20.07.2016.
 */
public class Allt_ask_in_one {

    public static String stringTimes(String str, int n) {
        String temp="";
        for (int i = 0; i < n; i++) {
            temp=temp+str;
        }
        return temp;
    }

    public static String frontTimes(String str, int n) {
        String temp = "";
        String result = "";
        if (str.length() < 3) temp = str;
        else temp = str.substring(0,3);
        for (int i = 0; i < n; i++) {
            result=result+temp;
        }
        return result;
    }

    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i)=='x'&&'x'==str.charAt(i+1)) count++;
        }
        return count;
    }

    public static boolean doubleX(String str) {
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i)=='x') {
                if ('x' == str.charAt(i + 1)) return true;
                else return false;
            }
        }
        return false;
    }

    public static String stringBits(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i+=2) {
            temp = temp + str.charAt(i);
        }
        return temp;
    }

    public static String stringSplosion(String str) {
        String temp="";
        for (int i = 1; i < str.length()+1; i++) {
            temp = temp + str.substring(0,i);
        }
        return temp;
    }

    public static int last2(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i,i+2).equals(str.substring(str.length()-2,str.length()))) count++;
        }
        return count;
    }

}
