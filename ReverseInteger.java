/*
Reverse Integer
Given a 32-bit signed integer, reverse digits of an integer.
*/
class Solution {
    public int reverse(int x) {
        if(x == 0)return 0 ; 
        int z = 0 ; 
        int neg = 1; 
        String temp = "";     

        while(x != 0){  
          if(x < 0 ){
              x*=-1 ; 
              neg = 0 ;
          }
          z = x % 10 ; 
          temp += Integer.toString(z) ;   
          x /= 10 ;      
        
          long i = Long.parseLong(temp);
        
          if(i > Integer.MAX_VALUE)return 0 ; 
            
         if(i < Integer.MIN_VALUE) return 0 ;   
            
        }
        z = Integer.parseInt(temp);
        if(neg == 0) z *= -1 ;
        return z; 
    }
    
}
