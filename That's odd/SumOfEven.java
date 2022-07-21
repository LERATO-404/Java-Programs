import java.util.Scanner;
//System.out.println("");

public class SumOfEven{

	public static int sum(int arr[]){
		int sum = 0;
		
		//Sum of the values in the array
		for(int i =0; i<arr.length; i++){
			if(arr[i] % 2 == 0){
				sum  += arr[i];
			}
			else{
				sum += 0;
			}
		}
		return sum;
	}
	
	public static int[] returnArray(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of your list:");
		int leng = input.nextInt();
		
		
		System.out.println("Enter the elements in the list");
		int[] arr = new int[leng];
		for(int i = 0; i < leng; i++){
			int arrElement = input.nextInt();
			arr[i] += arrElement;
		}
		return arr;
	
	}
	
	public static void main(String[] args){
		//returnArray();
		
		/* 
		This prints the output array 
		for(int i = 0; i<outputArray.length; i++){
			System.out.print("\n"+outputArray[i]+"");
		}*/
		
		//Continue where you add all the integer numbers  from the  outputArray
		System.out.println("Output:"+sum(returnArray()));
	}
	
}	