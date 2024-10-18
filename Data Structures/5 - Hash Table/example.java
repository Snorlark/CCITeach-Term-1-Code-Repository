
import java.util.LinkedList;

public class HashTableExample {
    
    // Node class representing each key-value pair in the hash table
    static class Node {
        String key; // Key for the hash table entry
        int value;  // Value for the hash table entry
        
        Node(String key, int value) {
            this.key = key; // Initialize the key field
            this.value = value; // Initialize the value field
        }
    }

    // Hash Table class
    static class HashTable {
        private LinkedList<Node>[] table; // Array of linked lists to handle collisions
        private int size; // Number of entries in the hash table

        // Constructor to initialize the hash table
        @SuppressWarnings("unchecked") // Suppress unchecked warning for array of linked lists
        public HashTable(int capacity) {
            table = new LinkedList[capacity]; // Initialize the array
            for (int i = 0; i < capacity; i++) {
                table[i] = new LinkedList<>(); // Create a linked list for each index
            }
            size = 0; // Initialize size to 0
        }

        // Hash function to calculate the index (O(1))
        private int hash(String key) {
            return Math.abs(key.hashCode()) % table.length; // Hashing the key
        }

        // Insert a key-value pair into the hash table (O(1) on average)
        public void put(String key, int value) {
            int index = hash(key); // Get the index using the hash function
            for (Node node : table[index]) { // Check if the key already exists
                if (node.key.equals(key)) { // If found, update the value
                    node.value = value; // Update value
                    return; // Exit the method
                }
            }
            // If key not found, add new key-value pair
            table[index].add(new Node(key, value)); // Add new node
            size++; // Increment size
        }

        // Get the value associated with a key (O(1) on average)
        public Integer get(String key) {
            int index = hash(key); // Get the index using the hash function
            for (Node node : table[index]) { // Traverse the linked list
                if (node.key.equals(key)) { // If found, return the value
                    return node.value; // Return value
                }
            }
            return null; // Return null if key not found
        }

        // Remove a key-value pair from the hash table (O(1) on average)
        public void remove(String key) {
            int index = hash(key); // Get the index using the hash function
            Node toRemove = null; // Node to remove
            for (Node node : table[index]) { // Traverse the linked list
                if (node.key.equals(key)) { // If found
                    toRemove = node; // Mark node for removal
                    break; // Exit loop
                }
            }
            if (toRemove != null) {
                table[index].remove(toRemove); // Remove the node
                size--; // Decrement size
            }
        }

        // Check if the hash table contains a key (O(1) on average)
        public boolean containsKey(String key) {
            return get(key) != null; // Return true if key exists
        }

        // Get the current size of the hash table (O(1))
        public int size() {
            return size; // Return current size
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10); // Create a new hash table with capacity 10

        hashTable.put("apple", 1); // Insert key-value pair (O(1))
        hashTable.put("banana", 2); // Insert key-value pair (O(1))
        hashTable.put("orange", 3); // Insert key-value pair (O(1))

        System.out.println("Value for 'apple': " + hashTable.get("apple")); // Get value (O(1)) -> Outputs: 1
        System.out.println("Value for 'banana': " + hashTable.get("banana")); // Get value (O(1)) -> Outputs: 2

        hashTable.remove("banana"); // Remove key-value pair (O(1))
        System.out.println("Contains 'banana'? " + hashTable.containsKey("banana")); // Check existence (O(1)) -> Outputs: false
        System.out.println("Size of hash table: " + hashTable.size()); // Get current size (O(1)) -> Outputs: 2
    }
}
