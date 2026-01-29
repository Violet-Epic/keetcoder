package listnode;

public class ListNode {
    // 这里没有类的方法，只有属性
// * Definition for singly-linked list.
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
