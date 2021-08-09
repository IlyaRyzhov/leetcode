package topInterviewQuestions.easy.array.intersectionOfTwoArrays;

import java.util.Arrays;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int startIndexInInnerLoop = 0;
        int[] intersection = new int[Math.min(nums1.length, nums2.length)];
        int indexOfIntersection = 0;
        loop1:
        for (int i = 0; i < nums1.length; i++) {
            for (int j = startIndexInInnerLoop; j < nums2.length; j++) {
                if (i == nums1.length)
                    break loop1;
                if (nums1[i] < nums2[j]) {
                    continue loop1;
                } else if (nums1[i] == nums2[j]) {
                    intersection[indexOfIntersection] = nums1[i];
                    indexOfIntersection++;
                    startIndexInInnerLoop++;
                    i++;
                } else {
                    startIndexInInnerLoop++;
                }
            }
        }
        return Arrays.copyOf(intersection, indexOfIntersection);
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5}, nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(new Solution().intersect(nums1, nums2)));

    }
}
