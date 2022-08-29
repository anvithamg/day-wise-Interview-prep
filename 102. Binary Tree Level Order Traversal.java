/* 102. Binary Tree Level Order Traversal
Medium

10447

198

Add to List

Share
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000 */

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
   List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) { return res; }
        List<TreeNode> curr = new ArrayList<TreeNode>();
        curr.add(root);
        traverse(curr);
        return res;
    }

    public void traverse(List<TreeNode> level) {
        if(level.size() == 0) { return; }
        List<Integer> curr = new ArrayList<Integer>();
        List<TreeNode> next = new ArrayList<TreeNode>();
        for(TreeNode node : level) {
            curr.add(node.val);
            if(node.left != null) { next.add(node.left); }
            if(node.right != null) { next.add(node.right); }
        }
        res.add(curr);
        traverse(next);
    }
}
