package topInterviewQuestions.easy.array.rotateArray;

import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {
        int kModLength = k % nums.length;
        int gcd = euclideanAlgorithm(kModLength, nums.length);
        int quotient = nums.length / gcd;
        if (kModLength > 0) {
            if (kModLength <= nums.length / 2) {
                for (int i = 0; i < gcd; i++) {
                    int indexOfSwappedElement = i;
                    int swappedElement = nums[indexOfSwappedElement];
                    for (int j = 0; j < quotient; j++) {
                        indexOfSwappedElement = (indexOfSwappedElement + kModLength) % nums.length;
                        int temp = nums[indexOfSwappedElement];
                        nums[indexOfSwappedElement] = swappedElement;
                        swappedElement = temp;
                    }
                }
            } else rotateLeft(nums, nums.length - kModLength);
        }
    }

    public void rotateLeft(int[] nums, int k) {
        int kModLength = k % nums.length;
        int gcd = euclideanAlgorithm(kModLength, nums.length);
        int quotient = nums.length / gcd;
        if (kModLength > 0) {
            if (kModLength <= nums.length / 2) {
                for (int i = 0; i < gcd; i++) {
                    int indexOfSwappedElement = i;
                    int swappedElement = nums[indexOfSwappedElement];
                    for (int j = 0; j < quotient; j++) {
                        indexOfSwappedElement = (indexOfSwappedElement - kModLength + nums.length) % nums.length;
                        int temp = nums[indexOfSwappedElement];
                        nums[indexOfSwappedElement] = swappedElement;
                        swappedElement = temp;
                    }
                }
            } else rotate(nums, nums.length - kModLength);
        }
    }

    public int euclideanAlgorithm(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b)
                a %= b;
            else b %= a;
        }
        return a + b;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -100, 3, 99};
        //int[] nums = {1, 2, 3, 4, 5, 6, 7};
        //int[] nums = {0, 1, 2, 3, 4, 5};
        new Solution().rotate(nums, 3);

        System.out.println(Arrays.toString(nums));
    }
}
