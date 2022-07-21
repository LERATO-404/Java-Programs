import java.util.Scanner;

public class PracticePrep{
	
	public static int prepPerWeek(){
		
		Scanner input = new Scanner(System.in);
		
		int week1 = input.nextInt();
    	int week2 = input.nextInt();		
    	int week3 = input.nextInt();
    	int week4 = input.nextInt();
    	int counter = 0;
    	
    	if(week1 >= 10){
    	    counter++;
    	}
    	
    	if(week2 >= 10){
    	    counter++;
    	}
    	
    	if(week3 >= 10){
    	    counter++;
    	}
    	
    	if(week4 >= 10){
    	    counter++;
    	}
		
		return counter;
	}
	
	public static void main(String[] args){
		int manyTimePerWeek = prepPerWeek();
		System.out.printf("Successful Preparation weeks: %d",manyTimePerWeek);
	}

	
	
}