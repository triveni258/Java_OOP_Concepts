package org.JavaProgram.TestComponent;

import java.util.*;

public class ListDuplicateValues {

        public static void main(String[] args)
        {
            // remove duplicate values from list
            //Logic: convert list to set and set will remove duplicate values
            List<Integer> list =  Arrays.asList(1,2,3,4,4,3,5,6,7,7,5);
            Set<Integer> set = new LinkedHashSet<>(list);
            // linked hash set will maintain the insertion order of the list and remove duplicate values
            System.out.println(set);



        }

}
