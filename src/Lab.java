
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
		
	}

}
