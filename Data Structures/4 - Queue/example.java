public class QueueExample {
    
    // Node class representing each element in the queue
    static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        Node(int data) {
            this.data = data; // Initialize the data field
            this.next = null; // Initialize next to null
        }
    }

    // Queue class
    static class Queue {
        private Node front; // Front of the queue
        private Node rear; // Rear of the queue

        // Constructor to initialize the queue
        public Queue() {
            this.front = null; // Initialize front to null
            this.rear = null; // Initialize rear to null
        }

        // Enqueue an element at the rear of the queue (O(1))
        public void enqueue(int data) {
            Node newNode = new Node(data); // Create a new node
            if (rear == null) { // If queue is empty
                front = rear = newNode; // Both front and rear point to new node
                return; // Exit the method
            }
            rear.next = newNode; // Link the new node at the end
            rear = newNode; // Update the rear to the new node
        }

        // Dequeue an element from the front of the queue (O(1))
        public int dequeue() {
            if (isEmpty()) { // Check if the queue is empty
                throw new IllegalStateException("Queue is empty"); // Throw exception if empty
            }
            int dequeuedValue = front.data; // Get the data from the front node
            front = front.next; // Move front to the next node
            if (front == null) { // If queue becomes empty after dequeuing
                rear = null; // Set rear to null as well
            }
            return dequeuedValue; // Return the dequeued value
        }

        // Peek at the front element without removing it (O(1))
        public int peek() {
            if (isEmpty()) { // Check if the queue is empty
                throw new IllegalStateException("Queue is empty"); // Throw exception if empty
            }
            return front.data; // Return the data of the front node
        }

        // Check if the queue is empty (O(1))
        public boolean isEmpty() {
            return front == null; // Return true if front is null
        }

        // Print the queue elements (O(n))
        public void printQueue() {
            Node current = front; // Start from the front
            System.out.print("Queue: ");
            while (current != null) { // Traverse until the end
                System.out.print(current.data + " "); // Print current node's data
                current = current.next; // Move to the next node
            }
            System.out.println(); // New line after printing all elements
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(); // Create a new queue

        queue.enqueue(10); // Enqueue 10 into the queue (O(1))
        queue.enqueue(20); // Enqueue 20 into the queue (O(1))
        queue.enqueue(30); // Enqueue 30 into the queue (O(1))

        queue.printQueue(); // Outputs: Queue: 10 20 30

        System.out.println("Front element: " + queue.peek()); // Peek at the front element (O(1))

        int dequeuedValue = queue.dequeue(); // Dequeue the front element (O(1))
        System.out.println("Dequeued value: " + dequeuedValue); // Outputs: Dequeued value: 10
        queue.printQueue(); // Outputs: Queue: 20 30
    }
}

