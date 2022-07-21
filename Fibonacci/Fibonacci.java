/*
    The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, 
    such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

    F(0) = 0, F(1) = 1
    F(n) = F(n - 1) + F(n - 2), for n > 1.

    Example 1:

    Input: n = 2
    Output: 1
    Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

    Example 2:
    
    Input: n = 3
    Output: 2
    Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 */
import java.util.HashMap;
import java.util.Map;
public class Fibonacci{

    private static long[] fibCache; //memoization
    private static Map<Integer, Long> memoizationTable = new HashMap<>();
    //methods
    public static long fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        if(memoizationTable.containsKey(n)){
            return memoizationTable.get(n);
        }
        /* 
        if(fibCache[n] != 0){
            return fibCache[n];
        }
        */
        
        long result = fib(n-1)+ fib(n-2);
        memoizationTable.put(n, result);
        //fibCache[n] = result;

        return result;
    }
    //main
    public static void main(String[] args){
        int n =50;
        //fibCache = new long[n+1];
        System.out.println(fib(n));
    }
}