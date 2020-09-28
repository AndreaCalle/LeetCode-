/*
Median of Two Sorted Arrays
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Follow up: The overall run time complexity should be O(log (m+n)).
COMPELETED
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int slength = nums1.length + nums2.length ; 
      int finArray [] = new int[slength]; 
      int count = 0 ; 
      int counter = 0 ; 
      int last = 0 ;   
        
      if(nums1.length==0  && nums2.length >0) finArray = nums2 ; 
      if(nums2.length==0  && nums1.length >0) finArray = nums1 ;  

  if(nums1.length >0 && nums2.length >0)   { 
    if(nums1[nums1.length -1 ]<=nums2[0]){
        System.arraycopy(nums1, 0, finArray, 0, nums1.length);
        System.arraycopy(nums2, 0, finArray, nums1.length, nums2.length);
    }
   if(nums2[nums2.length -1 ]<=nums1[0]){
        System.arraycopy(nums2, 0, finArray, 0, nums2.length);
        System.arraycopy(nums1, 0, finArray, nums2.length, nums1.length);
    }
     
    
    else{
     int max [] ; 
     int min [] ; 
        
     if(nums1.length < nums2.length) {
         max = nums2;
         min = nums1 ; 
     }
        else {max = nums1;  min = nums2 ; }
        
     for(int i = 0 ; i < max.length ; i ++){

         while(counter < min.length && min[counter]<max[i]){
                    finArray[count] = min[counter]; 
                    count ++ ; 
                    counter++; 
             
         }
             finArray[count] = max[i];   
             count ++; 
         }
         
     }
    
     
        }
 
      if(finArray.length % 2 != 0) return finArray[finArray.length/2]  ; 
        else return ((double)finArray[((finArray.length)/2)-1] + (double)finArray[((finArray.length)/2)] ) /2 ; 
    }
}
