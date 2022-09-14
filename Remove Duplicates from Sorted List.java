/*83. Remove Duplicates from Sorted List
Easy

5771

205

Add to List

Share
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]*/

``` 
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
        ListNode prev = new ListNode();
        ListNode curr = new ListNode();
        prev = head;
        curr = head;
        while(curr!=null){
            if(prev.val == curr.val){
                prev.next = curr.next;
            }
            else
                prev = curr;
            curr = curr.next;
        }
        return head;
    }
}
```
