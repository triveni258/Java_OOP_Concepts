package CodingPractice;

import java.math.BigInteger;

public class FactorailNum {
    public static void main(String[] args) {
        int num=5;
        int fact=1;
        for(int i =1; i<=5; i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
        //Big integer Number
        int BigNum=30;
        BigInteger result= BigInteger.ONE;
        for(int i=1; i<=BigNum; i++)
        {
            result = result.multiply(BigInteger.valueOf(i));

        }
        System.out.println("BigNum factorial:" +result);

    }
}
