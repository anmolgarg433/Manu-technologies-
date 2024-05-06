import java.util.ArrayList;

public class IterativeSplit {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode[] splitListUsingArray(ListNode head) {
        ArrayList<ListNode> nodes = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            nodes.add(current);
            current = current.next;
        }
        int mid = nodes.size() / 2;
        if (nodes.size() > 1) {
            nodes.get(mid - 1).next = null;
        }
        return new ListNode[]{ head, nodes.size() > 1 ? nodes.get(mid) : null };
    }
}
