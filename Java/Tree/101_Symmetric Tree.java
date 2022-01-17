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
    public boolean isSymmetric(TreeNode root) {
        return isSym(root.left, root.right);
    }
    private boolean isSym(TreeNode L, TreeNode R){
        if (L != null && R != null && L.val == R.val)
            return isSym(L.left,R.right) && isSym(L.right, R.left);
            
        return L==R;
    }
        
}

* Method 2
class Solution {
    public boolean isSymmetric(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        
        while (!stack.empty()){
            TreeNode L = stack.pop(), R = stack.pop();
            if (L != null && R != null && L.val==R.val){
                stack.push(L.left);
                stack.push(R.right);
                stack.push(L.right);
                stack.push(R.left);}
            else if (L == null && R == null){
                continue;}
            else{
                return false;}
        }
        return true;
        
    }   
}