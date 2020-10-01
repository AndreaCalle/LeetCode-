/*
Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without repeating characters.
COMPLETED
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {

        ArrayList<String> test = new ArrayList<String>(); 
        String temp[] = s.split("");
        
        for(int i = 0 ; i < s.length(); i ++){
        ArrayList<String> test2 = new ArrayList<String>(); 
            for(int j = i ; j < s.length(); j++){
                
                if(test2.contains(temp[j])){
                    break ; 
                }

                test2.add(temp[j]);
            }
            if(test2.size() > test.size()){
                    test = test2 ; 
            }
        }

        return test.size() ;
    }
}
