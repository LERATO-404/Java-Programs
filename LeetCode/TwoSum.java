import javax.imageio.stream.ImageOutputStream;

import java.lang.reflect.Array;
/*
Given an in int array and an int target, return of the two numbers that they add up to the target
There is always a solution, and you cannot use the same element twice. 
You can return the answer in any order
Come up with an algorithms less than O(n^2) time complexity

Example 1
Input: nums = [2,7,11,15], target = 9
Output: [0,1]

Example 2
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3
Input: nums = [3,3], target = 6
Output: [0,1]
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class TwoSum{

    /*
     *Brute force 
     * [11,2,7,15] target = 9
     *  +    *
     * output [0,2]
     * two pointer one to point on the curr index and the order to the result if there is
     * 
     * optimised
     * [1,2,3,4,5,9] t =8
     * 1+5 = 6
     *  
     */



    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {0,0};
        /* 
        Brute force o(n^2)
        int[] twoIndices = new int[2];
        int i = 0;
        while(i < nums.length){ O(n)
            for(int j=i+1; j < nums.length; j++){ O(n)
                if(nums[i] + nums[j] == target){
                    twoIndices[0] = i;
                    twoIndices[1] = j;
                }
            }
            i++;
        }
        return twoIndices;
        O(n) * O(n) = O(n^2)
        */

    }

    public static void main(String[] args){

    }
}