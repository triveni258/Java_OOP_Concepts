package CodingPractice2;

public class ReplaceVowelesWithX {
    public static void main(String[] args) {
        String input = "Name";
        input = input.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (char curruntChar : input.toCharArray()) {
            if (isVowelsPresent(curruntChar))
            {
                result.append('X');
            }
            else{
                result.append(curruntChar);
            }
        }
        System.out.println(result.toString());
    }

            public static boolean isVowelsPresent(char curruntChar)
            {
                if (curruntChar == 'a' || curruntChar == 'e' || curruntChar == 'i' || curruntChar == 'o' || curruntChar == 'u')
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }


//        {
//            if(curruntChar=='a'|| curruntChar=='e' || curruntChar=='i'|| curruntChar=='o'|| curruntChar=='u')
//            {
//                result.append('X');
//            }
//            else{
//                result.append(curruntChar);
//            }
//
//        }
//        System.out.println(result);


        }


