package w1_array_linkList_stack_queue.linkedLists;


/*
* k个一组反转链表
* */
public class KTeamsReverseLinkedList {


    
    public ListNode reverseKGroup(int k, ListNode head){

        ListNode protect = new ListNode(0, head);
        ListNode last = protect;

        //分组遍历
        while(head != null){
            //1,分组（往后走k-1步，找到一组）
            // 一组的开头head 结尾end
            ListNode end = getEnd(head,k);
            if (end == null) break;

            ListNode nextGroupHead = end.next;

            //2,一组内部（head到end之间）要反转（调用反转链表）
            reverseListNormal(head, nextGroupHead);

            //更新每一组跟前一组，后一组之间的边
            last.next = end;
            head.next = nextGroupHead;

            last = head;
            head = nextGroupHead;

        }
        return protect.next;
    }

    // 反转链表 在结点stop停止
    private void reverseListNormal(ListNode head, ListNode stop) {
        ListNode last = head;
        head = head.next;
        while(head != stop){
            ListNode nextHead = head.next;
            head.next = last;
            last = head;
            head = nextHead;
        }
    }

    //返回走k-1步之后的结点
    //返回null表示不够k个
    private ListNode getEnd(ListNode head, int k) {
        while(head != null){
            k--;
            if(k == 0)return head;
            head = head.next;
        }
        return null;
    }
}
