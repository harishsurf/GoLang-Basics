// https://leetcode.com/problems/remove-linked-list-elements/
 
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode prev = new ListNode();
        prev.next = head;
        head = prev;
        ListNode curr = head.next;
        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        
        return head.next;
    }
}
