/*******************************************************************************
 * Author: Richard Bennett
 * Description:
 * Remove duplicate characters from a given string and return the string
 *******************************************************************************/
public class charDuplicates 
{
    public static void main(String[] args)
    {
        String input = "cutcopypaste";
        String output = "";
        boolean duplicate;
        
        for(int i = 0; i < input.length(); i++) {
            char nextChar = input.charAt(i);
            duplicate = false;
            for(int j = 0; j < input.length(); j++) {
                if(i != j && nextChar == input.charAt(j)) duplicate = true; 
            }
            if(!duplicate) output += nextChar;
        } 
        System.out.println(output);
    }    
}
