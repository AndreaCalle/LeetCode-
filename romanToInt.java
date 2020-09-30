/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
For example, two is written as II in Roman numeral, just two one's added together.
Twelve is written as, XII, which is simply X + II. 
The number twenty seven is written as XXVII, which is XX + V + II.
COMPELETED
SHOULD SIMPLIFY IT 
*/
class Solution {
    public int romanToInt(String s) {
       int i = 1; 
       int v = 5 ; 
       int x = 10 ; 
       int l = 50 ; 
       int c = 100 ; 
       int d = 500 ; 
       int m = 1000; 
       int total = 0 ; 
       String temp = ""; 
       if(s.equals("")) return total ; 
       for(int n = 0 ; n < s.length(); n++){
           String st = s.substring(n,n+1); 
           if(n <  s.length()-1) temp = s.substring(n+1,n+2); 
           if(st.equals("I")) {
               if(temp.equals("V")){
                   total += v-2   ;
                   n++;
                 }
               if(temp.equals("X")){
                   total += x-2   ;
                   n++;   
                 }
               total += i ; 
           }
           if(st.equals("V")) total += v ;
           if(st.equals("X")){
               if(temp.equals("L")){
                   total += l-20   ;
                   n++;
                 }
               if(temp.equals("C")){
                   total += c-20   ;
                   n++;   
                 }   
               total += x ;
           }
           if(st.equals("L")) total += l ;
           if(st.equals("C")){
               if(temp.equals("M")){
                   total += m-200   ;
                   n++;
                 }
               if(temp.equals("D")){
                   total += d-200   ;
                   n++;   
                 }
               total += c ; 
           }
           if(st.equals("D")) total += d ;
           if(st.equals("M")) total += m ;
       }
       return total;
       
    }
}
