/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
COMPLETED
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
     String prefix = ""; 
     int c = 1;
     if(strs.length == 0){ return prefix ; }
     if(strs.length == 1) return strs[0]; 
        
     while(c <= strs[0].length()){
         int x = 0; 
         if(strs[0].length() ==0 )return prefix ; 
         String temp = strs[0].substring(0,c);
         for(int i = 1; i < strs.length ; i ++){
             String temp2 = strs[i];
             if(temp.length()>temp2.length()) return prefix; 
             temp2 = strs[i].substring(0,c); 
             if(temp2.equals(temp))  x ++; 
             
             else return prefix;
         } 
        if(x == strs.length -1) prefix = temp;
        c++; 
     }
        return prefix;
  }
    
}
