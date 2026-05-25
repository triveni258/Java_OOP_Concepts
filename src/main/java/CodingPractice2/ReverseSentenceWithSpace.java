package CodingPractice2;

public class ReverseSentenceWithSpace {
    public static void main(String[] args) {


//Senetece reverse , space should not chnage
                String input="I love java";
        String words[]=input.split(" ");
        for (int i=words.length-1; i>=0; i--)
        {
            System.out.print(words[i]+" ");
        }


    }
}
