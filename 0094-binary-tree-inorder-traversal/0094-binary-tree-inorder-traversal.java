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
    private List<Integer> treeTraverse(TreeNode root, List<Integer> li) {
        if (root == null) {
            return li;
        }
        treeTraverse(root.left, li);
        li.add(root.val);
        treeTraverse(root.right, li);
        return li;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        return treeTraverse(root, li);
    }
}