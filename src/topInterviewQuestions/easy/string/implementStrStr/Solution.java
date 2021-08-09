package topInterviewQuestions.easy.string.implementStrStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        return needle.equals("") ? 0 : knuthMorrisPratt(haystack, needle);
    }

    private int[] prefixFunction(String s) {
        int[] prefixFunction = new int[s.length()];
        int k = 0;
        for (int i = 1; i < s.length(); i++) {
            while (k > 0 && (s.charAt(k) != s.charAt(i))) {
                k = prefixFunction[k - 1];
            }
            if (s.charAt(k) == s.charAt(i))
                k++;
            prefixFunction[i] = k;
        }
        return prefixFunction;
    }

    private int knuthMorrisPratt(String s, String sample) {
        int[] prefixFunction = prefixFunction(sample);
        int result = -1;
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            while (k > 0 && sample.charAt(k) != s.charAt(i))
                k = prefixFunction[k - 1];
            if (sample.charAt(k) == s.charAt(i))
                k++;
            if (k == sample.length()) {
                result = i - sample.length() + 1;
                k = prefixFunction[k - 1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().strStr("ааbааbааааbааbаааb", "ааbаа"));
    }
}
