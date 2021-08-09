package topInterviewQuestions.easy.array.rotateArray;

import java.util.Arrays;

public class BetterSolution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k > 0) {
            if (k <= nums.length / 2) {
                int startIndex = 0;
                for (int numberOfSwappedElements = 0; numberOfSwappedElements < nums.length; ) {
                    int endIndex = startIndex;
                    int indexOfSwappedElement = startIndex;
                    int swappedElement = nums[indexOfSwappedElement];
                    do {
                        indexOfSwappedElement = (indexOfSwappedElement + k) % nums.length;
                        int temp = nums[indexOfSwappedElement];
                        nums[indexOfSwappedElement] = swappedElement;
                        swappedElement = temp;
                        numberOfSwappedElements++;
                        endIndex = (endIndex + k) % nums.length;
                    } while (endIndex != startIndex);
                    startIndex++;
                }
            } else rotateLeft(nums, nums.length - k);
        }
    }

    public void rotateLeft(int[] nums, int k) {
        k = k % nums.length;
        if (k > 0) {
            if (k <= nums.length / 2) {
                int startIndex = 0;
                for (int numberOfSwappedElements = 0; numberOfSwappedElements < nums.length; ) {
                    int endIndex = startIndex;
                    int indexOfSwappedElement = startIndex;
                    int swappedElement = nums[indexOfSwappedElement];
                    do {
                        indexOfSwappedElement = (indexOfSwappedElement - k + nums.length) % nums.length;
                        int temp = nums[indexOfSwappedElement];
                        nums[indexOfSwappedElement] = swappedElement;
                        swappedElement = temp;
                        numberOfSwappedElements++;
                        endIndex = (endIndex + k) % nums.length;
                    } while (endIndex != startIndex);
                    startIndex++;
                }
            } else rotate(nums, nums.length - k);
        }
    }

    public static void main(String[] args) {
        // int[] nums = {-1, -100, 3, 99};
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        //int[] nums = {0, 1, 2, 3, 4, 5};
        new Solution().rotate(nums, 4);

        System.out.println(Arrays.toString(nums));
    }
}

