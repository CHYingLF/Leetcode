// House Robber III Solution


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rob(TreeNode root) {
        return Math.max(helper(root)[0], helper(root)[1]);
    }
    
    private int[] helper(TreeNode root) {
        if (root == null) return new int[2];
        int[] ans = new int[2];
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        ans[0] = root.val + left[1] + right[1];
        ans[1] = Math.max(left[1], left[1]) + Math.max(right[0], right[1]);
        
        return ans;
    }
}

