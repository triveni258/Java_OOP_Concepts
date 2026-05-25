package CodingPractice;

import org.checkerframework.checker.units.qual.C;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countCharacter {

    public static void main(String[] args) {
//        String input = "Maharaja";
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        char[] inputArray = input.toCharArray();
//
//        for (char c : inputArray) {
//            if (map.containsKey(c)) {
//                map.put(c, map.get(c) + 1);
//            } else {
//                map.put(c, 1);
//            }
//        }
//        System.out.println(map);
//
////Here, we are printing character and its count which occurs more than once.
//        Set<Character> characterSet = map.keySet();
//        for(Character ch : characterSet)
//         {
//           if(map.get(ch)>1)
//           {
//               System.out.println("Duplicate character: " +ch + "," +" Count: " +map.get(ch));
//
//           }
//
//        }

//        //CountCharactor Using map to find duplicate charactor
//        String name= "Maharajaji";
//        Map<Character, Integer> map1= new HashMap<>();
//        for(char c: name.toCharArray())
//        {
//
//            if(map1.containsKey(c))
//            {
//                map1.put(c,map1.get(c)+1);
//            }
//            else{
//                map1.put(c,1);
//            }
//
//        }
//        for(char ch:map1.keySet())
//        {
//            if(map1.get(ch)>1)
//            {
//                System.out.println(ch+" "+map1.get(ch));
//            }
//        }

        String name="Maharajaji";
        Map<Character, Integer> map1= new HashMap<>();
        for(char c: name.toCharArray())
        {

            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char key: map1.keySet())
        {
            if(map1.get(key)>1)
            {
                System.out.println(key+ " " +map1.get(key));

            }}


    }


}
