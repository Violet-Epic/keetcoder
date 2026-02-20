package listnode;

public class RemoveElementsDummy {
    // 删除链表中等于给定值 val 的所有节点。
    // 有一个问题，就是如果头节点的值等于val，那么头节点就无法删除了，所以需要一个虚拟节点
    // 创建一个虚拟节点，指向head，然后判断虚拟节点的下一个节点的值是否等于val，
    // 如果等于，则将虚拟节点的下一个节点指向虚拟节点的下一个节点的下一个节点
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode(0, head);
        ListNode cur = dummyNode;
        while (cur.next != null) {
            if (cur.val == val) {
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
            }
        }
        return dummyNode.next;
    }
}
