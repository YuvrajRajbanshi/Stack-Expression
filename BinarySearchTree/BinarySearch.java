package BinarySearchTree;

public class BinarySearch {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insertNode(Node root, int val) {
        if (root == null) {
            return root = new Node(val);
        }

        if (root.data > val) {
            root.left = insertNode(root.left, val);
        } else {
            root.right = insertNode(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root) {

        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + "  ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int nums[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < nums.length; i++) {
            root = insertNode(root, nums[i]);
        }
        inOrder(root);
    }
}