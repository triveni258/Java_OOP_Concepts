package CodingPractice;

import java.math.BigInteger;

public class BigFactorialNum_2 {
    public static void main(String[] args) {
        int num=5;
        int result=1;
        for(int i=1; i<=num;i++)
        {
            result=result*i;
        }
        System.out.println(result);
        //Big number factorial
        int number=50;
        BigInteger result1=BigInteger.ONE;
        for(int i=1; i<=number;i++)
        {
            result1=result1.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result1);

    }
}
