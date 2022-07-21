import java.util.Arrays;
import java.util.*;
public class TwoSum{
	
	public static int[] addTwo(int[] nums, int target){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			
			int diff = target - nums[i];
			
			if(map.containsKey(diff)){
				return new int[] {map.get(diff), i};
			}
			map.put(nums[i], i);
		}
		return new int[] {0,0};
	}
	
	
    public static void main(String[] args){
		int[] nums = {2,7,4,6,15};
		int target = 10;
		
		System.out.println(Arrays.toString(addTwo(nums, target)));
    }
}


/*
	public static int[] addTwo(int[] nums, int target){
		for(int i = 0; i < nums.length; i++){
			for(int j = i +1; j < nums.length; j++){
				int diff = target - nums[i];
				
				if(diff == nums[j])
					return new int[] {i,j};
			}
		}
		return new int[] {0};
	}*/