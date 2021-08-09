package topInterviewQuestions.easy.linkedList.reverseLinkedList;

public class LinkedList {
    private ListNode head;
    private ListNode currentNode;

    public void add(int val) {
        if (head == null) {
            head = new ListNode(val);
            currentNode = head;
        } else {
            currentNode.next = new ListNode(val);
            currentNode = currentNode.next;
        }
    }

    @Override
    public String toString() {
        ListNode headCopy = head;
        StringBuilder result = new StringBuilder();
        while (headCopy.next != null) {
            result.append(headCopy.val).append(" ");
            headCopy = headCopy.next;
        }
        return result.toString() + headCopy.val;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public ListNode getHead() {
        return head;
    }
}

