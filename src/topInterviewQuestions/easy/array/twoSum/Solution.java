package topInterviewQuestions.easy.array.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>(nums.length);
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = numsMap.get(target - nums[i]);
                return result;
            } else numsMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int t = 6;
        System.out.println(Arrays.toString(new Solution().twoSum(nums, t)));
    }
}
