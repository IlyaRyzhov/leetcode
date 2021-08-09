package topInterviewQuestions.easy.string.countAndSay;

public class Solution {
    public String countAndSay(int n) {
        String say = "1";
        for (int i = 1; i < n; i++) {
            char countingSymbol = say.charAt(0);
            int counter = 1;
            StringBuilder countAndSay = new StringBuilder();
            for (int j = 1; j < say.length(); j++) {
                if (say.charAt(j) == countingSymbol)
                    counter++;
                else {
                    countAndSay.append(counter).append(countingSymbol);
                    counter = 1;
                    countingSymbol = say.charAt(j);
                }
            }
            countAndSay.append(counter).append(countingSymbol);
            say = countAndSay.toString();
        }
        return say;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countAndSay(10));
    }
}
