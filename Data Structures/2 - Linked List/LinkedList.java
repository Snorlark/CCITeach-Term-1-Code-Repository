public class LinkedListExample {
    
    // Node class representing each element in the linked list
    static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        Node(int data) {
            this.data = data; // Initialize the data field
            this.next = null; // Initialize next to null
        }
    }

    // LinkedList class
    static class LinkedList {
        private Node head; // Head of the linked list

        // Constructor to initialize the linked list
        public LinkedList() {
            this.head = null; // Initialize head to null
        }

        // Add a new node at the end of the list (O(n))
        public void add(int data) {
            Node newNode = new Node(data); // Create a new node
            if (head == null) {
                head = newNode; // If list is empty, set head to new node
                return; // Exit the method
            }
            Node current = head; // Start from the head
            while (current.next != null) { // Traverse to the end of the list
                current = current.next; // Move to the next node
            }
            current.next = newNode; // Link the new node at the end
        }

        // Print the linked list (O(n))
        public void printList() {
            Node current = head; // Start from the head
            System.out.print("Linked List: ");
            while (current != null) { // Traverse until the end
                System.out.print(current.data + " "); // Print current node's data
                current = current.next; // Move to the next node
            }
            System.out.println(); // New line after printing all elements
        }

        // Search for an element (O(n))
        public boolean contains(int data) {
            Node current = head; // Start from the head
            while (current != null) { // Traverse until the end
                if (current.data == data) { // Check if current node's data matches
                    return true; // Element found
                }
                current = current.next; // Move to the next node
            }
            return false; // Element not found
        }

        // Remove a node by value (O(n))
        public boolean remove(int data) {
            if (head == null) return false; // If list is empty, return false

            // If the node to remove is the head
            if (head.data == data) {
                head = head.next; // Move head to the next node
                return true; // Node removed
            }

            Node current = head; // Start from the head
            while (current.next != null) {
                if (current.next.data == data) { // Check next node
                    current.next = current.next.next; // Bypass the node to remove
                    return true; // Node removed
                }
                current = current.next; // Move to the next node
            }
            return false; // Node not found
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create a new linked list
        list.add(10); // Add 10 to the list (O(n))
        list.add(20); // Add 20 to the list (O(n))
        list.add(30); // Add 30 to the list (O(n))

        // Print the linked list (O(n))
        list.printList(); // Outputs: Linked List: 10 20 30

        // Search for an element (O(n))
        System.out.println("List contains 20: " + list.contains(20)); // true
        System.out.println("List contains 40: " + list.contains(40)); // false

        // Remove an element (O(n))
        list.remove(20); // Remove 20 from the list
        list.printList(); // Outputs: Linked List: 10 30
    }
}

