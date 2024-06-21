package LeetCode;

/*
3110 -- Score of a String

You are given a string s.

The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

Return the score of s.
*/

public class ScoreOfAString {
    public int scoreOfString(String s) {
        int score = 0;  //score of the string

        //iterate through the string
        for(int i = 1; i < s.length(); i++){
            int prev = (int) s.charAt(i - 1);   //previous char ascii
            int curr = (int) s.charAt(i);   //current char ascii
            score += Math.abs(prev - curr); //abs value of prev - curr
        }
        return score;   //return answer -- O(n)
    }    
}