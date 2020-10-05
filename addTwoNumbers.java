/**
Definition for singly-linked list.
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.\
COMPLETED
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode result = head; 
        int t = 0; 
       int t2 = 0;
        int temp = 0 ; 
        while( l1 != null || l2 != null){            
            if(l1 != null) {
                   t = l1.val; 
                  l1 =  l1.next;
            }
            else t = 0 ; 
 
            if(l2 != null) {
                  t2 = l2.val;
                  l2 =  l2.next;
              }
            else t2 = 0 ; 

            int r = t + t2 ;
           if(temp != 0 ){
                r += temp ; 
                temp = 0 ; 
            }
            if(r > 9) {
                temp++ ; 
                r = r%10 ;  
            }
            
            result.next = new ListNode(r) ; 
            result = result.next;


        }
        if(temp != 0 )
        {
            result.next = new ListNode(temp) ; 
            result = result.next;
        }
            
        return head.next; 
    }
}
