package topInterviewQuestions.easy.string.reverseInteger;

public class Solution {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE)
            return 0;
        int reversedX = 0;
        boolean xNonNegative = x >= 0;
        x = Math.abs(x);
        while (x != 0) {
            int lastDigit = x % 10;
            x /= 10;
            if (reversedX > Integer.MAX_VALUE / 10)
                return 0;
            reversedX = reversedX * 10 + lastDigit;
        }
        return xNonNegative ? reversedX : -reversedX;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(1534236469));
    }
}
