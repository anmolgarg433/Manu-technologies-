public class RecursiveSplit {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode[] splitListRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return new ListNode[]{ head, null };
        }
    
        ListNode[] split = splitListRecursive(head.next);
        if (split[1] == null) {
            return new ListNode[]{ head, split[0] };
        } else {
            ListNode temp = head.next;
            head.next = null;
            return new ListNode[]{ head, temp };
        }
    }
    
}
