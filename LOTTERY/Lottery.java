
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottery{
	
	public static void main(String[] args){
		List<Integer> winningNumbers = new ArrayList<>();
		List<Integer> guessedNumbers = new ArrayList<>();
		
		Random rand = new Random();
		// generated 6 winningNumbers no duplicates
		for(int i = 0; i < 6; i++) 
		{
			while(true){
				int winningNumber= rand.nextInt(49)+1; // nextInt() count one less the number entered so add 1
				if(!winningNumbers.contains(winningNumber)){
					winningNumbers.add(winningNumber);
					break;
				}
			}
		}	
		System.out.println(winningNumbers); // generated  number output
		
		//User picks
		System.out.println("Please enter your 6 number(1-49 inclusive)?");
		Scanner picks = new Scanner(System.in);
		
		for(int i = 0; i < 6; i++){
			System.out.println("Your current numbers are: " + guessedNumbers);
			System.out.println("Please enter a number(1-49):");
			try{
				while(true){
					String numberString = picks.nextLine();
					int number = Integer.parseInt(numberString);
					if(number >= 1 && number <= 49){ 
						if(!guessedNumbers.contains(number)){
							guessedNumbers.add(number);
							break;
						}else{
							System.out.println("Number already chosen. Please enter number(1-49)");
						}
					}
					else{
						System.out.println(number+" is not between 1 and 49. Please enter a valid number");	
					}
				}
			}catch(NumberFormatException nfe){
				System.out.println("Invalid input. Please try again");
			}
			
		}
		System.out.println("");
		//Compare user numbers and the generated numbers
		
		System.out.println("The winning number are:" + winningNumbers);
		System.out.println("Your numbers are: " + guessedNumbers);
		
		//helper method retainAll()
		guessedNumbers.retainAll(winningNumbers); // remove the element of guessedNumbers that are not in the winningNumbers List
		
		System.out.println("Your matched number are: "+ guessedNumbers);
		
		if( guessedNumbers.containsAll(winningNumbers)){ //returns true if all the guessedNumbers are the same as the winningNumbers
			System.out.println("You Won, with all your guessed numbers wow AMAZING :)");
		}else{
			System.out.println("You lost, sorry :(");
		}
		picks.close(); //close scanner
	}
			
}
