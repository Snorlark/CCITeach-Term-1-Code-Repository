// Code for Primitive Types
public class PrimitiveTypes {
    public static void main(String[] args) {
        // Declaring and initializing a byte variable (8-bit signed integer)
        byte myByte = 100;

        // Declaring and initializing a short variable (16-bit signed integer)
        short myShort = 1000;

        // Declaring and initializing an int variable (32-bit signed integer)
        int myInt = 100000;

        // Declaring and initializing a long variable (64-bit signed integer)
        // The 'L' at the end indicates that this is a long literal
        long myLong = 1000000000L;

        // Declaring and initializing a float variable (32-bit floating-point number)
        // The 'f' at the end indicates that this is a float literal
        float myFloat = 3.14f;

        // Declaring and initializing a double variable (64-bit floating-point number)
        double myDouble = 3.14159;

        // Declaring and initializing a char variable (stores a single character)
        char myChar = 'A';

        // Declaring and initializing a boolean variable (true or false)
        boolean myBoolean = true;

        // Printing the values of each primitive type
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Int: " + myInt);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Char: " + myChar);
        System.out.println("Boolean: " + myBoolean);
    }
}

// Code for String Operations
public class StringOperations {
    public static void main(String[] args) {
        // Declaring and initializing two String variables
        String firstName = "John";
        String lastName = "Doe";

        // Concatenating firstName and lastName with a space in between
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Getting the length of the fullName string
        int nameLength = fullName.length();
        System.out.println("Length of Full Name: " + nameLength);

        // Extracting a substring from fullName: from index 0 to 4 (excluding 4), this will give "John"
        String firstPart = fullName.substring(0, 4); // "John"
        
        // Extracting a substring from fullName: from index 5 to the end, this will give "Doe"
        String lastPart = fullName.substring(5); // "Doe"
        
        // Printing the first and last parts of the fullName string
        System.out.println("First Part: " + firstPart);
        System.out.println("Last Part: " + lastPart);
    }
}
