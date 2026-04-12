package org.JavaProgram.TestComponent;

import org.checkerframework.checker.units.qual.C;

import java.util.HashMap;
import java.util.Set;

public class countCharacter {

    public static void main(String[] args) {
        String input = "Maharaja";
        HashMap<Character, Integer> map = new HashMap<>();

        char[] inputArray = input.toCharArray();

        for (char c : inputArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);

//Here, we are printing character and its count which occurs more than once.
        Set<Character> characterSet = map.keySet();
        for(Character ch : characterSet)
         {
           if(map.get(ch)>1)
           {
               System.out.println("Duplicate character: " +ch + "," +" Count: " +map.get(ch));

           }

        }
    }


}
