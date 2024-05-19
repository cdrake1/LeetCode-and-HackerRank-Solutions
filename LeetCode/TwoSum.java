package LeetCode;

/*
 First problem -- Two Sum
 Given an array of integers nums and an integer target, 
 return indices of the two numbers such that they add up to target.
 You may assume that each input would have exactly one solution, 
 and you may not use the same element twice.
 
 You can return the answer in any order.
 */

import java.util.HashMap;

public class TwoSum {

    //----------Brute Force----------//
    public int[] twoSum(int[] nums, int target) {
        //use a nested for loop to iterate through the array
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                //check if different elements add up to the target
                if(nums[i] + nums[j] == target){
                    //return answer
                    int[] arrayOne = {i, j};
                    return arrayOne;
                }
            }
        }
        return null;    //if not found return null
    }


    //----------Faster Approach ----------//
    public int[] twoSumTwo(int[] nums, int target){
        return null;
    }
}