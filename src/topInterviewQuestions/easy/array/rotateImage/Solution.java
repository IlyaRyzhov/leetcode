package topInterviewQuestions.easy.array.rotateImage;

import java.util.Arrays;

public class Solution {
    public void rotate(int[][] matrix) {
        for (int[] row : matrix) {
            reverseArray(row);
        }
        int temp;
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                temp = matrix[length - 1 - j][length - 1 - i];
                matrix[length - 1 - j][length - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    public void reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        new Solution().rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
