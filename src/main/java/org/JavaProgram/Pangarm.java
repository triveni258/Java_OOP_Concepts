package org.JavaProgram;

public class Pangarm {
    public static void main(String[] args)
    {
        String input = "The quick brown fox jumps over the lazy dog school";
     input= input.toLowerCase();
        //toCharArray() method is used to convert string into character array
        Pangarm obj = new Pangarm();
       boolean result= obj.checkPangram(input);
       if(result)
       {
        System.out.println(result+"It is pangram");
       }

        else {
           System.out.println(result + "It is not pangram");
       }


    }

    public  boolean checkPangram(String input)
    {
     if(input.length()<26)
     {
         return false;
     }
     for(char i='a';i<='z'; i++)
     {
        if( input.indexOf(i)<0)
        { return false;

        }
     }
     return true;
    }
}
