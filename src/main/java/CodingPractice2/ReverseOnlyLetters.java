package CodingPractice2;

public class ReverseOnlyLetters {
    public static void main(String[] args) {


                // Reverse only letters

                String input = "1cb2";

                char[] inputArray = input.toCharArray();

                int left = 0;

                int right = inputArray.length - 1;

                char temp;

                while(left < right)
                {

                    if(!Character.isLetter(inputArray[left]))
                    {
                        left++;
                    }

                    else if(!Character.isLetter(inputArray[right]))
                    {
                        right--;
                    }

                    else
                    {
                        temp = inputArray[left];

                        inputArray[left] = inputArray[right];

                        inputArray[right] = temp;

                        left++;
                        right--;
                    }
                }

                System.out.println(new String(inputArray));
            }
        }

