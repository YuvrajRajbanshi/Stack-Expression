package Trie;

public class Trie {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {

            int indx = word.charAt(level) - 'a';
            if (curr.children[indx] == null)
                curr.children[indx] = new Node();
            curr = curr.children[indx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {

            int indx = key.charAt(level) - 'a';
            if (curr.children[indx] == null)
                return false;
            curr = curr.children[indx];
        }
        return curr.eow == true;
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(search("a"));
    }
}