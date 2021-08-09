package topInterviewQuestions.easy.math.romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> characterValueMap = new HashMap<>();
        characterValueMap.put('I', 1);
        characterValueMap.put('V', 5);
        characterValueMap.put('X', 10);
        characterValueMap.put('L', 50);
        characterValueMap.put('C', 100);
        characterValueMap.put('D', 500);
        characterValueMap.put('M', 1000);
        int currentMaxSymbolValue = characterValueMap.get(s.charAt(s.length() - 1));
        int decimalInt = currentMaxSymbolValue;
        for (int i = s.length() - 2; i >= 0; i--) {
            char iChar = s.charAt(i);
            int iCharValue = characterValueMap.get(iChar);
            if (iCharValue < currentMaxSymbolValue)
                decimalInt -= iCharValue;
            else {
                if (iCharValue > currentMaxSymbolValue)
                    currentMaxSymbolValue = iCharValue;
                decimalInt += iCharValue;
            }
        }
        return decimalInt;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        //String s = "XIV";
        System.out.println(new Solution().romanToInt(s));
    }
}
