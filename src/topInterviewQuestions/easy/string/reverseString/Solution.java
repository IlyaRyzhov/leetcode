package topInterviewQuestions.easy.string.reverseString;

import java.util.Arrays;

public class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        new Solution().reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
