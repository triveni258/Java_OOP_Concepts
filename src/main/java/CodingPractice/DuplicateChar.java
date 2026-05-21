package CodingPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DuplicateChar {
    public static void main(String[] args) {
    String input="Automation";
    Map<Character, Integer> map= new HashMap<>();
    for(char c:input.toLowerCase().toCharArray())
    {
       if(map.containsKey(c))
       {
           map.put(c, map.get(c)+1);
       }
       else {
           map.put(c,1);
       }
    }
    for(char ch : map.keySet())
    {
        if(map.get(ch)==1)
        {
            System.out.println(ch+" = "+map.get(ch));
        }
    }
}}
