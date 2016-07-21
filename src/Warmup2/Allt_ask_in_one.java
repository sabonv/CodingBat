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

    public static int arrayCount9(int[] nums) {
        int count=0;
        for(Integer temp: nums){
            if(temp==9) count++;
        }
        return count;
    }

    public static boolean arrayFront9(int[] nums) {
        int n;
        if(nums.length<4) n = nums.length;
        else n = 4;
        for (int i = 0; i < n; i++) {
            if(nums[i]==9) return true;
        }
        return false;
    }

    public static boolean array123(int[] nums) {
        for(int n = 0; n<nums.length-2; n++){
            if(nums[n]==1){
                if(nums[n+1]==2){
                    if(nums[n+2]==3) return true;
                }
            }
        }
        return false;
    }

    public static int stringMatch(String a, String b) {
        int count = 0;
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len-1; i++) {
            if(a.substring(i,i+2).equals(b.substring(i,i+2)))count++;
        }
        return count;
    }

    public static String stringX(String str) {
        if (str.length()<3)return str;
        String temp = str.substring(0,1);
        for (int i = 1; i < str.length()-1; i++) {
            if(!str.substring(i,i+1).equals("x")) temp = temp +str.substring(i,i+1);
        }
        return temp = temp+str.substring(str.length()-1,str.length());
    }

    public static String altPairs(String str) {
        String temp="";
        for (int i = 0; i < str.length(); ) {
            if(i+2>str.length())temp = temp + str.substring(i,i+1);
            else temp = temp + str.substring(i,i+2);
            i+=4;
        }
        return temp;
    }

    public static String stringYak(String str) {
        String temp="";
        for (int i = 0; i < str.length()-1; i++) {
            if (i!=str.length()-2) {
                if(str.substring(i, i+3).equals("yak")) i+=2;
                else temp = temp + str.substring(i,i+1);
            }
            else temp = temp + str.substring(str.length()-2,str.length());
        }
        return temp;
    }


}
