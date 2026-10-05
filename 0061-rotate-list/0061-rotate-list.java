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
    public ListNode rotateRight(ListNode head, int k) {

        ListNode temp = new ListNode(0);

        temp = head;

        if(head==null || head.next ==null)
            return head;

        int i, count = 1;

        while(temp.next != null){
            temp = temp.next;
            count++;
        }

        temp.next = head;

        k = count - ( k % count ) ;

        for (i=0; i<k; i++){
            temp = temp.next;
        }

        head = temp.next;

        temp.next = null;
        
        return head;
    }
}