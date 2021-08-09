package topInterviewQuestions.easy.linkedList.removeNthNodeFromEndOfList;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode headCopy = head;
        int indexOfDeletingElement = 1;
        ListNode elementToDelete = head;
        while (head.next != null) {
            if (indexOfDeletingElement >= n) {
                elementToDelete = elementToDelete.next;
            }
            if (elementToDelete.next == null) {
                head.next = null;
            } else {
                head = head.next;
            }
            indexOfDeletingElement++;
        }
        if(indexOfDeletingElement==1)
            return null;
        if (elementToDelete.next != null) {
            elementToDelete.val = elementToDelete.next.val;
            elementToDelete.next = elementToDelete.next.next;
        }
        return headCopy;
    }
}
