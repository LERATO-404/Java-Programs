import java.util.*;
public class findMedian{
	
	public static int median(List<Integer> arr){
		Collections.sort(arr);
		return arr.get((arr.size())/2);
	}
	
	
	public static void main(String[] args){
		//0 1 2 4 6 5 3
		//0 5 7 11 14 15 16
		List<Integer> list= new ArrayList<>();
		list.add(0);
		list.add(5);
		list.add(7);
		list.add(11);
		list.add(14);
		list.add(15);
		list.add(16);
		//list.add(25);
		//list.add(16);
		
		int medianIndex = median(list);
		
		System.out.println(medianIndex);
		
	}
}