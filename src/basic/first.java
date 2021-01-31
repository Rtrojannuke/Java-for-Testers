package basic;

public class first {
	
	public static void main(String[] args) { // main function: where the code runs
		//Displaying on Console
		System.out.println("HELLO WORLD!!!\nWELCOME TO JAVA FOR TESTERS"); // println prints and moves to a new line
		System.out.print("NO NEW LIN1"); // print: it displays all the output in one line, no new line created
		System.out.print("NO NEW LIN2");
		
		//Various data type in java
		// the int data type stores only integer value 
		int age; 
		int ag = 23;
		int c, d, h; // Variable can be declared then be initialized later
		c=21;
		System.out.println(ag + "also see" + c ); // how to print out multiple values using the print method 
		
		//Boolean data type is used to store tru and false in variables
		boolean yes = true;
		boolean no = false;
		System.out.println(yes + "See the no value: \n"+ no);
		
		//Char(character) is used for storing a single alphabet
		char m = 65;
		System.out.println("THIS IS THE M VALUE: "+ m);
		// String for letters
		String name = "Arimiyah Mubarak";
		System.out.println(name);
		
		// mathematical computation in java
		System.out.println( ag > c);
		System.out.println( ag < c);
		System.out.println( ag = c);
		d = 2 * 23;
		h = c/2;
		d = h + d;	
	}

}
