package topInterviewQuestions.easy.array.removeDuplicatesFromSortedArray;

import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int indexOfUnique = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                nums[indexOfUnique] = nums[i];
                indexOfUnique++;
            }
        }
        return indexOfUnique;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new Solution().removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
