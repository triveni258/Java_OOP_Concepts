package CodingPractice2;

import java.util.Scanner;

public class CountCharactors {
    public static void main(String[] args) {
//        Scanner sr= new Scanner(System.in);
//        String name =sr.next();
//        String count="";
//        int letters=0;
//       for(int i=0; i<name.length(); i++)
//        {
//            count=count+name.charAt(i);
//            letters++;
//        }
//        System.out.println(letters);
        String input = "Triveni";
        //char [] inputArray= input.toCharArray();
        int count=0;
        for(int i=0;i<input.length(); i++)
        {

           count++;
        }
        System.out.println(count);
    }
}
