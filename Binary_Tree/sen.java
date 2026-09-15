package Binary_Tree;

public class sen {
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

        int result = 0;

        System.out.println("Diameter of Binary Tree = " + result);
    }
}
