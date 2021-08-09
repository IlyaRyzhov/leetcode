package topInterviewQuestions.easy.sortingAndSearching.firstBadVersion;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int leftBorder = 1;
        int rightBorder = n;
        while (leftBorder < rightBorder) {
            int middle = leftBorder + (rightBorder - leftBorder) / 2;
            if (isBadVersion(middle)) {
                rightBorder = middle;
            } else {
                leftBorder = middle + 1;
            }
        }
        return leftBorder;
    }

    @Override
    boolean isBadVersion(int version) {
        return version >= 1702766719;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().firstBadVersion(2126753390));
    }
}
