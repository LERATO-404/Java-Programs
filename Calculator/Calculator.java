//Develop a calculator a user where a user can perfrom:
/*
    1. Addition
    2. Multiplication
    3. Subtration
    4. Division
    5. Square
    6. MOD

    for only two numbers

When the user is done using the application they should/can 
enter [Y] for Yes otherwise [NO or any other key]

 */
import java.util.Scanner;
public class Calculator{
    //Globa variables
    private static Scanner input = new Scanner(System.in);

    //Add two numbers
    private static double AddTwoNumbers(double firstNum, double secondNum){
        return firstNum + secondNum;
    }

    //Subtract two numebers
    private static double SubtractTwoNumbers(double firstNum, double secondNum){
        return firstNum - secondNum;
    }

    //divide numebers
    private static double DivideTwoNumbers(double firstNum, double secondNum){
        return firstNum / secondNum;
    }

     //Multiply two numebers
    private static double MultiplyTwoNumbers(double firstNum, double secondNum){
        return firstNum * secondNum;
    }

    //Remainder
    private static double ModNumbers(double a, double b){
        double mod = a%b; // remainder
        return mod;
    }

     //Square root
    private static double squareNumber(double num){
        return Math.sqrt(num);
    }

    //Power
    private static double powerOfNumbers(double firstNum, double secondNum){
        return Math.pow(firstNum,secondNum);
    }

    //perform all the calculations
    private static double calculate(int operator, double num1, double num2) {
        double result = 0;
        switch (operator) {
            case 1:
                result = AddTwoNumbers(num1,num2);
                break;
                    
            case 2:
                result = SubtractTwoNumbers(num1,num2);
                break;
            
            case 3:
                result = MultiplyTwoNumbers(num1,num2);
                break;
            
            case 4:
                result =DivideTwoNumbers(num1,num2);
                break;

            case 5:
                result =powerOfNumbers(num1,num2);
                break;

            case 6:
                result =ModNumbers(num1,num2);
                break;

            case 7:
                result = squareNumber(num1);
                break;
                        
            default:
                System.out.println("Please select the number between between 1 and 7 for the operation you want to perform.");
                break;
        }
        return result;
    }

    private static void availableOperations(){
        System.out.println("where: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Power\n6. Modulus\n7. Square\n ");
    }

    //main
    public static void main(String[] args){
        
        System.out.println("Please select the operation from (1-7) you want to perform with the calculator:");
        availableOperations(); 
        char cont = 'Y';
        boolean again = false;
        int operator;
        double fNum = 0, sNum = 0;
    
        if(cont == 'Y'){
            try{
                System.out.print("Enter operation number:");
                operator = input.nextInt();

                while((operator >= 1 || operator <= 7) && cont == 'Y'){
                    do{
                        if(operator >=1 && operator <=6){
                            System.out.print("Enter the first number:");
                            fNum = input.nextInt();
                            System.out.print("Enter the second number:");
                            sNum = input.nextInt();
                        }else if(operator == 7){
                            System.out.print("Enter number:");
                            fNum = input.nextInt();
                            sNum = 0;
                        }
                        System.out.println("Your result is equal = "+calculate(operator,fNum, sNum));
                        System.out.print("\nif you want to continue enter [Y] otherwise enter [N or any key]: ");
                        cont = input.next().charAt(0); 
    
                        if(cont == 'Y' || cont == 'y'){
                            again = true;
                            availableOperations();
                            System.out.print("\nEnter operation number:");
                            operator = input.nextInt();
                        }else{
                            again = false;
                            cont = '0';
                        }
                        
                    }while(again == true);
                }
            }
            catch(Exception ex){
                System.out.print("Enter only a number of the operation you want to perform. The program closed automatically, try again");
            }
        }
        input.close();
    }
}
