package CodingPractice2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;



public class DuplicateChar {
    public static void main(String[] args) {
        String input ="Automation";
        char[] inputArray=input.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for( char c: inputArray)
        {
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);

            }
            else{
                map.put(c,1);

            }

        }
        System.out.println(map);
        //print only duplicate characters and its count
        Set<Character> charSet = map.keySet();
        for(Character ch: charSet){
            if (map.get(ch)>1)
            {
                System.out.println(ch +" = "+ map.get(ch));
            }

        }

    }
}
