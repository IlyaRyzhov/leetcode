package topInterviewQuestions.easy.string.validPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder parsedString = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char iChar = s.charAt(i);
            if (iChar >= 65 && iChar <= 90)
                parsedString.append((char) (iChar + 32));
            else if ((iChar >= 97 && iChar <= 122) || (iChar >= 48 && iChar <= 57))
                parsedString.append(iChar);
        }
        String stringBeforeReverse = parsedString.toString();
        return parsedString.reverse().toString().equals(stringBeforeReverse);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("0P"));
    }
}
