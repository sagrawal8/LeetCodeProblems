//Runtime: 2 ms, faster than 76.65% of Java online submissions for Add Two Numbers.
//Memory Usage: 39.2 MB, less than 65.33% of Java online submissions for Add Two Numbers.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {        
        ListNode dummyHead = new ListNode();
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.val = sum % 10;      
        if (l1 != null) l1 = l1.next;
        if (l2 != null) l2 = l2.next;  
        if(l1 != null || l2 != null || carry > 0){             
            curr.next = new ListNode(carry);
            curr = curr.next;
        }
    }
    
        return dummyHead;
    }
}
