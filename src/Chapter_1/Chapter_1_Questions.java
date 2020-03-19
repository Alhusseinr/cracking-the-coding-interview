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

        System.out.println("---------------------------");
        System.out.println("Palindrome Permutation: ");
        String w4 = "tactcoa";
        System.out.println(PalindromePermutation(w4));

        System.out.println("---------------------------");
        System.out.println("One Way: ");
        String w5 = "pale";
        String w6 = "bake";
        System.out.println(OneWay(w5, w6));

    }

    // 1.1
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

    // 1.2
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

    // 1.3
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

    //1.4
    static boolean PalindromePermutation(String w){
         HashMap<Character, Integer> hash = new HashMap<>();

         for(int i = 0; i < w.length(); i++ ){
             hash.put(w.charAt(i), hash.getOrDefault(w.charAt(i), 0) + 1);
         }
         int count = 0;
         for(char k: hash.keySet()){
             count += hash.get(k) % 2;
         }

         if(count <= 1){
             return true;
         }else{
             return false;
         }
    }

    // 1.5
    static boolean OneWay(String w1, String w2){
        int v1 = w1.length();
        int v2 = w2.length();

        if(Math.abs(v1 - v2) > 1){
            return false;
        }

//        HashMap<Character, Character> v1hashMap = new HashMap<>();
//        for(int i = 0; i < w1.length(); i++){
//            v1hashMap.put(w1.charAt(i), w1.charAt(i));
//        }
//
//        HashMap<Character, Character> v2hashMap = new HashMap<>();
//        for(int i = 0; i < w2.length(); i++){
//            v2hashMap.put(w2.charAt(i), w2.charAt(i));
//        }
//
//        for(char k: v1hashMap.keySet()){
//            for (char c: v2hashMap.keySet()){
//                if(v1hashMap.get(k) != v2hashMap.get(c)){
//                    return false;
//                }
//            }
//        }

        int editCount = 0;
        int i = 0;
        int j = 0;
        while(i < v1 && j < v2){
            if(w1.charAt(i) != w2.charAt(j)){
                if(editCount == 1){
                    return false;
                }

                if(v1 > v2){
                    i++;
                } else if (v1 < v2) {
                    j++;
                } else {
                    i++;
                    j++;
                }

                editCount++;
            } else {
                i++;
                j++;
            }
        }

        if(i < v1 || j < v2){
            editCount++;
        }

        return true;
    }
}
