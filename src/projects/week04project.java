package projects;

public class week04project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       
		// Task 1
	        // a. Create array and perform subtraction
	        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	        int result1 = ages[ages.length - 1] - ages[0];
	        System.out.println("Result of subtraction: " + result1);

	        // b. Create a new array of int called ages2 with 9 elements
	        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 15};
	        int result2 = ages2[ages2.length - 1] - ages2[0];
	        System.out.println("Result of subtraction with ages2: " + result2);

	        // c. Calculate the average age
	        int sum = 0;
	        for (int age : ages) {
	            sum += age;
	        }
	        double averageAge = sum / (double) ages.length;
	        System.out.println("Average age: " + averageAge);

	        // Task 2
	        // a. Array of String called names
	        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	        
	        // Calculate the average number of letters per name
	        int totalLetters = 0;
	        for (String name : names) {
	            totalLetters += name.length();
	        }
	        double averageLetters = totalLetters / (double) names.length;
	        System.out.println("Average number of letters per name: " + averageLetters);
	        
	        // b. Concatenate all names together, separated by spaces
	        StringBuilder concatenatedNames = new StringBuilder();
	        for (String name : names) {
	            concatenatedNames.append(name).append(" ");
	        }
	        System.out.println("Concatenated names: " + concatenatedNames);

	        // Task 3
	        // Access the last element of any array
	        System.out.println("Last element of ages array: " + ages[ages.length - 1]);

	        // Task 4
	        // Access the first element of any array
	        System.out.println("First element of ages array: " + ages[0]);

	        // Task 5
	        // Create a new array of int called nameLengths
	        int[] nameLengths = new int[names.length];
	        for (int i = 0; i < names.length; i++) {
	            nameLengths[i] = names[i].length();
	        }

	        // Task 6
	        // Calculate the sum of all the elements in the nameLengths array
	        int sumOfNameLengths = 0;
	        for (int length : nameLengths) {
	            sumOfNameLengths += length;
	        }
	        System.out.println("Sum of all elements in nameLengths: " + sumOfNameLengths);
	    }
	
	    // Task 7
	    // Method that returns concatinated word a number of times
	    public static String concatenateWord(String word, int n) {
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < n; i++) {
	            result.append(word);
	        }
	        return result.toString();
	    }

	    // Task 8
	    // method that returns a fullname from two strings
	    public static String fullName(String firstName, String lastName) {
	        return firstName + " " + lastName;
	    }

	    // Task 9
	    // Method that returns true if int sum is greater than 100
	    public static boolean isSumGreaterThan100(int[] numbers) {
	        int sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }
	        return sum > 100;
	    }


	    // Task 10
	    // method the returns the average of all elements
	    public static double calculateAverage(double[] numbers) {
	        double sum = 0;
	        for (double number : numbers) {
	            sum += number;
	        }
	        return sum / numbers.length;
	    }

	    // Task 11
	    // method that takes two arrays and returns true if first array average is grater than the second
	    public static boolean isFirstArrayAverageGreater(double[] array1, double[] array2) {
	        return calculateAverage(array1) > calculateAverage(array2);
	    }

	    // Task 12
	    // Method boolean that returns true if hot outside and money in pocket is greater than 10.50
	    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	        return isHotOutside && moneyInPocket > 10.50;
	    }

	    // Task 13
	    // This method calculates the factorial of a given number.
	    // I created it because factorials are commonly used in various mathematical computations.
	    public static long factorial(int n) {
	        if (n <= 1) {
	            return 1;
	        }
	        
	        return n * factorial(n - 1);
	   
	    }
}

