package CodingPractice2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {

        String arr[] = {"java", "c", "c++", "java", "python", "c"};
        int ele[] = {1, 2, 2, 3, 4, 3, 4, 1, 6, 5, 7, 8, 2};

        Map<String, Integer> map=new HashMap<>();
        for(String s:arr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);

            } else {
                map.put(s, 1);

            }
        }
            for(String key:map.keySet())
            {
                if(map.get(key)>1)
                {
                    System.out.println(key+" "+map.get(key));
                }
            }


        }

    }














