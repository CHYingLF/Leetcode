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
    public TreeNode sortedArrayToBST(int[] nums) {
        return BST(nums, 0, nums.length - 1);
    }
    private TreeNode BST(int[] nums, int n1, int n2){
        if (n1 > n2) {
            return null;
        }
        
        int mid = (n1 + n2) /2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = BST(nums, n1, mid-1);
        node.right = BST(nums, mid+1, n2);
            
        return node;
    }
    }