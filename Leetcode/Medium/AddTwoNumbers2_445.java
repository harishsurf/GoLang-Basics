public class AddTwoNumbers2_445 {
	// https://leetcode.com/problems/add-two-numbers-ii/
	
    // Approach 1 : by reversing list  (O(m+n))
    // Approach 2 : TODO : Not reversing list (Stack ?)

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() { }

        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Approach 1 : by reversing list
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = null;
        ListNode b = null;

        // Reverse list l1
        while (l1 != null) {
            ListNode temp = new ListNode(l1.val, a);
            a = temp;
            l1 = l1.next;
        }

        // Reverse list l2
        while (l2 != null) {
            ListNode temp = new ListNode(l2.val, b);
            b = temp;
            l2 = l2.next;
        }

        // Add reversed lists a & b
        int sum = 0;
        int carry = 0;
        ListNode res = null;
        int x, y;
        while (a != null || b != null) {
            x = (a != null) ? a.val : 0;
            y = (b != null) ? b.val : 0;
            sum = (x + y + carry) % 10;
            carry = (x + y + carry) / 10;
            ListNode temp = new ListNode(sum, res);
            res = temp;
            if (a != null) {
                a = a.next;
            }
            if (b != null) {
                b = b.next;
            }
        }

        if (carry > 0) {
            ListNode temp = new ListNode(1, res);
            res = temp;
        }
        return res;
    }
}
