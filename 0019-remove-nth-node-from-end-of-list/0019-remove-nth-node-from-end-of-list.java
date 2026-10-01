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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp;
        int count=0;

        temp = head;

        while(temp!=null){
            temp=temp.next;
            count++;
        }

        int m = count-n;

        if(m==0){
            return head.next;
        }

        int k = 0;

        temp = head;

        for(k=0; k<m-1; k++){
            temp=temp.next;
        }

        temp.next=temp.next.next;

        return head;

    }
}