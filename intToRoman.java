/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
COMPLETED
*/
class Solution {
    public String intToRoman(int num) {
        String str = "" ; 
        int num1 = 0 ; 
       if(num == 0) return "" ; 
       if(num >=1000) {
             num1 = num-1000 ; 
             str += "M" + intToRoman(num1);
             num = num1 ; 
          }
       else if(num>=100){
            if(num>=900){
                num1=num-900 ; 
                str += "CM"+intToRoman(num1) ; 
                num = num1 ; 
            }
            else if(num>=500){
                num1=num-500 ; 
                str += "D"+intToRoman(num1) ;     
                num = num1 ; 
            }
            
           else  if(num>=400){
                num1=num-400 ; 
                str += "CD"+intToRoman(num1) ;   
               num = num1 ; 
            }
            
           else if(num>=100){
                num1=num-100 ; 
                str += "C"+intToRoman(num1) ;
               num = num1 ; 
            }

        }
       else if(num>=10){
            if(num>=90){
                num1= num-90 ; 
                str += "XC"+intToRoman(num1) ;
                num = num1 ; 
            }
            else if(num>=50){
                num1 = num-50 ; 
                str += "L"+intToRoman(num1) ;
                num = num1 ; 
            }
            else if(num>=40){
                num1= num-40 ; 
                str += "XL"+intToRoman(num1) ;
            }
            
            else if(num >=10){
                num1= num-10 ; 
                str += "X"+intToRoman(num1) ;
                num = num1 ; 
            }
       }
        
      else if(num>0){
           if(num >= 9){ 
                         num1 = num - 9 ;
                         str += "IX"+intToRoman(num1) ; ;
                         num = num1 ; 
                    }
           else if(num >= 5) {
                   num1 = num - 5 ;
                   str += "V"+intToRoman(num1) ;  
                   num = num1 ; 
                 }
            else if(num >= 4) {

                    num1 = num -4 ; 
                    str +="IV"+intToRoman(num1) ; 
                    num = num1 ; 
                }

               else if (num >=1 ){
                    num1 = num - 1 ; 
                    str += "I"+intToRoman(num1) ;
                    num = num1 ; 
                }
          
            
      }
      return str ; 
    }
}
 
