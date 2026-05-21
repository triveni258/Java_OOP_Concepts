package CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMap_5 {
    public static void main(String[] args) {
        //count the character in the string
        String input = "automation";
    char c[] = input.toCharArray();
    Map<Character, Integer> map = new HashMap<>();
    for(char ch: c)
    {
        map.put(ch, map.getOrDefault(ch,0)+1);
    }
    for(char key: map.keySet())
    {
        System.out.println(key + map.get(key));
    }

    }
}
