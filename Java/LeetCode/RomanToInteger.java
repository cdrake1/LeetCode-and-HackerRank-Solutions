package Java.LeetCode;

/*
Thirteenth problem -- Roman To Integer

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

    public int romanToInt(String s) {
        int sum = 0;
        char currentLetter;
        int j = 0;
        for(int i = 0; i < s.length(); i++){

            if(i < s.length() - 1){
                j = i + 1;
            }
            else{
                j = s.length() - 1;
            }

            currentLetter = s.charAt(i);
            switch(currentLetter){
                case 'I':
                    if(s.charAt(j) == ('V')){
                        sum += 4;
                        continue;
                    }
                    else if(s.charAt(j) == ('X')){
                        sum += 9;
                        continue;
                    }
                    else{
                        sum += 1;
                    }
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if(s.charAt(j) == ('L')){
                        sum += 40;
                        continue;
                    }
                    else if(s.charAt(j) == ('C')){
                        sum += 90;
                        continue;
                    }
                    else{
                        sum += 10;
                    }
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if(s.charAt(j) == ('D')){
                        sum += 400;
                        continue;
                    }
                    else if(s.charAt(j) == ('M')){
                        sum += 900;
                        continue;
                    }
                    else{
                        sum += 100;
                    }
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }

        return sum;
    }
}