public class StaticInitialization{
	/*
		A static initialization block is a normal block of code enclosed in braces, { }, and preceded by the static keyword. Here is an example:

	static {
		// whatever code is needed for initialization goes here
	}
	A class can have any number of static initialization blocks, and they can appear anywhere in the class body. The runtime system guarantees that static initialization blocks are called in the order that they appear in the source code.

	There is an alternative to static blocks — you can write a private static method:

	class Whatever {
		public static varType myVar = initializeClassVariable();
			
		private static varType initializeClassVariable() {

			// initialization code goes here
		}
	}
	The advantage of private static methods is that they can be reused later if you need to reinitialize the class variable.
	*/
	
	
	public static Scanner input = new Scanner(System.in);
    public static int B = input.nextInt();
    public static int H = input.nextInt();
    public static boolean flag;
    static{   
        if(B > 0 && H > 0){
            flag = true;
        }else{
        Exception ex = new Exception();
            System.out.println(String.format("%s: Breadth and height must be positive", ex));
                    
        }
    }
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}
	
