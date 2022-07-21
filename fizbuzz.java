/*
	Fizbuzz game:
		Say fiz if the number is divisible by 3 (3,6)
		Say buzz if the number is divisible by 5 (5,10)
		Say fizbuzz if the number is divisible by both 3 and 5 (3,15,30)
		Return the number it self, is not divisible by 3 and 5 (7,11)
*/
public class fizbuzz{
	
	public static void fizbuzzMethod(int number){
		if(number % 3 == 0 && !(number % 5 ==0)){
			//System.out.println(String.format("%d is divisible by 3", number));
			System.out.println("Fizz");
			
		}else if(number % 5 == 0 && !(number % 3 ==0)){
			//System.out.println(String.format("%d is divisible by 5", number));
			System.out.println("Buzz");
		}else if(number %3 ==0 && number %5 ==0){
			//System.out.println(String.format("%d is divisible by both 3 and 5",number));
			System.out.println("FizzBuzz");
		}else{
			System.out.println(String.format("%d is not divisible by both 3 and 5",number));
		}
	}
	
	public static void main(String[] args){
		fizbuzzMethod(3);
		fizbuzzMethod(10);
		fizbuzzMethod(15);
		fizbuzzMethod(11);
	}
}
