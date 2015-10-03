/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = head;
        ListNode now = head.next;
        ListNode after;
        pre.next = null;
        
        while(now != null){
            after = now.next;
            now.next = pre;
            pre = now;
            now = after;
        }
        return pre;
    }
}
