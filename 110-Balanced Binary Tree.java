/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        
        int depthOfLeft = getDepth(root.left, 1);
        int depthOfRight = getDepth(root.right, 1);
        
        if(Math.abs(depthOfRight-depthOfLeft) > 1){
            return false;
        }else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    
    private int getDepth(TreeNode tree, int currentDepth){
        if(tree == null){
            return currentDepth;
        }
        return Math.max(getDepth(tree.left, currentDepth+1), getDepth(tree.right, currentDepth+1));
    }
}
