import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Declaring and initializing an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Accessing and printing elements in the ArrayList
        System.out.println("First fruit: " + fruits.get(0));  // Output: Apple

        // Modifying an element
        fruits.set(1, "Blueberry");  // Replaces "Banana" with "Blueberry"
        System.out.println("Modified second fruit: " + fruits.get(1)); // Output: Blueberry

        // Removing an element
        fruits.remove(2); // Removes "Cherry"
        
        // Iterating through the ArrayList
        System.out.println("All fruits in the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking the size of the ArrayList
        System.out.println("Number of fruits: " + fruits.size()); // Output: 2
    }
}
