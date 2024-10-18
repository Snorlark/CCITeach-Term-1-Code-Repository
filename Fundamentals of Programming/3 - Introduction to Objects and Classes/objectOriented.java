// Abstraction
abstract class Animal {
    
    // Encapsulation
    private String name;


    public Animal(String name) {
        this.name = name;
    }

    // Getter for the name (encapsulated)
    public String getName() {
        return name;
    }

    // Abstract method (Abstraction)
    public abstract void makeSound();
}

// Inheritance
class Dog extends Animal {
    
    public Dog(String name) {
        super(name);  
    }

    // Polymorphism
    @Override
    public void makeSound() {
        System.out.println(getName() + " says Woof!");
    }
}

class Cat extends Animal {
    
    public Cat(String name) {
        super(name);  // Inherits the name from Animal
    }

    // Polymorphism
    @Override
    public void makeSound() {
        System.out.println(getName() + " says Meow!");
    }
}

public class objectOriented {
    public static void main(String[] args) {
        // Polymorphism
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        // Calling the makeSound method for different objects
        myDog.makeSound();  
        myCat.makeSound();  
    }
}
