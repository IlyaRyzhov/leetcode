package topInterviewQuestions.easy.array.plusOne;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = ++digits[i] % 10;
            if (digits[i] != 0)
                break;
        }
        if (digits[0] != 0) {
            return digits;
        } else {
            int[] result = new int[digits.length + 1];
            result[0]++;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9, 9};
        System.out.println(Arrays.toString(new Solution().plusOne(digits)));
    }
}
