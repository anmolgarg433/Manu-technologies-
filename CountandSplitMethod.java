public class CountandSplitMethod {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode[] splitListCount(ListNode head) {
        if (head == null) {
            return new ListNode[]{ null, null };
        }
    
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
    
        ListNode first = head;
        current = head;
        int mid = count / 2;
        for (int i = 0; i < mid - 1; i++) {
            current = current.next;
        }
    
        ListNode second = current.next;
        current.next = null;
        return new ListNode[]{ first, second };
    }
}
