package topInterviewQuestions.easy.string.stringToInteger;

public class Solution {

    public int myAtoi(String s) {
        boolean isPositive = true;
        long parsedNumber = 0;
        int indexOfFirstSignificantSymbol = 0;
        while (indexOfFirstSignificantSymbol < s.length() && s.charAt(indexOfFirstSignificantSymbol) == ' ') {
            indexOfFirstSignificantSymbol++;
        }
        if (indexOfFirstSignificantSymbol < s.length()) {
            if (s.charAt(indexOfFirstSignificantSymbol) == '-') {
                isPositive = false;
                indexOfFirstSignificantSymbol++;
            } else if (s.charAt(indexOfFirstSignificantSymbol) == '+') {
                indexOfFirstSignificantSymbol++;
            } else if (!Character.isDigit(s.charAt(indexOfFirstSignificantSymbol)))
                return (int) parsedNumber;
        }
        for (int i = indexOfFirstSignificantSymbol; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                break;
            else {
                parsedNumber = parsedNumber * 10 + (s.charAt(i) - '0');
                if (!isPositive) {
                    if (-parsedNumber < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    if (parsedNumber > Integer.MAX_VALUE)
                        return Integer.MAX_VALUE;
                }
            }
        }
        return isPositive ? (int) parsedNumber : (int) -parsedNumber;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("+1"));
    }
}
