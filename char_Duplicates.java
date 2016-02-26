/*******************************************************************************
 * Author: Richard Bennett
 * Description:
 * Remove duplicate characters from a given string and return the string
 *******************************************************************************/
public class char_Duplicates 
{
	//Main
    public static void main(String[] args)
    {
		//Variables
        String input = "cutcopypaste";
		//
		
		//Print output
		System.out.println("\nRemove duplicate characters from a given string and return the string.");
		System.out.println("Input String: " + input);
		System.out.println("Output String: " + removeDuplicateChars(input) + "\n");
		//
    }

	//Removes Duplicate characters from a String
	public static String removeDuplicateChars(String input) 
	{
		//Variables
		String output = "";		//output String
        boolean duplicate;		//If a char has duplicates
		char nextChar;			//Char to be checked for duplicates
        //

        for(int i = 0; i < input.length(); i++) {		//For all the input String
           	nextChar = input.charAt(i);						//nextChar = next Char
            duplicate = false;
            for(int j = 0; j < input.length(); j++) {		//For all the input String
                if(i != j && nextChar == input.charAt(j)) duplicate = true;		//If it has a duplicate set duplicate true
            }
            if(!duplicate) output += nextChar;				//If it has no duplicates add it to the output
        }
		return output;
	}    
}
