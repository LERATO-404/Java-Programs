import java.util.Scanner;

public class whiteSpaces{
	/*
		Each String is left-justified with trailing whitespace through the first 15 characters. 
		The leading digit of the integer is the 16th character, and each integer that was 
		less than 3 digits now has leading zeroes
		
		example 1
		input: java 100
		output: java           100
		
		example 2
		input: c++ 65
		output c++            065
	*/
	public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                int strLen = s1.length(); // string len
                int intLen = String.valueOf(x).length();
                String newX = "";
                int space = 15 - strLen ;
                String availSp = new String(new char[space]).replace("\0", " ");
                
                if(intLen < 3){
                    if(intLen == 1){
                        newX = "00"+ String.valueOf(x);
                    }else{
                        newX = "0"+ String.valueOf(x);
                    }   
                }
                else{
                    newX = String.valueOf(x);
                }
                System.out.println(s1 +availSp+ newX );
            }
            System.out.println("================================");

    }
}