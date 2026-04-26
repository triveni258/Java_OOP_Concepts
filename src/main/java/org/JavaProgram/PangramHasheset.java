package org.JavaProgram;

import java.util.HashSet;

public class PangramHasheset {
    public static void main(String[] args) {
        String input= "The quick brown fox jumps over the lazy do";
        input=input.toLowerCase();
         boolean result=isPangram(input);
        if (result)
        {
            System.out.println("pangram");
        }
        else
        {
            System.out.println("Not a pangaram");
        }
    }
    public static boolean isPangram(String input) {
        char[] inputChar = input.toCharArray();
        HashSet<Character> charset = new HashSet<>();
        for (char c : inputChar)
        {
            if (Character.isLetter(c))
            {
                charset.add(c);
            }
        }
        if(charset.size()==26)
        {
            return true;
        }
        return false;


    }}