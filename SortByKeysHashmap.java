import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 3);
        hashMap.put("kiwi", 3);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 1);
        hashMap.put("Date", 4);

        System.out.println(hashMap);


        ArrayList<String> keys = new ArrayList<>(hashMap.keySet());
        Collections.sort(keys);

        HashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (String key : keys) {
            sortedMap.put(key, hashMap.get(key));
        }

    
        System.out.println(sortedMap);
    }
}
