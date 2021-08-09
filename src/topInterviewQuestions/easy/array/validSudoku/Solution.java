package topInterviewQuestions.easy.array.validSudoku;

import java.util.Arrays;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean verdict;
        for (char[] arr : board) {//row
            verdict = arrayCheck(arr);
            if (!verdict)
                return false;
        }
        char[] boardPart = new char[board.length];
        for (int i = 0; i < board.length; i++) {//column
            for (int j = 0; j < board[i].length; j++) {
                boardPart[j] = board[j][i];
            }
            verdict = arrayCheck(boardPart);
            if (!verdict)
                return false;
        }
        for (int i = 0; i < 3; i++) {//row sub-boxes
            for (int j = 0; j < 3; j++) {//column sub-boxes
                for (int k = 0; k < 3; k++) {//row in sub-boxes
                    System.arraycopy(board[k + i * 3], 3 * j, boardPart, k * 3, 3);
                }
                verdict = arrayCheck(boardPart);
                if (!verdict)
                    return false;
            }
        }
        return true;
    }

    boolean arrayCheck(char[] array) {
        char[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);
        for (int i = 0; i < arrayCopy.length - 1; i++) {
            if (arrayCopy[i] != '.') {
                if (arrayCopy[i] == arrayCopy[i + 1])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
