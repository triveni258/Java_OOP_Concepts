package rahulShettyAcademy;

import java.util.HashMap;

public class FrequencyOfChractor {
    public static void main(String[] args) {
        String name ="madam";
        char inutArray[]=name.toCharArray();
        HashMap<Character, Integer> freqyencyMap=new HashMap<Character, Integer>();
        for( char charactor : inutArray)
        {
            System.out.println(charactor);
            freqyencyMap.put(charactor, freqyencyMap.getOrDefault(charactor,0)+1);
            //check if charactor is not present make return zero and if charactor is there add 1.
        }
        for (char c :freqyencyMap.keySet())//getting individual charactor
        {
            System.out.println(c+" "+freqyencyMap.get(c));//getting value of charactor);
        }

    }
}
