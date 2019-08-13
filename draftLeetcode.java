        
/*
need to update it weekly 
*/
ArrayList array = new ArrayList<String>;  
        //or
        String temp = ""; 
        for(int i = 0 ; i < s.length(); i ++){
            for(int j = i-1 ; j < s.length; ){
                if()
                
            }
        }

           public int lengthOfLongestSubstring(String s) {
        //regex using match()
        Pattern pattern = Pattern.compile("([A-Za-z])(?!.\1)") ; 
        Matcher m = pattern.matcher(s); 
        if(m.find()){
            System.out.println(m.group());
        }
        return 1 ;
    }
Question #1 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2]; 
        if(nums.length == 0 ) return temp ; 
        for(int i = 0 ; i < nums.length ; i ++){
            for(int j = i+1; j< nums.length ; j++){
                if((nums[i]+nums[j]) == target ){
                     temp[0] = i; 
                     temp[1] = j; 
                }
            }
        }
       return temp ; 
    }
}
Question #2 
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

//not compiled 
Question #4 Hacker Leet 
    //import com.google.common.collect.ObjectArrays;
import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      List list = new ArrayList(Arrays.asList(nums1));
       //need to read strings in array and organise it      
      //list.addAll(Arrays.asList(nums2));
     // Arrays [] temp = Arrays.sort(list.toArray()); 
      System.out.println(list); 
      return 1.0 ; 
    }
}
