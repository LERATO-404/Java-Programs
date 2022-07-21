import java.util.Scanner;
import java.util.Arrays;

public class QuerySequence{
	        // a + 1 * b  store in arr
            // a + 1 * b + 2 * b arr[0] number + 2 b
            // a + 1 * b + 2 * b + 4 * b arr[1] + 4*b
            // a + 1 * b + 2 * b + 4 * b + 8 * b arr[3] + 8*b
            // a + 1 * b + 2 * b + 4 * b + 8 * b + 16 * b arr[4] + 4*b
        
			//Example 1
			
			// input: q=1 a=0 b=2 n=10
			// output: 2 6 14 30 62 126 254 510 1022 2046
			
			//Example 2
			//input: q=1 a=5 b=3 n=5
			//output: 8 14 26 50 98
	
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
		
        int t=in.nextInt(); // number of queries
        for(int i=0;i<t;i++){
            
            // a, b , n
			int k = 1;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt(); // n = 5
			int multiple = k * b;
			int currentNum = a + multiple;
			
			int j = 0;
            do{ // calculate sequence
				System.out.print(currentNum);
				k = k * 2;
                currentNum += (k * b);
                System.out.print(" ");
				j++;
            }while(j < n);
            System.out.print("\n");
        }
        in.close();
		
		
    }
}