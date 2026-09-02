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
    private int help(TreeNode node, int height){
        if(node == null){
            return height;
        }

        return Math.max(help(node.left, height+1), help(node.right,height+1));
    }
    public int maxDepth(TreeNode root) {
        return help(root,0);
    }
}
