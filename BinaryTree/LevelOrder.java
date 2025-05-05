package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

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

    public static void prorder(Node root) {
        if (root == null)
            return;
        prorder(root.left);
        System.out.print(root.data + " ");
        prorder(root.right);
    }

    public static void levelTraversal(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + "  ");

            if (curr.left != null) {
                q.offer(curr.left);
            }
            if (curr.right != null) {
                q.offer(curr.right);
            }
        }

    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Level Order Traversal:");
        // levelOrder(root);
        levelTraversal(root);

    }
}