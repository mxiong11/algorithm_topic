package w1_array_linkList_stack_queue.linkedLists;

/*
* 反转链表
* */
public class ReverseLinkedList {

    public ListNode reverseListNormal(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }



}
