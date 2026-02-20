package listnode;
import java.util.HashSet;
import java.util.Set;

public class GetIntersectionNodeMethod1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> listnode = new HashSet<ListNode>();
        ListNode cur1 = headA, cur2 = headB;
        while (cur1 != null) {
            listnode.add(cur1);
            cur1 = cur1.next;
        }
        listnode.add(cur1);
        while (cur2 != null) {
            if (listnode.contains(cur2)){
                return cur2;
            }
            cur2 = cur2.next;
        }
        return null;
    }
}
