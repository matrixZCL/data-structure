package linkedlist;


/**
 * 反转一个链表
 * 示例：
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;//存储前一个节点
        ListNode curr=head;

        while (curr!=null){
            ListNode next=curr.next;//用来存储下一个节点
            curr.next=pre;//当前元素指针改为指向前一个节点
            pre=curr;
            curr=next;

        }
        return pre;
    }



}


/**
 * 定义单链表
 */
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

}
