package org.JavaProgram.TestComponent;

public class TwoPointerTechnique {
    public static void main(String[] args) {
        //
        int arr[]={2,3,4,7,5};
        int target=10;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(i +" "+ j);
                }
            }
        }
    }
}
