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
    private TreeNode help(TreeNode node){
        if(node == null){
            return null;
        }

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        node.left = help(node.left);
        node.right = help(node.right);
        return node;

    }

    public TreeNode invertTree(TreeNode root) {
        return help(root);
    }
}
