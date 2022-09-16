/*104. Maximum Depth of Binary Tree
Easy

8423

138

Add to List

Share
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2*/
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
    int maxDep = 0;
    public int maxDepth(TreeNode root) {
        if(root==null) return maxDep;
        dfs(root,1);
        return maxDep;
    }
    public void dfs(TreeNode root,int count){
        if(root==null) return;
        if(maxDep<count)
            maxDep = count;
        dfs(root.left,count+1);
        dfs(root.right,count+1);
    }
}
