package BinaryTree;

import java.util.ArrayList;
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

    public static void levelTraversal(Node root) {
        if (root == null)
            return;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();

            int level = q.size();
            for (int i = 0; i < level; i++) {
                Node curr = q.poll();
                list.add(curr.data);

                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
            ans.add(list);

        }

        System.out.println(ans);
        // System.out.println(list);

    }
    // [10, 20, 30, 40, 50]
    // [[10], [20, 30], [40, 50]]

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