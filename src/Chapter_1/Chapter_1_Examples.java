package Chapter_1;
import java.util.*;

public class Chapter_1_Examples {
    public static void main(String[] args){
        String[] words = {"how ", "are "};
        String[] more = {"you ", "my ", "dude "};

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("ArrayLists: ");
        System.out.println(merge(words, more));

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("Without StringBuilder: ");
        System.out.println(joinWords(words));

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("With StringBuilder: ");
        System.out.println(joinWordsBuilder(more));


    }

    static ArrayList<String> merge(String[] words, String[] more){
        ArrayList<String> sentence = new ArrayList<String>();
        for (String w: words) sentence.add(w);
        for (String w: more) sentence.add(w);
        return sentence;
    }

    static String joinWords(String[] words){
        String sentence = "";
        for (String w: words){
            sentence = sentence + w;
        }
        return sentence;
    }

    static String joinWordsBuilder(String[] words){
        StringBuilder sentence = new StringBuilder();
        for (String w: words) {
            sentence.append(w);
        }
        return sentence.toString();
    }
}
