import java.util.Scanner;

public class CheerCreator{
	
	static Scanner input = new Scanner(System.in);
	
	public  static int yards(){
		int yard = 0;
		System.out.println("Enter the number of yards your team moved:");
		yard = input.nextInt();
		return yard;
	}
	
	public static String cheer(int yards){
		String cheerType = "";
		if(yards > 10){
			cheerType="High Five";
		}
		else if(yards >= 1 && yards <= 10){
			String raCheer = "Ra!";
			cheerType = raCheer.repeat(yards);
		}else{
			cheerType="shh";
		}
		return cheerType;
	}
	
	public static void main(String[] args){
		int yardMoved = yards();
		System.out.println(cheer(yardMoved));
	}
}