package LeetCode;

import java.util.HashSet;

/*
 3 -- Longest Substring Without Repeating Characters
 
 Given a string s, find the length of the longest substring without repeating characters.
*/

public class LongestSubStringWithoutRepeatingChars {

    public int lengthOfLongestSubstring(String s) {
        if(s.equals(" ") || s.length() == 1){
            return 1;
        }

        int longestSubString = 0;   //the longest substring without repeating chars
        int currentSubString = 0;   //keep track of current iteration
        HashSet<Character> provenChars = new HashSet<>();   //keep track of what characters we have seen

        //iterate letter by letter
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                char currentChar = s.charAt(j); //current character we are on
                if(provenChars.contains(currentChar)){
                    //end current count
                    //check if current > longest and update vars
                    if(currentSubString > longestSubString){
                        longestSubString = currentSubString;
                    }
                    //clear hashset, curr count, and break loop
                    provenChars.clear();
                    currentSubString = 0;
                    break;
                }
                else{
                    //character not in set
                    provenChars.add(currentChar);   //add it
                    currentSubString += 1;  //update curr count
                }
            }
        }
        return longestSubString;    //return longest count
    }
}