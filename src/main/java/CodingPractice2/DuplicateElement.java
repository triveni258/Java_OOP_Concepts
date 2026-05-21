package CodingPractice2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {

        String arr[] = {"java", "c", "c++", "java", "python", "c"};
        int ele[] = {1, 2, 2, 3, 4, 3, 4, 1, 6, 5, 7, 8, 2};

        Set<Integer> map = new HashSet<>();
        for (int n : ele) {
            if (map.contains(n)) {
                System.out.println("Duplicate element: " + n);
            } else {
                map.add(n);
            }


        }

    }
}













