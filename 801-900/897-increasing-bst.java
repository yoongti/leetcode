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
// O(n), 0ms, 36.9MB
class Solution {
  public TreeNode increasingBST(TreeNode root) {
      return increasingBST(root, null);
  }

  public TreeNode increasingBST(TreeNode root, TreeNode tail) {
      if (root == null) return tail;
      TreeNode res = increasingBST(root.left, root);
      root.left = null;
      root.right = increasingBST(root.right, tail);
      return res;
  }
}