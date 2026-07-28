/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 = 0;
        int size2 = 0;
        ListNode temp = headA;
        while(temp != null){
            temp = temp.next;
            size1++;
        }
        ListNode num = headB;
        while(num != null){
            num = num.next;
            size2++;
        }
        if(size1 == size2){
            while(headA != headB){
                headA = headA.next;
                headB = headB.next;
            } return headA;
        } else if(size1 < size2){
            while(size1 != size2){
                headB = headB.next;
                size2--;
            }
             while(headA != headB){
                headA = headA.next;
                headB = headB.next;
            } return headA;
        } else {
             while(size1 != size2){
                headA = headA.next;
                size1--;
            }
             while(headA != headB){
                headA = headA.next;
                headB = headB.next;
            } return headA;
        } 
    }
}