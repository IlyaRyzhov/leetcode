package topInterviewQuestions.easy.array.moveZeroes;

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCounter = 0;
        int currentNotZeroElementCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[currentNotZeroElementCounter] = nums[i];
                currentNotZeroElementCounter++;
            } else {
                zeroCounter++;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 0) {
                        zeroCounter++;
                    } else {
                        nums[currentNotZeroElementCounter] = nums[j];
                        currentNotZeroElementCounter++;
                        i = j;
                        break;
                    }
                    i = j;
                }
            }
        }
        for (int i = 0; i < zeroCounter; i++) {
            nums[nums.length - 1 - i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new Solution().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
