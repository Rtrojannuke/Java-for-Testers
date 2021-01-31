package loops;

public class freach {
	public static void main(String[] args) {
		int[] price = new int[] 
				{3,4,5,6};
		int n = price.length;
		
		// USING FOR LOOP 
		for(int i = 0; i<n; i++) {
			System.out.println("VALUE AT INDEX "+ i +" OF PRICE " + "is " + price[i] );
		}
		
		//USING FOR EACH LOOP
		System.out.println("**************************FOR EACH*******************************");
		for(int j: price){
			// System.out.println("VALUE AT INDEX "+ j +" OF PRICE " + "is " + price[j] ); // gives index error 
			System.out.println(j);
		}
	}

}
