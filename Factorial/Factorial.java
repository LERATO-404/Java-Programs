/*
    the product of all positive integers less than or equal to a given positive integer and
    denoted by that integer and an exclamation point. 
    Thus, factorial seven is written 7!, meaning 1 × 2 × 3 × 4 × 5 × 6 × 7 = 5040
 */

public class Factorial{


    //methods
    private static int fact(int n){
        int[] factArray = new int[n];
        int value =1;
        int j = 1;
        
        if(n == 1 || n == 0){
            return 1;
        }
        else{
            for(int i = 0; i < factArray.length; i++){
                factArray[i] = j;
                j++;
            }

            for(int i = 0; i < factArray.length; i++){
                value =value * factArray[i];
            }
            return value;
        }
    }
    //main
    public static void main(String[] args){
        System.out.println(fact(1)); //1
        System.out.println(fact(0)); //1
        System.out.println(fact(4)); //24
        System.out.println(fact(7)); //5040
        System.out.println(fact(9)); //362880
        
    }
}