package LeetCode;

public class DiameterOfBinaryTree {
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
    int max;    //global variable holding max diameter

        //main function
        public int diameterOfBinaryTree(TreeNode root) {
            dfs(root);  //call dfs and pass in the root
            return max; //return the max diameter
        }

        //dfs function to find the max diameter
        public int dfs(TreeNode root){
            if(root == null) return 0;  //if the node is null return 0

            //call recursion with the left and right to find the subtree heights
            int left = dfs(root.left);
            int right = dfs(root.right);

            //find diameter of current subtree
            max = Math.max(max, right + left);

            //return the maximum diameter. Add 1 for the root
            return 1 + Math.max(left, right);
        }
    }
}