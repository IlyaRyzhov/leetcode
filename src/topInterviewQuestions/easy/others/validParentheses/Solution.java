package topInterviewQuestions.easy.others.validParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isValid(String s) {
        List<Character> openParenthesesStack = new ArrayList<>(s.length() / 2);
        if (s.length() < 2)
            return false;
        for (int i = 0; i < s.length(); i++) {
            char iChar = s.charAt(i);
            if (isOpeningParentheses(iChar)) {
                openParenthesesStack.add(iChar);
            } else {
                if (openParenthesesStack.size() == 0)
                    return false;
                else {
                    if (isClosingSameType(openParenthesesStack.get(openParenthesesStack.size() - 1), iChar))
                        openParenthesesStack.remove(openParenthesesStack.size() - 1);
                    else return false;
                }
            }
        }
        return openParenthesesStack.size() == 0;
    }

    public boolean isOpeningParentheses(char symbol) {
        return symbol == '(' || symbol == '[' || symbol == '{';
    }

    public boolean isClosingSameType(char openingParenthesis, char closingParenthesis) {
        return openingParenthesis == '(' && closingParenthesis == ')'
                || openingParenthesis == '[' && closingParenthesis == ']'
                || openingParenthesis == '{' && closingParenthesis == '}';
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("{{}[][[[]]]}"));
    }
}
