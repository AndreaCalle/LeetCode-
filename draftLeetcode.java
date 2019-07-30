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

Question #4 Hacker Leet 
    //import com.google.common.collect.ObjectArrays;
import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      List list = new ArrayList(Arrays.asList(nums1));
      list.addAll(Arrays.asList(nums2));
     // Arrays [] temp = Arrays.sort(list.toArray()); 
      System.out.println(list); 
      return 1.0 ; 
    }
}