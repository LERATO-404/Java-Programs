/*
    The number guessing game allows the user to play rock, paper, scissors with the computer 
    & involves the following steps:
 
    1. The user is prompted to enter their choice [1 = rock, 2. paper, 3. scissor].
    2. Then then computer randomly chooses either the rock, paper, or scissors.
    3. The computer then tells if the entered choice matches the one generated buy the computer.
    4. The game continue for the allowed number of round
    5. Then the score will be shown for both the computer and the user where:
        * Win = 10 points
        * Lose = 0 point
        * Draw = 5 points

    You can also incorporate further details as:

    Adding number rounds.
    Displaying score.
    

*/
import java.util.Random;
import java.util.Scanner;;
public class RockPaperScissors{
    //Gloval variblaes
    private static final int allowedRounds = 3;
    private static String userSelection = "No selection "; 
    private static String computerSelection = "No selection";
    private static String[] gameArray = {"Rock", "Paper", "Scissor"};
    private static char cont = 'Y';
    private static Scanner userInput = new Scanner(System.in);
    private static Random rand = new Random();
    

    //methods

    public static String determineWinner(String computer, String user){
        String winner = "";
        if(user.compareTo(computer) == 0){ // draw
            winner = "No winner"; //draw
        }
        else if(((user.equals(gameArray[0])) && (computer.equals(gameArray[1])) == true) || 
        ((user.equals(gameArray[1])) && (computer.equals(gameArray[2])) == true) ||
        ((user.equals(gameArray[2])) && (computer.equals(gameArray[0])) == true)
        ){
            winner = "Computer won";
        }
        else if(((user.equals(gameArray[0])) && (computer.equals(gameArray[2])) == true) || 
        ((user.equals(gameArray[1])) && (computer.equals(gameArray[0])) == true) ||
        ((user.equals(gameArray[2])) && (computer.equals(gameArray[1])) == true)
        ){
            winner = "Player won";
        }
        return winner;
    }

    //display score after game won/lost
    public static int displayScore(int userScore,int computerScore){
        int overallScore = 0;
        return overallScore;
    }
    //number of rounds to play the game
    public static int numberOfRounds(String gameResult){
        return allowedRounds;
    }

    private static String choice(int num){
        String choosen = "";
        switch(num){
            case 0:
                choosen = gameArray[0];
                break;
            case 1:
                choosen = gameArray[1];
                break;
            case 2:
                choosen = gameArray[2];
                break;
                        
            default:
                choosen = "Invalid pick";
                break;
        }
        return choosen;
    }

    public static String computerChoice(){
        int computerPicker = rand.nextInt(gameArray.length);
        computerSelection = choice(computerPicker);
        return computerSelection;
    }

    public static String userChoice(){
        int uChoice = userInput.nextInt();
        userSelection = choice(uChoice);
        return userSelection;
    }

    public static void main(String[] args){
        if(cont == 'Y'){
            try{
                boolean again = false;
                while(cont == 'Y'){
                    do{
                        System.out.print("\nEnter your pick where 0=Rock, 1=Paper, or 2=Scissor: ");
                        String userPicked =  userChoice();
                        System.out.print("Your Pick: "+userPicked);

                        if(userPicked == "Invalid pick"){
                            System.out.print("\nEnter only a number between 0-2 where 0=Rock, 1=Paper, or 2=Scissor: ");
                            userPicked = userChoice();
                            System.out.print("Your Pick: "+ userPicked); 
                        }


                        String compPicked = computerChoice();
                        System.out.print("\nComputer Pick: "+compPicked);
                        String gameWinner = determineWinner(compPicked, userPicked);

                        System.out.println("\n"+gameWinner);

                        for(int i = 1; i <= allowedRounds; i++){
                            
                        }
                        
                        if(gameWinner != "No winner"){
                            System.out.print("\nif you want to continue enter [Y] otherwise enter [N or any key]: ");
                            cont = userInput.next().charAt(0); 
        
                            if(cont == 'Y' || cont == 'y'){
                                again = true;
                            }else{
                                again = false;
                                cont = '0';
                            }
                        }
                    }while(again == true);
                }
            }
            catch(Exception ex){
                System.out.print("The program closed automatically, try again");
            }
        }
        userInput.close();
    }
}