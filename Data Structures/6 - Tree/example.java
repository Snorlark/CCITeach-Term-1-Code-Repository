public class BinaryTreeExample {
    
    // Node class representing each node in the binary tree
    static class Node {
        int value; // Value of the node
        Node left; // Reference to the left child
        Node right; // Reference to the right child

        Node(int value) {
            this.value = value; // Initialize the node value
            left = null; // Initialize left child as null
            right = null; // Initialize right child as null
        }
    }

    // BinaryTree class
    static class BinaryTree {
        Node root; // Root node of the binary tree

        // Constructor to initialize the binary tree
        public BinaryTree() {
            root = null; // Start with an empty tree
        }

        // Insert a value into the binary tree (O(log n) on average)
        public void insert(int value) {
            root = insertRec(root, value); // Start the recursive insertion
        }

        // Recursive method to insert a new value
        private Node insertRec(Node root, int value) {
            // If the tree is empty, create a new node
            if (root == null) {
                root = new Node(value); // Create new node
                return root; // Return new node
            }

            // Otherwise, recursively find the correct position
            if (value < root.value) { // If value is less than root's value, go left
                root.left = insertRec(root.left, value); // Insert in left subtree
            } else if (value > root.value) { // If value is greater than root's value, go right
                root.right = insertRec(root.right, value); // Insert in right subtree
            }
            // Return the unchanged root pointer
            return root; // Return root
        }

        // Inorder traversal of the binary tree (O(n))
        public void inorder() {
            inorderRec(root); // Start the recursive inorder traversal
        }

        // Recursive method for inorder traversal
        private void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left); // Visit left subtree
                System.out.print(root.value + " "); // Visit node
                inorderRec(root.right); // Visit right subtree
            }
        }

        // Search for a value in the binary tree (O(log n) on average)
        public boolean search(int value) {
            return searchRec(root, value); // Start the recursive search
        }

        // Recursive method to search for a value
        private boolean searchRec(Node root, int value) {
            // If the tree is empty or the value is found
            if (root == null) {
                return false; // Value not found
            }
            if (root.value == value) {
                return true; // Value found
            }
            // Recur down the tree
            return value < root.value ? searchRec(root.left, value) : searchRec(root.right, value);
        }

        // Find the minimum value in the binary tree (O(log n) on average)
        public int findMin() {
            return findMinRec(root); // Start the recursive minimum search
        }

        // Recursive method to find the minimum value
        private int findMinRec(Node root) {
            // Find the leftmost leaf node
            return root.left == null ? root.value : findMinRec(root.left); // Return minimum value
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); // Create a new binary tree

        // Insert values into the binary tree
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 

        System.out.println("Inorder traversal of the binary tree: ");
        tree.inorder(); // Perform inorder traversal (O(n))
        System.out.println();

        // Search for values in the binary tree
        System.out.println("Is 40 present in the tree? " + tree.search(40)); // Search for 40 -> Outputs: true
        System.out.println("Is 100 present in the tree? " + tree.search(100)); // Search for 100 -> Outputs: false

        // Find minimum value in the binary tree
        System.out.println("Minimum value in the binary tree: " + tree.findMin()); // Find minimum -> Outputs: 20
    }
}

