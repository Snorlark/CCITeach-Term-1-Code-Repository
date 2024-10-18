// This is a simple Java program to demonstrate variables and data types
public class BasicProgramming {

    public static void main(String[] args) {

        // Declaring variables of different data types
        int age = 25;                    // Integer type variable to store age
        double height = 5.9;             // Double type variable to store height (in feet)
        char grade = 'A';                // Char type variable to store a grade
        boolean isStudent = true;        // Boolean type variable to check if someone is a student
        String name = "John Doe";        // String type variable to store a name

        // Output the values of these variables
        System.out.println("Name: " + name);                // Prints the name
        System.out.println("Age: " + age);                  // Prints the age
        System.out.println("Height: " + height + " feet");  // Prints the height
        System.out.println("Grade: " + grade);              // Prints the grade
        System.out.println("Is a student: " + isStudent);   // Prints if the person is a student

        // Demonstrating simple arithmetic operations with variables
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;  // Adding two integers
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        // Modifying a variable's value
        age = 30;  // Reassigning a new value to 'age'
        System.out.println("Updated age: " + age);
    }
}
