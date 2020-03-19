package Chapter_1;
import java.util.*;

public class Chapter_1_Questions {
    public static void main(String[] args){
        System.out.println("---------------------------");
        System.out.println("isUnique: ");
        String word = "ljksfyhasd";
        System.out.println(isUnique(word));

        System.out.println("---------------------------");
        System.out.println("isPermutation: ");
        String w1 = "ABC";
        String w2 = "CBA";
        System.out.println(isPermutation(w1, w2));

        System.out.println("---------------------------");
        System.out.println("URLify: ");
        String w3 = "Mr John Smith";
        System.out.println(URLify(w3) + ' ' + w3.length());

    }

    static boolean isUnique(String w) {
        boolean Unique = true;
        for(int i = 1; i < w.length(); i++){
            int t = i -1;
            if(w.charAt(i) == w.charAt(t)){
                Unique = false;
            }
        }
        return Unique;
    }

    static boolean isPermutation(String str1, String str2){
        boolean Permutation = true;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i < str1.length(); i++){
            if(arr1[i] != arr2[i]){
                Permutation = false;
            }
        }
        return Permutation;
    }

    static String URLify(String w){
        StringBuilder sentence = new StringBuilder();

        char[] arr1 = w.toCharArray();
        for (char c: arr1){
            if(c == ' '){
                sentence.append("%20");
            } else {
                sentence.append(c);
            }
        }
        return sentence.toString();
    }

}
