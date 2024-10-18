public class VariableScopeExample {

    // Instance variable
    private int instanceVar = 10;  // Accessible to all methods in this class

    // Static variable
    private static int staticVar = 20;  // Shared across all instances of this class

    public static void main(String[] args) {
        // Local variable
        int localVar = 5;  // Accessible only within this method
        System.out.println("Local Variable: " + localVar);

        // Accessing static variable
        System.out.println("Static Variable: " + staticVar);

        // Creating an instance of the class to access instance variable
        VariableScopeExample example = new VariableScopeExample();
        example.displayInstanceVar();  // Calling method to display instance variable
    }

    public void displayInstanceVar() {
        // Accessing instance variable
        System.out.println("Instance Variable: " + instanceVar);
        
        // Accessing static variable from instance method
        System.out.println("Static Variable from instance method: " + staticVar);
    }

    public void anotherMethod() {
        // Local variable
        int anotherLocalVar = 15; // Accessible only within this method
        System.out.println("Another Local Variable: " + anotherLocalVar);
        
        // Trying to access localVar here would cause an error
        // System.out.println("Local Variable: " + localVar); // Error: cannot find symbol
    }
}
