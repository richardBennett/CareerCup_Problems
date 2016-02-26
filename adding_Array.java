/*	Richard Bennett	2/25/2016
Given an array and a number, add it in such a way where array is [0,0,1] and number is 4 output will be [0,0,5]
Example 2 : array is [1] and number is 9 output will be [1,0]
*/

public class adding_Array 
{
	//Main
	public static void main(String[] args) 
	{
		//Variables
		int[] inputArray = {1, 2};									//Starting Array		
		int numToAdd = 1119;										//Number to Add
		int[] outputArray = addToArray(inputArray, numToAdd);		//Output Array
		//	
		
		//Print output
		System.out.println("\nGiven an array and a number, add it in such a way" +
				 "where array is [0,0,1] and number is 4 output will be [0,0,5]");
		System.out.println("Example 2 : array is [1] and number is 9 output will be [1,0]\n");
		System.out.println("Input Array: ");
		print1dIntArray(inputArray);
		System.out.println("Adding " + numToAdd);
		System.out.println("Output Array: ");
		print1dIntArray(outputArray);
		System.out.println(); 
		//
	}
	
	//Takes an integer array of single digits, turns it into an int, adds to it,
	//and outputs an array of single digits
	public static int[] addToArray(int[] array, int num) 
	{
		//Variables
		int[] newArray;			//Output Array
		int arrayAsInt = 0;		//The Input Array as an integer
		int multiplier = 1;		//For multiplying powers of 10, and finding the size of the new array
		int multicount = 0;		//What power of 10 the multiplier is working with, to find the size of the new array
		//
	
		for(int i = array.length -1; i > -1; i--) {		//Transform the Input Array to an int
			arrayAsInt += array[i] * multiplier;
			multiplier *= 10;
			multicount++;
		}
		arrayAsInt += num;								//Add the number to be added
		
		while(arrayAsInt/multiplier > 0) {				//Find the size of the Output Array
			multiplier *= 10;
			multicount++;
		}

		newArray = new int[multicount];					//Create and fill the new array
		for(int i = multicount -1; i > -1; i--) {		
			newArray[i] = arrayAsInt % 10;
			arrayAsInt /= 10;
		}
		
		return newArray;
	}
	
	//Prints a 1d integer array in an aesthetically pleasing way
	public static void print1dIntArray(int[] array)
	{
		System.out.print("[");
		for(int i = 0; i < array.length - 1; i++)
			System.out.print(array[i] + ", ");
		System.out.print(array[array.length-1]);
		System.out.println("]");
	}
}
