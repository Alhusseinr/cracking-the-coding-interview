package LeetCode.Month_Daily_Challenge;
import java.util.*;

public class BackpaceStringCompare {
    public static void main(String[] args){
        String str = "ab#c";
        String str2 = "ab#c";
        System.out.println(BackpaceStringCompare(str));
    }
    public static boolean BackpaceStringCompare(String str){
        String str2 = "";

        int i = str.length() - 1;
        if(str.charAt(i) == '#' || str.charAt(i - 1) == '#'){

        }
        return true;
    }
}
