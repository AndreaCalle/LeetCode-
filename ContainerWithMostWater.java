/*
Container With Most Water
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
Find two lines, which together with x-axis forms a container, such that the container contains the most water.
COMPELETED
*/
class Solution {
    public int maxArea(int[] height) {
        if(height.length == 0) return 0 ; 
        if(height.length == 1) return height[1]; 
        
        int startpoint = height[0] ;
        int endpoint = height[1] ; 
        
        if(height.length==2){
             if(startpoint < endpoint){
                 return 1*startpoint ; 
             }
            else  return 1*endpoint ; 
        }

        int area =  0 ; 
        int check = 0;  
        
        while(check < height.length-1){
            int tempArea = 0 ; 
            int p = 0 ; 
            startpoint = height[check];
            for(int i = check +1; i <height.length;i++) {      
              int a = 0 ; 
              p++;
              endpoint = height[i];
              if(startpoint < endpoint) a = p*startpoint;
                else  a = p*endpoint;
              if(tempArea<a) tempArea = a ;               
            }
            check++;
            if(area < tempArea) area = tempArea ;
        }  
      return area ; 
    }
}
