package topInterviewQuestions.easy.trees.binaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        travelTree(root, result, 0);
        return result;
    }

    public void travelTree(TreeNode root, List<List<Integer>> result, int row) {
        if (root != null) {
            if (result.size() <= row) {
                List<Integer> rowInThree = new ArrayList<>();
                rowInThree.add(root.val);
                result.add(rowInThree);
            } else {
                result.get(row).add(root.val);
            }
            travelTree(root.left, result, row + 1);
            travelTree(root.right, result, row + 1);
        }
    }
}
