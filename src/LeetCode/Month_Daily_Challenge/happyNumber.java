package LeetCode.Month_Daily_Challenge;
import java.util.*;

public class happyNumber {
    public static void main(String[] args){
        int n = 19;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        if (n == 0)
            return false;

        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);

        while(true){
            if(n == 1)
                return true;

            n = sumDigitsSquare(n);

            if(set.contains(n) && n != (int)set.toArray()[set.size() - 1])
                return false;

            set.add(n);
        }
    }
    static int sumDigitsSquare(int n) {
        int n2 = 0;
        while (n > 0){
            int digit = n % 10;
            n2 += digit * digit;
            n = n / 10;
        }
        return n2;
    }
}
