package LeetCode;

/*
231 - Power of 2

Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.
*/

public class Powerof2 {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if(n == 0){ //if n is zero it will always be false
                return false;
            }
            
            //continuously divide by 2
            while(n != 1){
                //at anytime if there is a remainder other than 0 it is not a power of 2
                if(n % 2 != 0){
                    return false;
                }
                n = n / 2;  //continuously divide by 2
            }
            return true;        
        }
    }
}
