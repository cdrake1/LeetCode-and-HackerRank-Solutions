package LeetCode;

public class MaxDepthOfBinarySearchTree {

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
        public int maxDepth(TreeNode root) {
            if(root == null) return 0;

            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }
}

//originally I tried to use recursion via 2 functions going left and right separately, but this failed.
//after researching more I was able to find this simple 2 line solution which is ingenius