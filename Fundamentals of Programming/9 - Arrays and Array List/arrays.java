public class ArrayExample {
    public static void main(String[] args) {
        // Declaring and initializing an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing and printing elements in the array
        System.out.println("First element: " + numbers[0]);  // Output: 10
        System.out.println("Second element: " + numbers[1]); // Output: 20

        // Modifying an element
        numbers[2] = 35;
        System.out.println("Modified third element: " + numbers[2]); // Output: 35

        // Iterating through the array
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
