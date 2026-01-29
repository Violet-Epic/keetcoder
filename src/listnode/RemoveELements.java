package listnode;
// 不使用java中本身的链表，自己实现一个

public class RemoveELements {
    // 删除链表中等于给定值 val 的所有节点。
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            // 判断当前节点的下一个节点的值是否等于val,如果当前节点下一个的下一个也是val怎么办,懂了
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
            }
        }
        return head;
    }
}
