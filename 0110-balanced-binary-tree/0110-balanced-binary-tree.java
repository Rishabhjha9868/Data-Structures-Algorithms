class Solution {
    private boolean result = true;
    private int balanced(TreeNode node) {
        if(node == null) return 0;
        int left = balanced(node.left);
        int right = balanced(node.right);
        if(Math.abs(left-right)>1) result = false;
        return 1+ Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        balanced(root);
        return result;
    }
}