package LeetCode;

/*
238 - Product of Array Except Self

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
*/

public class ProductOfArrayExceptSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] products = new int[nums.length];  //contains all of the products except itself for each index
            int right = 1, left = 1;    //two variables that hold the products to the left and right of the current index
    
            //iterate left to right
            for(int i = 0; i < nums.length; i++){
                products[i] = left; //set current index in answer array to the product of all elements on the left of it
                left *= nums[i];    //multiply the current index of the nums array to the left var
            }
    
            //iterate right to left
            for(int j = nums.length - 1; j >= 0; j--){
                products[j] *= right;   //set current index to the product of the current index and every num on its right hand side
                right *= nums[j];   //multiply the right variable by the current index in nums
            }
    
            return products;    //return answer array
        }
    }
    
    //create a product array to hold the solution
    //create two variables left and right. 
        //The left var holds the product of every num to the left of the current index
        //The right var holds the product of every num to the right of the current index
    //iterate left to right. Set the current index of the solution array to the product of all of the elements to its left
        //then multiply the left variable to the current index of the nums array
    //iterate right to left. Set the current index of the solution array to the product of itself times everything on its right
        //then update the right variable by multiplying it by the current index of the nums array
}
