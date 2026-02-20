package listnode;
// 不使用java中本身的链表，自己实现一个
//主分支就是默认分支为main or master，branch为隔离分支。
// 创建分支的时候，需要先切换到主分支，然后创建分支，然后切换到分支，进行开发，开发完成后，合并分支。

public class RemoveELements {
    // 删除链表中等于给定值 val 的所有节点。
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        // 我不知道这里有什么用
//        while (head != null && head.val == val) {
//            head = head.next;
//        }
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

