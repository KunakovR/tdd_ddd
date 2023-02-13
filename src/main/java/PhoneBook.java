import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, String> storage = new HashMap<>();

    public int add(String name, String num) {
        int val = 0;
        if (storage.containsKey(name) == true) {
            for (String sb : storage.keySet()){
                val++;
            }
            return val;
        }
        else storage.put(name, num);
        for (String sb2 : storage.keySet()){
            val++;
        }
        return val;
    }

    public String findByNumber(String num) {
        return null;
    }
}
