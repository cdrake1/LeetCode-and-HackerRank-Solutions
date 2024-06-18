package LeetCode;

/*
2 -- Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. 
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

class Add2Numbers {

    //----------Brute Force----------Time Complexity: O(n2)---//
    //passed run, but failed submission
    public ListNode addTwoNumbers() {
        int numOne = 0; //the first digit as an int
        int numTwo = 0; //the second digit as an int
        int sum = 0;    //the sum of the first and second nums
        ArrayList<Integer> tempNum = new ArrayList<>(); //an arraylist to hold the values

        ListNode tempNodeOne = l1;
        //iterate through the first list and add them to arraylist
        while(tempNodeOne != null){
            tempNum.add(tempNodeOne.val);
            tempNodeOne = tempNodeOne.next;
        }

        numOne = tempNum.get(tempNum.size() - 1);   //get the last value
        //iterate through the arraylist backwards
        for(int i = tempNum.size() - 2; i >= 0; i--){
            int temp = tempNum.get(i);  //grab value
            numOne = (numOne * 10) + temp;  //add to first digit
        }

        tempNum.clear();    //clear arraylist
        ListNode tempNodeTwo = l2;
        //iterate through the second list and add them to arraylist
        while(tempNodeTwo != null){
            tempNum.add(tempNodeTwo.val);
            tempNodeTwo = tempNodeTwo.next;
        }

        numTwo = tempNum.get(tempNum.size() - 1);   //get the last value
        //iterate through the arraylist backwards
        for(int i = tempNum.size() - 2; i >= 0; i--){
            int temp = tempNum.get(i);  //grab value
            numTwo = (numTwo * 10) + temp;  //add to first digit
        }

        sum = numOne + numTwo;  //find the sum of both numbers
        int digitHolder = 0;
        ListNode l3 = new ListNode(sum % 10); //make the first node the lastdigit
        ListNode current = l3;
        sum = sum / 10; //remove the last digit

        //iterate until == 0 
        while(sum != 0){
            digitHolder = sum % 10; //temp val
            ListNode newNode = new ListNode(digitHolder);   //new node with digit
            current.next = newNode; //move pointers
            current = newNode;
            sum = sum / 10; //remove digit off of the end
        }

        return l3;  //return the answer
    }

}