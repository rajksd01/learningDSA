//question Number 83. Remove Duplicates from Sorted List

// given :Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 // example :Input: head = [1,1,2]
//           Output: [1,2]

// Input: head = [1,1,2,3,3]
// Output: [1,2,3]

// Constraints:

// The number of nodes in the list is in the range [0, 300].
// -100 <= Node.val <= 100
// The list is guaranteed to be sorted in ascending order.



// Solution:


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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        } 
        
        ListNode list = head;
        
        while(list.next != null) {
            
            if (list.val == list.next.val){
                
                list.next = list.next.next;
            }else {
                
                list = list.next;    
            }
            
        }
        return head;
    }
}