package CodingPractice2;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String inut="1ab2";
        char inutArray[]=inut.toCharArray();
        int left=0;
        int right=inutArray.length-1;

        while(left>right)
        {
           // if(!Character.isLetter(inutArray()))
            {
                left++;
            }
            //else if(!Character.isLetter(right))
            {
                right--;
            }
        }
        System.out.println();
    }
}
