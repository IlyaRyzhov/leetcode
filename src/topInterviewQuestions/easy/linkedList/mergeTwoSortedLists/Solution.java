package topInterviewQuestions.easy.linkedList.mergeTwoSortedLists;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 != null) {
            l1 = l2;
            l2 = null;
        }
        ListNode result = l1;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                if (l1.next == null) {
                    l1.next = l2;
                    break;
                }
                l1 = l1.next;
            } else {
                ListNode l1NextTemp = l1.next;
                ListNode l2NextTemp = l2.next;
                l1.next = l2;
                l2.next = l1NextTemp;
                l2 = l2NextTemp;
                int temp = l1.val;
                l1.val = l1.next.val;
                l1 = l1.next;
                l1.val = temp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(1);
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(2);
        linkedList1.setHead(new Solution().mergeTwoLists(linkedList1.getHead(), linkedList2.getHead()));
        System.out.println(linkedList1);
    }
}
