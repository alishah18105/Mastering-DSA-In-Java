import java.util.*;

public class SimpleTree {
    static class Node {
        int data;
        List<Node> children;

        Node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    static class Tree {
        public static Node buildTree() {
           
            Node root = new Node(1);
            Node node2 = new Node(2);
            Node node3 = new Node(3);
            Node node4 = new Node(4);
            Node node5 = new Node(5);
            Node node6 = new Node(6);

            root.children.add(node2);
            root.children.add(node3);
            root.children.add(node4);

            node3.children.add(node5);
            node3.children.add(node6);

            return root;
        }

        public static void preorder(Node root) {
            if (root == null) return;
            System.out.print(root.data + " ");
            for (Node child : root.children) {
                preorder(child);
            }
        }

        public static void postOrder(Node root) {
            if (root == null) return;
            for (Node child : root.children) {
                postOrder(child);
            }
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.buildTree();

        System.out.print("Pre Order Traversal: ");
        tree.preorder(root);
        System.out.println();

        System.out.print("Post Order Traversal: ");
        tree.postOrder(root);
    }
}
