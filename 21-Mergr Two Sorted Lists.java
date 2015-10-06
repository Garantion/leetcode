/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode tmpNode;
        if(l1.val > l2.val){
            tmpNode = l2;
            tmpNode.next = mergeTwoLists(l1, l2.next);
        }else{
            tmpNode = l1;
            tmpNode.next = mergeTwoLists(l1.next, l2);
        }
        return tmpNode;
    }
}
