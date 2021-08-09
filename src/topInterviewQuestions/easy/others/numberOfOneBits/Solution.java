package topInterviewQuestions.easy.others.numberOfOneBits;

public class Solution {
    public int hammingWeight(int n) {
        int counter = 0;
        while (n != 0) {
            if (n % 2 != 0)
                counter++;
            n >>>= 1;
        }
        return counter;
    }
}
