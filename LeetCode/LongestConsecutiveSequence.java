package LeetCode;

import java.util.HashSet;

/*
128 - Longest Consecutive Sequence

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
*/

public class LongestConsecutiveSequence {
    class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numsWithoutDups = new HashSet<>(); //set to contain array without duplicates
        int longestConsecutive = 0; //counter for the amount of longest consecutive
        int currentSeq = 0; //keep track of the current sequence

        //iterate through the array and add each unique element to the set
        for(int i = 0; i < nums.length; i++){
            numsWithoutDups.add(nums[i]);
        }

        //iterate through hashset
        for(int num : numsWithoutDups){
            //the the previous digit is not the number before the current then it is the start of a new sequence
            if(!numsWithoutDups.contains(num - 1)){
                currentSeq = 1; //set the current sequence
                //while the set contains the next number increment the count
                while(numsWithoutDups.contains(num + currentSeq)){
                    currentSeq++;
                }
                longestConsecutive = Math.max(currentSeq, longestConsecutive);  //find the max
            }
        }
        return longestConsecutive;  //return the max seq
    }
}

//iterate through the array and add unique elements to the set
//iterate through the set
    //check if the prev number is the number that comes before the current
    //set the current seq counter
    //while the set contains the next number increment the counter
//find the max
//return it
}
