package Task1;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "avocado", "apricot", "banana", "date", "fig", "kiwi", "apricot", "lemon", "pear", "date", "mango", "peach", "grapes", "papaya", "fig", "nectarine", "date", "lime", "apricot");
        Set<String> unique = new HashSet<String>(words);
        System.out.println("Список слов: " + words.toString());
        System.out.println("Список уникальных слов: " + unique.toString());
        for (String key : unique) {
            System.out.println("Частота повторения: " + key + ": " + Collections.frequency(words, key));
        }
    }
}
