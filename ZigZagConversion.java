/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
(you may want to display this pattern in a fixed font for better legibility)
And then read line by line: "PAHNAPLSIIGYIR"
COMPELETED
*/
class Solution {
    public String convert(String s, int numRows) {

       if(s.length()<=2) return s ;
       if(numRows == 1 ) return s ; 

        String str = "" ; 
        int counter = 0 ; 
        int row =   0;
        int coln = 0 ; 
        String [][] tempstr = new String[numRows][s.length()]; 

       while(counter < s.length()){
           for(int i = 0 ; i < numRows; i++){
               if(counter >= s.length())break ; 
               tempstr[i][coln] =  Character.toString(s.charAt(counter)); 
               counter ++;
              }            
            coln++ ;        
            for(int i = numRows-2; i >0 ; i--){
                    if(counter >= s.length())break ; 
                    tempstr[i][coln] =  Character.toString(s.charAt(counter));  
                     counter ++ ; 
                     coln ++ ; 
                 }             
        }
        
        while(row < numRows){   
            for(int i = 0 ; i <= coln ; i++){
             if( tempstr[row][i]!= null){ 
                     str = str + tempstr[row][i] ; 
                 }
            }
            row ++ ; 
        }
      return str;  
 
    }
}
