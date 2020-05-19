class Solution {
    public int myAtoi(String str) {
      if(str.equals("")) return 0 ; 
      int n = 1 ; 
      str = str.replaceAll("^\\s+", "");
     // System.out.println(str);
      if(str.matches("^(-)([0-9]).*")) n = -1 ; 
      if(str.matches("^[0-9].*") || str.matches("^(-)([0-9]).*")||str.matches("^(\\+)([0-9]).*")){
          String i= str.replaceAll("[^0-9\\.]+","");
//"[0-9]*\\.?[0-9]*  \\.?[0-9]*
          System.out.println(i);
          Double t = Double.parseDouble(i) *n;
          if(t > Integer.MAX_VALUE) return Integer.MAX_VALUE ;     
          if(t < Integer.MIN_VALUE) return Integer.MIN_VALUE ;   
          return t.intValue()  ;
      }
      else return 0 ; 
    //  return n   ;   
    }
}
