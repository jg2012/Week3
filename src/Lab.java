
public class Lab {

	public static void main(String[] args) {
		
		//Create an array with the following values 1,5,2,8,13,6
		int [] values = {1,5,2,8,13,6}; 
		
		
		//print out the first element in the array 
		System.out.println(values[0]);
		
		//print out the last element in the array without using the number 5
		System.out.println(values[values.length-1]);

		//print out the element in the array at the position 6. what happens? 
//		System.out.println(values[6]);

		//print out the element in the array at position -1. what happens? 
//		System.out.println(values[-1]);

		// write a traditional for loop that prints out each element in the array
		for(int i = 0; i<values.length; i++) {
			System.out.println(values[i]);
		}
		
		//write an enhanced for loop that prints out each element in the array 
		for(int value : values) {
			System.out.println(value);
		}
		
		//create a new variable called sum, write a loop that adds each element in the array to the sum 
		double sum = 0; 
		
		for(int add: values) {
			sum += add; 			
		}System.out.println(sum);
		
		
		//create a new variable called average and assign the average value of the array to it
		double average = sum / values.length; 
		System.out.println(average);
		
		
		
		// write an enhanced for loop that prints out each number in the array only if the number is odd
		
		for( int value: values) {
		if(value % 2 == 1) {
			System.out.println(value);
			}
		}
		
		//create an array that contains the values: "Sam", "Sally", "Thomas", and "Robert" 
		
		String [] names = {"Sam", "Sally", "Thomas", "Robert"}; 
		
		
		//calculate the sum of all the letters in the new array 
		
		int sumOfLetters =0; 
		
		for(String name: names) {
			sumOfLetters += name.length(); 
			
		}System.out.println(sumOfLetters);
		
		
		//write and test a method that takes a String name and prints out a greeting, this method returns nothing
		greet("Tom"); 
		greet("Sally"); 
		
		
		//write and test a method that takes a String name and returns a greeting, do not print in the method 
		
		String greeting = greet2("Nick");
		System.out.println(greeting);
		
		//analyze the difference between these two methods - what do you find? How are they different? 
		// a mismatch of types. 
		
		
		//write and test a method that takes a String and an int and returns true if the number of letters in the string are greater than the int
		System.out.println(isStringLongerThanNumber("Hello",3)); 
		
		
		//write and test a method that takes an array of string and a string that returns true if the string passed in exists in the array 
		
		System.out.println(doesArrayContainString(names, "Same"));
		
		//write and test a method that takes an array of int and returns the smallest number in the array 
		
		
		
		//write an test a method that takes an array of double and returns the average 
		
		
		
		//write and test a method that takes an array of String sand returns an array of int where each element
		//matches the length of the string at the position 
		
		
		
		//write and test a method that takes an array of string and returns true if the sume of letters for all strings iwth an 
		//even aount of letters is greater than the sum of those with an odd amount of letters. 
		
		
		
		//write and test a method that takes a string and returns true if the string is a palindrome. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	}
	
	
	public static void greet(String name){
		System.out.println("Hello, "+ name + "!");
	}
	
	public static String greet2(String name ) {
		return "Hi, "+ name + "!"; 
	}
	
	public static boolean isStringLongerThanNumber(String string, int number) {
		return(string.length()> number) ;	
	}
	
	public static boolean doesArrayContainString(String[] array, String string) {
		for(String str: array) {
			if(str.equals(string)) {
				return true; 
			}
		}
		return false; 
	}
	
	
	
	
	
}
