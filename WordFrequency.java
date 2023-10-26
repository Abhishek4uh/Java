import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "Hello World World";
        wordCount(text);
    }

    public static void wordCount(String name) {
        String[] wordArray = name.split(" ");
        HashMap<String, Integer> record = new HashMap<>();
        for (String str : wordArray) {
            if (record.containsKey(str)) {
                record.put(str, record.get(str) + 1);
            } else {
                record.put(str, 1);
            }
        }
        System.out.println(record);
    }
}
