import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class TicTacToe
{
	static  ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static  ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
	  
	public static void printGameBoard(char[][] gameboard)
	{
		//print out the gameboard
		for(char[] row : gameboard)
		{
			for(char c : row)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void placePiece(char[][] gameboard, int pos, String user)
	{
		char symbol = ' ';
		if(user == "player")
		{
			symbol = 'X';
			playerPositions.add(pos); 
		}
		else if(user == "cpu")
		{
			symbol = 'O';
			cpuPositions.add(pos);
		}
			
										
		switch(pos)
		{
			case 1:
				gameboard[0][0] = symbol;
				break;
			case 2:
				gameboard[0][2] = symbol;
				break;
			case 3:
				gameboard[0][4] = symbol;
				break;
			case 4:
				gameboard[2][0] = symbol;
				break;
			case 5:
				gameboard[2][2] = symbol;
				break;
			case 6:
				gameboard[2][4] = symbol;
				break;
			case 7:
				gameboard[4][0] = symbol;
				break;
			case 8:
				gameboard[4][2] = symbol;
				break;
			case 9:
				gameboard[4][4] = symbol;
				break;
			default:
				break;
			//case pos < 1 || pos > 9:
				//System.out.println("Enter your placement(1-9):");
				//int pos = input.nextInt();
		}
	}
	
	public static String checkWinner()
	{
		List topRow = Arrays.asList(1,2,3);
		List midRow = Arrays.asList(4,5,6);
		List botRow = Arrays.asList(7,8,9);
		
		List leftCol = Arrays.asList(1,4,7);
		List midCol = Arrays.asList(2,5,8);
		List rightCol = Arrays.asList(3,6,9);
		
		List cross1 = Arrays.asList(1,5,9);
		List cross2 = Arrays.asList(3,5,7);
		
		List<List> winnings = new ArrayList<List>();
		winnings.add(topRow);
		winnings.add(midRow);
		winnings.add(botRow);
		winnings.add(leftCol);
		winnings.add(midCol);
		winnings.add(rightCol);
		winnings.add(cross1);
		winnings.add(cross2);
		
		for( List l : winnings)
		{
			if(playerPositions.containsAll(l)){
				return "Cangradulation you won!!";
			}else if(cpuPositions.containsAll(l)){
				 return "Cpu win, Sorry :(";
			}else if(playerPositions.size() + cpuPositions.size() == 9){
				return "No winner";
			}
		}
			
		return "";
		
	}
	
	
	public static void main(String[] args)
	{
		//Game board 3rows and e column
		char[][] gameboard = {{' ','|',' ','|',' '},
							{'-','+','-','+','-'},
							{' ','|',' ','|',' '},
							{'-','+','-','+','-'},
							{' ','|',' ','|',' '}};
	
		while(true)
		{
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your placement(1-9):");
			int playerPos = input.nextInt();//player
			//System.out.println(playerPos);
			
			while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions))
			{
				System.out.println("Position taken!, Enter a correct Position");
				playerPos = input.nextInt();
			}
			placePiece(gameboard,playerPos, "player");
			String result = checkWinner();
			if(result.length() > 0)
			{
				System.out.println(result);
				break;
			}
			
			
			Random rand = new Random();  // computer
			int cpuPos = rand.nextInt(9) + 1;
			System.out.println(cpuPos);
		
			while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPositions))
			{
				System.out.println("Position taken!, Enter a correct Posiotion");
				cpuPos = rand.nextInt(9) + 1;
			}
			placePiece(gameboard,cpuPos, "cpu");
			result = checkWinner();
			
			
			if(result.length() > 0)
			{
				System.out.println(result);
				break;
			}
			printGameBoard(gameboard);
		}
	}
}