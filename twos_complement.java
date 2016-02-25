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
        String input = "11001";
        System.out.println(reverse_twos(input));   
    }
    
    public static String reverse_twos(String input) 
    {
        String output;
        boolean carry = true;
        char[] inputArray = input.toCharArray();
        char[] outputArray = new char[inputArray.length + 1];
        
        for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == '1') outputArray[inputArray.length - i] = '0';
            else outputArray[inputArray.length - i] = '1';
        }
         output = new String(outputArray);
        
        for(int i = outputArray.length-1; i > -1; i--) {
            if(outputArray[i] == '0' && carry) {
                outputArray[i] = '1';
                carry = false;
            }
            if(outputArray[i] == '1' && carry) {
                outputArray[i] = '0';
                carry = true;
            }
        }
               
        output = new String(outputArray);
        return output;
    }
}
