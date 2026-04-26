package org.JavaProgram.TestComponent;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateUniqueList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,4,3,5,6,7,7,5,3,4,4);
        Map<Integer,Integer> map=new HashMap<>();
        for(Integer num:list) {

            if (map.containsKey((num))) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
            for(Integer key :map.keySet())
            {
                if(map.get(key)>1)
                {
                    System.out.println(key+"="+map.get(key));
                }
            }
        System.out.println("Unique values in the list are:");
            for (Integer uniqueValue: map.keySet())
            {
                if (map.get(uniqueValue)==1)
                {
                    System.out.println(uniqueValue+"="+map.get(uniqueValue));
                }
            }
        }

    }

