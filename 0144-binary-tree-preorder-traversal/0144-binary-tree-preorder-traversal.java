class Solution {
    private List<Integer> preOrder(TreeNode node,List<Integer> list) {
        if(node == null) return list;
        list.add(node.val);
        preOrder(node.left,list);
        preOrder(node.right,list);
        return list;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        return preOrder(root,new ArrayList<>());
    }
}