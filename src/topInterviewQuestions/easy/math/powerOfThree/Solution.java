package topInterviewQuestions.easy.math.powerOfThree;

public class Solution {
    public boolean isPowerOfThree(int n) {
        //without loop
        // return n >= 1 && Math.pow(3, Math.ceil(Math.log(n) / Math.log(3))) == n;
        //with loop
        while (n >= 3) {
            if (n % 3 == 0)
                n /= 3;
            else return false;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfThree(243));
    }
}
