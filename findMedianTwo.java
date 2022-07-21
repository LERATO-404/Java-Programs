import java.util.Arrays;
public class findMedianTwo{
	
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2){
		double median = 0;
		int numSize1 = nums1.length;
		int numSize2= nums2.length;
		int size = numSize1 + numSize2;
		int[] mergedNums = new int[size];
		
		for(int i = 0; i < numSize1; i++){
			mergedNums[i] = nums1[i];
		}
		
		for(int j = 0; j < numSize2; j++){
			mergedNums[numSize1] = nums2[j];
			numSize1++;
		}
		Arrays.sort(mergedNums);
		
		if(size % 2 == 0){
			median = ((mergedNums[(size-1)/2]) + (mergedNums[(size+1)/2])) / 2.0;
			
		}else{
			 median = mergedNums[size/2];
			
		}
		return median;
	}
	
	public static void main(String[] args){
		int[] nums1 = {1, 2};
		int[] nums2 = {3,4};
		double result = findMedianSortedArrays(nums1, nums2);
		System.out.printf("Median:%f", result);
		
		//time complexity: O(n*m)
		
	}
}