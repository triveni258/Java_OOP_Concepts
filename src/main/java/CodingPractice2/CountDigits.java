package CodingPractice2;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
//        Scanner sr=
        int num=100;
//        int num =sr.nextInt();
        int count=0;

        while(num>0)
        {
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
