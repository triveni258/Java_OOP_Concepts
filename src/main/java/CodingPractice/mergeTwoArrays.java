package CodingPractice;

import java.util.Arrays;

public class mergeTwoArrays {
    public static void main(String[] args) {




                int a[] = {1,2,3,10};

                int b[] = {4,6,7,8,9};

                int c[] = new int[a.length + b.length];

                // copy first array
                for(int i = 0; i < a.length; i++)
                {
                    c[i] = a[i];
                }

                // copy second array
                for(int j = 0; j < b.length; j++)
                {
                    c[a.length + j] = b[j];
                }
        Arrays.sort(c);

                // print merged array
                for(int result : c)
                {
                    System.out.print(result + " ");
                }
            }
        }




