
public class GDSC_CODE {
    public static void main(String[] args) {
        
        //String Methods
        String name = "Clarence";

        // equalsIgnoreCase() example
        boolean result = name.equalsIgnoreCase("clarence");
        System.out.println("equalsIgnoreCase: " + result);

        // length() example
        int lengthResult = name.length();
        System.out.println("length: " + lengthResult);

        // charAt() example
        char charAtResult = name.charAt(7);
        System.out.println("charAt: " + charAtResult);

        // indexOf() example
        int indexOfResult = name.indexOf("C");
        System.out.println("indexOf: " + indexOfResult);

        // isEmpty() example
        boolean isEmptyResult = name.isEmpty();
        System.out.println("isEmpty: " + isEmptyResult);

        // toUpperCase() example
        String toUpperCaseResult = name.toUpperCase();
        System.out.println("toUpperCase: " + toUpperCaseResult);

        // toLowerCase() example
        String toLowerCaseResult = name.toLowerCase();
        System.out.println("toLowerCase: " + toLowerCaseResult);

        // trim() example
        String nameWithSpaces = "  Clarence  ";
        String trimResult = nameWithSpaces.trim();
        System.out.println("trim: " + trimResult);

        // replace() example
        String replaceResult = name.replace('a', 'o');
        System.out.println("replace: " + replaceResult);
        
        //for spacing purposes
        System.out.println(" ");
        System.out.println("================================" );
        System.out.println(" ");
        
        //Char Operations
        char grade = 'A';
        System.out.println("Your grade is: " + grade);  // Outputs: Your grade is: A
        
        char letter = 'A';  // Unicode value of 'A' is 65
        int value = (int)letter ;  
        System.out.println("A = " + value);  // Outputs: 65
        
        char first_letter = '\u0041';  // Unicode for 'A'
        System.out.println("0041 = " + first_letter);  // Outputs: A

        //for spacing purposes
        System.out.println(" ");
        System.out.println("================================" );
        System.out.println(" ");

        //Comparing char values
        char ch1 = 'A';
        char ch2 = 'B';
        
        if (ch1 < ch2) {
            System.out.println(ch1 + " is less than " + ch2);
        } else if (ch1 > ch2) {
            System.out.println(ch1 + " is greater than " + ch2);
        } else {
            System.out.println(ch1 + " is equal to " + ch2);
        }  
        
        //for spacing purposes
        System.out.println(" ");
        System.out.println("================================" );
        System.out.println(" ");
        
        //Char in looping
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Current Character: " + ch);
        }
        
    }
}


