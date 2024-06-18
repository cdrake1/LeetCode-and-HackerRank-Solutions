package LeetCode;

/*
13 -- Roman To Integer

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. 
However, the numeral for four is not IIII. Instead, the number four is written as IV. 
Because the one is before the five we subtract it making four. 
The same principle applies to the number nine, which is written as IX. 
There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
*/

public class RomanToInteger {
    public char prev;   //previous roman numeral in string
    public int total;   //total amount
    
    public int romanToInt(String s) {
        //iterate through string
        for(int i = 0; i < s.length(); i++){
            convert(s.charAt(i), i);   //call function with current
        }
        return total;
        
    }
    
    //function to convert roman to int
    public void convert(char c, int position){
        if(position == 0){  
            //cant check previous if its the first value
            switch(c){  //switch case to add the correct amount
                case 'I':
                    total += 1;
                    break;
                case 'V':
                    total += 5;
                    break;
                case 'X':
                    total += 10;
                    break;
                case 'L':
                    total += 50;
                    break;
                case 'C':
                    total += 100;
                    break;
                case 'D':
                    total += 500;
                    break;
                case 'M':
                    total += 1000;
                    break;
            }
            prev = c;   //set previous
        }
        else{
            switch(c){  //not first value so can check previous and subtract correct amount
                case 'I':
                    total += 1;
                    break;
                case 'V':
                    if(prev == 'I'){
                        total += 3;
                    }
                    else{
                        total += 5;
                    }
                    break;
                case 'X':
                    if(prev == 'I'){
                        total += 8;
                    }
                    else{
                        total += 10;
                    }
                    break;
                case 'L':
                    if(prev == 'X'){
                        total += 30;
                    }
                    else{
                        total += 50;
                    }
                    break;
                case 'C':
                    if(prev == 'X'){
                        total += 80;
                    }
                    else{
                        total += 100;
                    }
                    break;
                case 'D':
                    if(prev == 'C'){
                        total += 300;
                    }
                    else{
                        total += 500;
                    }
                    break;
                case 'M':
                    if(prev == 'C'){
                        total += 800;
                    }
                    else{
                        total += 1000;
                    }
                    break;
            }
            prev = c;   //set previous
        }
    }
}