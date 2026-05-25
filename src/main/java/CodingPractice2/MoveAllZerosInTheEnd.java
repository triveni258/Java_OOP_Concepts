package CodingPractice2;

public class  MoveAllZerosInTheEnd {
    public static void main(String[] args) {

       // put all zeros on right side
        int num[]={1,0,2,0,3,0};
        int temp;
        int putAllNonZero=0;
        for(int  currunt=num.length-1; currunt>=0; currunt--) {
            if (num[currunt] != 0)
            {
                temp=num[putAllNonZero];
                num[putAllNonZero]=num[currunt];
                num[currunt]=temp;
                putAllNonZero--;
            }
        }
        for (int result: num)
        {
            System.out.print(result);
        }

        //put all zeros in left side


        int a[]={1,0,2,0,3,0};
        int temp1;
        int putAllNonZeroleft=a.length-1;
        for(int  currunt=a.length-1; currunt>=0; currunt--) {
            if (a[currunt] != 0)
            {
                temp1=a[putAllNonZeroleft];
                a[putAllNonZeroleft]=a[currunt];
                a[currunt]=temp1;
                putAllNonZeroleft--;
            }
        }
        for (int no: a)
        {
            System.out.print(no);
        }
    }
}
