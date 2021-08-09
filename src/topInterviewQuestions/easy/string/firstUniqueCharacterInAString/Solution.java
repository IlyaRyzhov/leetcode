package topInterviewQuestions.easy.string.firstUniqueCharacterInAString;

import java.util.Arrays;

public class Solution {
    public int firstUniqChar(String s) {
        int[] characterFrequency = new int[26];
        int[] indices = new int[26];
        Arrays.setAll(indices, i -> indices[i] = -1);
        for (int i = 0; i < s.length(); i++) {
            char iChar = s.charAt(i);
            if (indices[iChar - 97] == -1)
                indices[iChar - 97] = i;
            characterFrequency[iChar - 97]++;
        }
        int minIndex = s.length();
        for (int i = 0; i < 26; i++) {
            if (characterFrequency[i] == 1 && indices[i] < minIndex) {
                minIndex = indices[i];
            }
        }
        return minIndex == s.length() ? -1 : minIndex;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("aabb"));
    }
}
