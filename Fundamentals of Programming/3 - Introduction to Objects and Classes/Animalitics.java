class Animal {
    // Attributes
    String name;
    String species;

    // Constructor: used to create an object
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Method: defines behavior of the object
    public void displayInfo() {
        System.out.println("This is a " + species + " named " + name);
    }
}

// Main class to run the program
public class Animalitics {
    public static void main(String[] args) {
        // Creating objects of the Animal class
        Animal cat = new Animal("Mingming", "Cat");

        // Calling method on the object
        cat.displayInfo();
    }
}



