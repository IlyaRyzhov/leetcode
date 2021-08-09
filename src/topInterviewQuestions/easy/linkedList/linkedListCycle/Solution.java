package topInterviewQuestions.easy.linkedList.linkedListCycle;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode nodeStepOne = head;
        ListNode nodeStepTwo = head;
        while (nodeStepTwo != null && nodeStepTwo.next != null) {
            nodeStepOne = nodeStepOne.next;
            nodeStepTwo = nodeStepTwo.next.next;
            if (nodeStepOne == nodeStepTwo)
                return true;
        }
        return false;
    }
}
