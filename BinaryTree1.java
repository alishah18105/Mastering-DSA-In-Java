public  class BinaryTree1{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Tree{
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index]== -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root){
            
            if(root == null){
                return;
            }
            
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postOrder(Node root){
            
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            
            System.out.print(root.data + " ");
        }
    }

    public static void main(String args[]){
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree tree =  new Tree();
        Node root = tree.buildTree(nodes);
        System.out.print("Pre Order Traversal: ");
        tree.preorder(root);
        System.out.println();

        System.out.print("In Order Traversal: ");
        tree.inorder(root);
        System.out.println();
        
        System.out.print("Post Order Traversal: ");
        tree.postOrder(root);

    }
}