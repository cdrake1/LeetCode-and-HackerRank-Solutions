package LeetCode;
import java.util.HashMap;
import java.util.PriorityQueue;

/*
347 -- Top K Frequent Elements

Given an integer array nums and an integer k, return the k most frequent elements. 
You may return the answer in any order.
*/

public class TopKFrequentElements {
    class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> Occurrences = new HashMap<>();    //counts frequency of each num
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> Occurrences.get(b) - Occurrences.get(a)); //holds all nums in order of value
        int[] topKElements = new int[k]; //solution array of size k

        //iterate through array and add the arrays numbers and their frequency
        for(int i = 0; i< nums.length; i++){
            if(Occurrences.containsKey(nums[i])){   //num already in hashmap. Increment frequency counter
                Occurrences.put(nums[i], Occurrences.get(nums[i]) + 1);
            }
            else{   //num not in so add it
                Occurrences.put(nums[i], 1);
            }
        }

        //add each key value to the priority queue
        for(int key : Occurrences.keySet()){
            maxHeap.add(key);
        }

        //remove the top 2 elements from the priority queue
        for(int i = 0; i < k; i++){
           topKElements[i] = maxHeap.poll();
        }

        return topKElements;    //return the answer
    }
}

//iterate through the array and add each number and its frequency to the hashmap
//if its already in the hashmap simply increment the frequency counter for that number
//afterwards add each number and its frequency to the priority queue. That way its orders based off of the frequency.
//add the top two elements from the priority queue to the solution array and return it
}