package CodingPractice;

public class LastWordCount_3 {
    public static void main(String[] args) {
        String input = "   Hello   world  ";
        String inputTrim = input.trim();
        //System.out.println(inputTrim);
        char inputArray[] = inputTrim.toCharArray();
        int count = 0;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            if (inputArray[i] != ' ') {
                count = count + 1;
            } else {
                if (count > 0) {
                    System.out.println(count);
                    break;
                }
            }
        }

    }
}
