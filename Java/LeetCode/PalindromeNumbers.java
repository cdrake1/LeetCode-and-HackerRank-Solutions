package Java.LeetCode;

import java.util.Stack;

class PalindromeNumbers {

    public boolean isPalindromeOne(int x) {
        if(x <= 0){
            return false;
        }
        
        Stack<Integer> stack = new Stack<>();
        int original = x;
        int palindrome = 0;

        while(x != 0){
            int remainder = x % 10;
            stack.push(remainder);
            x = x / 10;
        }

        palindrome = stack.pop();

        while(!stack.isEmpty()){
            if(palindrome == 0){
                palindrome = stack.pop();
            }
            else{
                palindrome = (palindrome * 10) + stack.pop();
            }
        }
        
        return palindrome == original;
    }
}