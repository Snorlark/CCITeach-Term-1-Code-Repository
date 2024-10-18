class Dog{
	String name;
	String breed;

	Dog(String _name, String _breed){ // Object Constructor
		this.name = _name;
		this.breed = _breed;
	}

	public void playFetch(int numberOfBalls) {
		System.out.println("\nDog: Waiting for ball...");
		if(numberOfBalls == 1) {
			System.out.println("Owner Throws Ball...");
			System.out.println("Dog: Getting Ball...");
			System.out.println("Dog: Returning to Owner");
			bark();
		}
		else {
			System.out.println("Owner Throws " + numberOfBalls + " Balls...");
			System.out.println("Dog: Confused! Staring at you with disappointment...");
		}

	}

	public String showName() { //Assuming Dog has dog tag
		return this.name;
	}

	public void bark() {
		System.out.println("Dog: Woof!");
		System.out.println("Dog: Waiting for orders...");
	}
}

public class AnimalActions {
	
    static int getSum(int num1, int num2) {
    	return num1 + num2;
    }
    
    static void printDifference(int num1, int num2) {
    	System.out.println("Difference: " + (num1 - num2));
    }

    public static void main(String[] args) {
        
        Dog Bobby = new Dog("Bobby", "Bulldog");
        System.out.println("Come here, " + Bobby.name);
        Bobby.bark();
        Bobby.playFetch(1);
        Bobby.playFetch(5);
        
        int collectedBallsToday = 5;
        int collectedBallsYesterday = 2;
        int totalBalls = getSum(collectedBallsToday, collectedBallsYesterday);
        System.out.println("\nTotal collected balls: " + totalBalls);
        printDifference(totalBalls, collectedBallsToday);
        
        
    }
    
    
}
