/*
    Write a function that reverses a string. 
*/
public class Reverse{
    //Globa variables
    
    
    //methods
    private static String reverseString(String str){
        String reversedInput = "";

        for(int i = str.length()-1; i >= 0; i--){
            reversedInput += str.charAt(i);
        }
        return reversedInput;
    }


    //main
    public static void main(String[] args){
        System.out.println(reverseString("I like JAVA"));
    }
}