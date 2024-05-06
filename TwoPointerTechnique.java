public class TwoPointerTechnique{
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    class ListUtils {
        public static ListNode[] splitListTwoPointer(ListNode head) {
            if (head == null || head.next == null) {
                return new ListNode[]{ head, null };
            }
    
            ListNode slow = head, fast = head, prev = null;
            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            if (prev != null) {
                prev.next = null;
            }
            return new ListNode[]{ head, slow };
        }
    }
}
