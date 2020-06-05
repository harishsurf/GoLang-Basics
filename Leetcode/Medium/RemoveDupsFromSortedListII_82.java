// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        
        ListNode prev = new ListNode();
        ListNode curr = head;
        prev.next = head;
        head = prev;
        ListNode temp = head;
        
        // The idea of || condition is to have temp follow curr until curr passes over dups 
        while(curr.next != null){
            // Note the && condition is for edge case when list starts with zero
            if(curr.val == curr.next.val || (curr.val == temp.val && temp != head)) {  
                temp = curr;
                curr = curr.next;
            } else {
                prev.next = curr;
                prev = curr;
                curr = curr.next;
            }
        }
        
        if(curr.val != temp.val){
            prev.next = curr;
        } else {
            prev.next = null;
        }
        
        return head.next;
        
    }
}
