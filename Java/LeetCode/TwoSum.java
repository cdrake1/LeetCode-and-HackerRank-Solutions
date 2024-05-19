package Java.LeetCode;

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

    //----------Brute Force----------Time Complexity: O(n2)---//
    public int[] twoSum(int[] nums, int target) {
        //use a nested for loop to iterate through the array
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
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


    //----------Faster Approach ----------Time Complexity: O(n)---//
    public int[] twoSumTwo(int[] nums, int target){
        HashMap<Integer, Integer> twoSumMap = new HashMap<>();  //create an integer hashmap

        //iterate through the array and add all of the elements to the hashmap (num, index)
        for(int i = 0; i < nums.length; i++){
            twoSumMap.put(nums[i], i);
        }

        //iterate over the array again
        for(int j = 0; j < nums.length; j++){
            int goal = target - nums[j];    //find what number we will be looking for

            //check if that number is in the array and its not already being used
            if(twoSumMap.containsKey(goal) && twoSumMap.get(goal) != j){
                int second = twoSumMap.get(goal);
                int[] arrayOne = {j, second};
                return arrayOne;    //return answer
            }
        }
        return null;    //return null if not found
    }
}