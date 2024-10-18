public class StackExample {
    
    // Node class representing each element in the stack
    static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        Node(int data) {
            this.data = data; // Initialize the data field
            this.next = null; // Initialize next to null
        }
    }

    // Stack class
    static class Stack {
        private Node top; // Top of the stack

        // Constructor to initialize the stack
        public Stack() {
            this.top = null; // Initialize top to null
        }

        // Push an element onto the stack (O(1))
        public void push(int data) {
            Node newNode = new Node(data); // Create a new node
            newNode.next = top; // Point new node to the current top
            top = newNode; // Update top to the new node
        }

        // Pop an element from the stack (O(1))
        public int pop() {
            if (isEmpty()) { // Check if the stack is empty
                throw new IllegalStateException("Stack is empty"); // Throw exception if empty
            }
            int poppedValue = top.data; // Get the data from the top node
            top = top.next; // Update top to the next node
            return poppedValue; // Return the popped value
        }

        // Peek at the top element without removing it (O(1))
        public int peek() {
            if (isEmpty()) { // Check if the stack is empty
                throw new IllegalStateException("Stack is empty"); // Throw exception if empty
            }
            return top.data; // Return the data of the top node
        }

        // Check if the stack is empty (O(1))
        public boolean isEmpty() {
            return top == null; // Return true if top is null
        }

        // Print the stack elements (O(n))
        public void printStack() {
            Node current = top; // Start from the top
            System.out.print("Stack: ");
            while (current != null) { // Traverse until the end
                System.out.print(current.data + " "); // Print current node's data
                current = current.next; // Move to the next node
            }
            System.out.println(); // New line after printing all elements
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(); // Create a new stack

        stack.push(10); // Push 10 onto the stack (O(1))
        stack.push(20); // Push 20 onto the stack (O(1))
        stack.push(30); // Push 30 onto the stack (O(1))

        stack.printStack(); // Outputs: Stack: 30 20 10

        System.out.println("Top element: " + stack.peek()); // Peek at the top element (O(1))

        int poppedValue = stack.pop(); // Pop the top element (O(1))
        System.out.println("Popped value: " + poppedValue); // Outputs: Popped value: 30
        stack.printStack(); // Outputs: Stack: 20 10
    }
}
