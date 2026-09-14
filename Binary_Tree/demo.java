package Binary_Tree;

public class demo {

    // TreeNode class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(9);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        demo obj = new demo();

        int result = obj.diameterOfBinaryTree(root);

        System.out.println("Diameter of Binary Tree = " + result);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        int D = height(root.left) + height(root.right);

        int l = diameterOfBinaryTree(root.left);
        int r = diameterOfBinaryTree(root.right);

        return Math.max(D, Math.max(l, r));
    }

    public int height(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }
}