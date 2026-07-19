class Solution {
    class MakeTree {
        TreeNode node;
        boolean flag;
        MakeTree(TreeNode node,boolean flag) {
            this.node = node;
            this.flag = flag;
        }
    }

    public void inorder(TreeNode root, List<Integer> list) {
        Stack<MakeTree> st = new Stack<>();
        st.push(new MakeTree(root,false));
        while(!st.isEmpty()) {
            MakeTree currNode = st.pop();
            if(!currNode.flag) {
                if(currNode.node.right != null) st.push(new MakeTree(currNode.node.right,false));
                st.push(new MakeTree(currNode.node,true));
                if(currNode.node.left != null) st.push(new MakeTree(currNode.node.left,false));
            } else {
                list.add(currNode.node.val);
            }
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        inorder(root,list);  
        return list;
    }
}