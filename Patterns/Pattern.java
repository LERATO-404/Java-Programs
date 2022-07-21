import java.util.Scanner;
// https://javahungry.blogspot.com/2017/09/25-different-number-pattern-programs-in-java.html
public class Pattern{
	
	//Pattern 1
	public static void starPattern(int input){
		for(int i = 1; i <= input; i++){
			for(int j = 1; j  <= i; j++){
				System.out.print(j+"");
			}
			System.out.println("");
		}
	}
	
	//Pattern 2
	public static void sideTriangle(int input){
		// upper half
		for(int i = 1; i <= input; i++){
			for(int j = 1; j  <= i; j++){
				System.out.print(j+"");
			}
			System.out.println("");
		}
		//lower half
		for(int i = input-1; i >= 1; i--){
			for(int j = 1; j  <= i; j++){
				System.out.print(j+"");
			}
			System.out.println("");
		}
	}
	
	//Pattern 3
	public static void sameRows(int input){
		for(int i = 1; i <= input; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(i+"");
			}
			System.out.println("");
		}
	}
	
	
	
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows?");
		int numberOfRows = input.nextInt();
		System.out.println("\nStar Patter");
		starPattern(numberOfRows);
		System.out.println("\nSide triangle Patter");
		sideTriangle(numberOfRows);
		System.out.println("\nSame rows Patter");
		sameRows(numberOfRows);
		
	}
}