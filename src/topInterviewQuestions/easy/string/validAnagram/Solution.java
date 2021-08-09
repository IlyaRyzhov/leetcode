package topInterviewQuestions.easy.string.validAnagram;

public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] characterFrequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            characterFrequency[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < t.length(); i++) {
            characterFrequency[t.charAt(i) - 97]--;
        }
        for (int frequency : characterFrequency) {
            if (frequency != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isAnagram("a", "ab"));
    }
}
