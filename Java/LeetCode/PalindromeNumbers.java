package Java.LeetCode;

/*
 Second problem -- Palindrome Numbers
 Given an integer x, return true if x is a palindrome, and false otherwise.
 */

class PalindromeNumbers {

    //----------Faster Approach ----------Time Complexity: O(n)---//
    //beats 100% in speed, beats 81% in memory
    public boolean isPalindromeOne(int x) {
        //if the num is negative it is immediately disqualified
        if (x < 0){
            return false;
        }

        int tempX = x;  //maintain x's value
        int digitHolder = 0;    //var to hold each digit
        int palindrome = 0; //the palindrome

        palindrome = x % 10;    //palindrome equals the last digit of x
        x = x / 10; //remove the last digit from x

        //while loop
        while(x != 0){
            digitHolder = x % 10;   //digitHolder continuosly equals last digit
            palindrome = (palindrome * 10) + digitHolder;   //add digitHolder to palindrome
            x = x / 10; //remove digit from x
        }

        //check if equal
        if(tempX == palindrome){
            return true;
        }

        return false;
    }
}