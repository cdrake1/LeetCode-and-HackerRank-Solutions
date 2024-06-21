package LeetCode;

/*
5 -- Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.

*/

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return ""; //return empty depending on input

        int start = 0, end = 0; //pointers for start and end points

        //loop through string and call helper method
        for(int i = 0; i < s.length(); i++){
            int len1 = expandFromCenter(s, i, i);
            int len2 = expandFromCenter(s, i, i+1);
            int longest = Math.max(len1, len2); //longest of both palindromes
            
            //readjust the pointers
            if(longest > end - start){
                start = i - ((longest - 1) / 2);
                end = i + (longest / 2);
            }
        }
        return s.substring(start, end + 1); //return answer
    }

    //helper method to expand from the center
    public int expandFromCenter(String s, int left, int right){
        if(s == null || s.length() < 1) return 0;   //return depending on length

        //iterate from the center out until the characters on either side dont match
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;    //return length
    }
}
