package condStatement;

public class IFwork {
	
	public static void main(String[] args) {
		//Conditional statement are used in creating a flow which requires a condition to be in place. When the condition is met an execution happen else another happen
		
		boolean male = false;
		int age = 30; 
		
//		if (male == true) { //Check if male vale is true, if yes the print statement in the if block is executed 
//			System.out.println("WELCOME TO THE PARTY NIGGA");
//		}else { // no the else block will be executed
//			System.out.println("YOU ARE A LADY/WOMAN, YOU AREN'T ALLOWED HERE");
//		}
			
		if(age <= 25) {
			System.out.println("YOU STIIL HAVE TIME TO MAKE PREPARATIONS");
		}
		else {
			if(age>= 27) {
				System.out.println("you still have some time as well to make corrections");
			}
		}
//		if(age == 30 || male == true) {
//			System.out.println("LET'S PARTY TONIGHT");
//		}
//		else {
//			//System.out.println("");
//		}
		
		
	}
	
	

}
