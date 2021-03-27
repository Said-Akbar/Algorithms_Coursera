/* *****************************************************************************
 *  Name:              Saidakbar Pardaev
 *  Last modified:     March 27, 2021
 **************************************************************************** */
// print array's x item uniformly at random (print i_th item with 1/i probability)
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String survivingWord = "";
        int count = 1; // helps us with getting a bernoulli probability
        // until the input reaches the end, get all strings and store the string
        // with 1/count probability in survivingWord
        while (!StdIn.isEmpty()) {
            String thisValue = StdIn.readString();
            if (StdRandom.bernoulli((double) 1/count)) {
                // converting 1/count to double is important otherwise the result is int and first value is true the rest is false (int -> 1/1 = 1; 1/n = 0)
                survivingWord = thisValue;
            }
            count++;
        }
        System.out.println(survivingWord);
    }
}
