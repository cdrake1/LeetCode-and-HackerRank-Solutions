package LeetCode;

import javax.swing.tree.TreeNode;

/*
100 - Same Tree

Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
*/

public class SameTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //if both the root nodes are null return true
        if(p == null && q == null){
            return true;
        }
        
        //if either of the nodes are null or they do not equal each other return false
        if(p != null && q != null && p.val == q.val ){
            //recursively call this function with the left and right nodes
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        else{
            return false;
        }
    }
}

//first compare the nodes and check if they are both null
    //if they are both null return true
//check if the left node and right node are null and the values are equal
    //recursively call itself with the left and right nodes to continue to check
//otherwise return false as the values are not equal on both trees
//O(p+q) as you are dfs both trees
}
