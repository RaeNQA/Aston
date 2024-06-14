package task1;

import java.util.HashMap;
import java.util.Map;

public class WordsCounter {
    public static void main(String[] args) {
        String[] words = {
                "имя", "фамилия", "отчество", "дата", "счет",
                "имя", "пол", "расса", "класс", "страна",
                "город", "еда", "оружие", "класс", "дата"
        };

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        System.out.println("Количество повторений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
