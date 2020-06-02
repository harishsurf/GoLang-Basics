// https://leetcode.com/problems/delete-node-in-a-linked-list/
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = node;
        while(node.next != null){
            prev = node;
            node.val = node.next.val;
            node = node.next;
        }
        prev.next = null;
    }
}
