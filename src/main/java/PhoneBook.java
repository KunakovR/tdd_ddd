import java.util.*;

public class PhoneBook {

    Map<String, String> storage = new TreeMap<>();
    Map<String, String> storageNext = new HashMap<>();

    public int add(String name, String num) {
        int val = 0;
        if (storage.containsKey(name) == true) {
            for (String sb : storage.keySet()) {
                val++;
            }
            return val;
        } else storage.put(name, num);
        storageNext.put(num, name);
        for (String sb2 : storage.keySet()) {
            val++;
        }
        return val;
    }

    public String findByNumber(String num) {
        return storageNext.get(num);
    }

    public String findByName(String name) {
        return null;
    }
}
