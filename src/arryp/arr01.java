package arryp;

public class arr01 {
	
	
	public static void main(String[] args) {
		
		// declaring an array
		int number[] = new int[5]; // the value five is to show the number of content you want the list to hold
		String name[] = new String[10]; 
		char alp[] = new char[15]; 
		
		//ASSIGNING VALUES INTO AN ARRAY
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		number[3] = 40;
		number[4] = 50;
		///number[5] = 60;
		
		// PRINTING VALUES FROM AN ARRAY
		//USING THE PRINTLN STATEMENT
		System.out.println(number[0]);
		System.out.println(number[3]);
		
		// USING A FOR LOOP, TO USE THE FOR LOP IT IS BETTER TO UNDERSTAND THE CONCEPT OF USING LEN FUNCTION
		int n = number.length;
		System.out.println(n);
		
		
		for(int i=0; i<n; i++) {
			System.out.println("THE VALUE OF AT PLACE OF "+ i + " IS: " + number[i] );
		}
		
	}

}
