/*

    Given an integer x, return true if x is palindrome integer.

    An integer is a palindrome when it reads the same backward as forward.

    For example, 121 is a palindrome while 123 is not.
*/

public class Palindrome{
    //Globa variables

    //Constructor

    //Getter and Setter

    //methods
    public static int PalindromeNumber(int x){
        int reverseNum = 0;
        while(x != 0){
            int rem = x%10; // last digit 
            reverseNum = reverseNum * 10 + rem; // concatinate the last digit to reverseNum
            x /=  10;
        }
        return reverseNum;
    }

    public static boolean isPalindrome(int x){
        if(x == PalindromeNumber(x) && x >= 0){
            System.out.println(x+" is a palindrome");
            return true;
        }
        else{
            System.out.println(x+" is not a palindrome");
            return false;
        }
    }


    //main
    public static void main(String[] args){
        System.out.println(isPalindrome(0)); // yes
        System.out.println(isPalindrome(121)); // yes
        System.out.println(isPalindrome(-121)); // no
        System.out.println(isPalindrome(81)); // no

    }
}