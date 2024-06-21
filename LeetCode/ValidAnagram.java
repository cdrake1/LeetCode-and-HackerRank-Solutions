package LeetCode;

/*
242 -- Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.
*/

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        String sortedS = sortString(s); //sorted string variables
        String sortedT = sortString(t);

        if(sortedS.equals(sortedT)){    //check if they are equal
            return true;
        }
        return false;   //if not return false
    }

    //function to sort strings
    public String sortString(String s){
        //use built in array functions to sort the string and return it
        char[] stringToArray = s.toCharArray();
        Arrays.sort(stringToArray);
        return Arrays.toString(stringToArray);
    }
}
