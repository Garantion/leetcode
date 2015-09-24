/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       if(head == null || head.next == null){
           return head;
       }
       ListNode before = head;
       ListNode after = head.next;
       while(after != null){
           if(before.val == after.val)
           {
               before.next = after.next;
               after = after.next;
           }else{
               before = before.next;
               after = after.next;
           }
       }
       return head;
    }
}
