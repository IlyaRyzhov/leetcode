package topInterviewQuestions.easy.design.shuffleAnArray;

import java.util.Random;

public class Solution {
    private final int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }

    /**
     * Resets the topInterviewQuestions.easy.array to its original configuration and return it.
     */
    public int[] reset() {
        return nums;
    }

    /**
     * Returns a random shuffling of the topInterviewQuestions.easy.array.
     */
    public int[] shuffle() {
        Random random = new Random();
        int[] shuffledNums = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            int randomNumber = random.nextInt(nums.length - i) + i;
            swapElementsOfArray(shuffledNums, i, randomNumber);
        }
        return shuffledNums;
    }

    private void swapElementsOfArray(int[] array, int indexOfFirstElement, int indexOfSecondElement) {
        int temp = array[indexOfFirstElement];
        array[indexOfFirstElement] = array[indexOfSecondElement];
        array[indexOfSecondElement] = temp;
    }
}