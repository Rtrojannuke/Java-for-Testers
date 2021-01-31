package loops;

public class whileloop {
	
	public static void main(String[] args) {
		
		
		int k = 30;
		
		while(k>=20) {
			System.out.println("This current value of K is: " + k);
			k--;
		}
		System.out.println("****************************************************");
		
		// USING IF STATEMENT IN A LOOP
		int i = 20; 
		
		// While loop
		
		while(i<=20) {
			System.out.println("This current value of I is: " + i);
			i--;
			if (i == 0) {
				System.out.println("LIMIT FOR I HAS BEEN REACHED, I IS NOW: "+i);
				break; // USED TO STOP THE EXECUTION IF I = 0
			}
		}
	}

}
