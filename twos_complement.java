/***************************************************************
 * Author: Richard Bennett
 * Description: Given a string containing only 1's and 0's,
 * write a function that reverses and returns the two's
 * complement of the string
 **************************************************************/
public class twos_complement 
{
    public static void main(String[] args)
    {
		//Variables
        String input = "11001";		//Input String
		//
		
		//Print output
		System.out.println("\nGiven a string containing only 1's and 0's, " +
			"write a function that reverses and returns the two's complement of the string.");
		System.out.println("\nInput String: " + input);
        System.out.println("Output String: " + reverse_twos(input) + "\n");
		//
    }
    
	//reverses and returns the twos complement of string containing only 1's and 0's
    public static String reverse_twos(String input) 
    {
		//Variables
        String output;											//The output String
        boolean carry = true;									//Carry bit, starts as 1 for 2's complement
        char[] inputArray = input.toCharArray();				//The input String as a char Array
        char[] outputArray = new char[inputArray.length + 1];	//The output String as a char Array
        //

        for(int i = 0; i < inputArray.length; i++) {							//For all the input Array
            if(inputArray[i] == '1') outputArray[inputArray.length - i] = '0';		//put a flipped bit in the output array
            else outputArray[inputArray.length - i] = '1';
        }
        
        for(int i = outputArray.length-1; i > -1; i--) {	//For all the output array going backwards
            if(carry) {											//If there is a carry
				if(outputArray[i] == '0') {							//If the current position is 0
                	outputArray[i] = '1';								//Make it a one
                	carry = false;										//Now there is no carry	
            	}
				else {												//If the current position is 1
                	outputArray[i] = '0';								//make it a 0
                	carry = true;										//Now there is a carry
            	}
			}
        }
               
        output = new String(outputArray);							//Convert the output array to a string
        return output;
    }
}
