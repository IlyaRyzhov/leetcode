package topInterviewQuestions.easy.linkedList.palindromeLinkedList;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return false;
        ListNode nodeStepOne = head;
        ListNode nodeStepTwo = head;
        while (nodeStepTwo != null && nodeStepTwo.next != null) {
            nodeStepTwo = nodeStepTwo.next.next;
            nodeStepOne = nodeStepOne.next;
        }
        if (nodeStepTwo != null)
            nodeStepOne = nodeStepOne.next;
        ListNode middle = reverseList(nodeStepOne);
        while (middle != null) {
            if (middle.val != head.val)
                return false;
            middle = middle.next;
            head = head.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }
}
