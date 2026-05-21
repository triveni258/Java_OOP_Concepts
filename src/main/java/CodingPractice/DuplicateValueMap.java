package CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateValueMap {
    public static void main(String[] args) {
        String input = "automation";
        char ch[] = input.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " = " + map.get(key));
            }
        }
        //another easy example
        String input1 = "maharaja";
        Map<Character, Integer> map1 = new HashMap<>();
        for (char ch1 : input1.toCharArray()) {
            if (map1.containsKey(ch1)) {
                map1.put(ch1, map1.get(ch1) + 1);
            } else {
                map1.put(ch1, 1);
            }
        }
        for (char key1 : map1.keySet())
        {

            if (map1.get(key1) > 1) {
                System.out.println("Duplicate charcters from maharaja string is:");
                System.out.println(key1 + " = "+map1.get(key1));
            }
        }

    }


}

