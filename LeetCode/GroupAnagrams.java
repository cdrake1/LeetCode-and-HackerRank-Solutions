package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
49 - Group Anagrams
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

*/

public class GroupAnagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            //hashmap to hold the sorted string and each group of anagrams
            HashMap<String, List<String>> allAnagrams = new HashMap<>();
            
            //iterate through each string within the array
            for(String string : strs){
                char[] temp = string.toCharArray(); //string -> char array
                Arrays.sort(temp);  //sort it
                String key = String.valueOf(temp);  //sorted string

                //if its not in the hashmap add the key
                if(!allAnagrams.containsKey(key)) allAnagrams.put(key, new ArrayList<>());
                allAnagrams.get(key).add(string);   //add the unsorted string to the values list
            }
            return new ArrayList<>(allAnagrams.values());   //values creates a collection for all the hashmaps values
        }
    }
}
