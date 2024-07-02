package LeetCode;

public class InvertBinaryTree {

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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;   //if the root is null return null

        //create a new root node for a new tree
        TreeNode newTree = new TreeNode(root.val);

        //inversion is a hint at recurssion
        //call the current function both with the right and left nodes
        newTree.left = invertTree(root.right);
        newTree.right = invertTree(root.left);

        return newTree; //return the inverted binary tree
    }
}

//start with returning null if the input root node is null
//next create a new tree with a new root node
//since invert is a hint at recurssion we are going to call the current function 2 times
//one with the left child and one with the right child
//at the same time we are going to set the new trees left and right nodes as the value of what is returned from recursion
//then just return the new trees root!
    
}
