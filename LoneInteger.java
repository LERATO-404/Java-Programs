import java.util.*;


public class LoneInteger{
	
	public static int loneInt(List<Integer> arr){
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.size(); i++){
			int indexValue = arr.get(i);
			if(map.containsKey(indexValue)){
				map.put(indexValue, map.get(indexValue) + 1);
			}else{
				map.put(indexValue, 1);
			}
		}
		int result = 0;
		for(Map.Entry entry : map.entrySet()){
			if((int) entry.getValue() == 1)
				result = (int)entry.getKey();
		}
		return result;
	}
	
	
	public static void main(String[] args){
		List<Integer> list= new ArrayList<>();
		list.add(0);
		list.add(0);
		list.add(2);
		list.add(1);
		list.add(1);
		
		int answer = loneInt(list);
		System.out.println(String.format("%d", answer));

	}
	
}











/**


	HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.size(); i++){
			if(map.containsKey(arr.get(i))){
				map.put(arr.get(i), map.get(arr.get(i))+1);
				
			}else{
				map.put(arr.get(i), 1);
			}
		}
		int loneInt = 0;
		for(Map.Entry entry : map.entrySet()){
			if((int)entry.getValue() == 1){
				loneInt = (int) entry.getKey();
			}
		}
		return loneInt;

*/