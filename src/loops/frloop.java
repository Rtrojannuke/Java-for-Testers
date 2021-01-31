package loops;

public class frloop {
	
	public static void main(String[] args) {
		int j;
		int num= 1;

	
	int i;
	//NON-NESTED/ORDINARY FOR LOOP
	for(i=1;i<=10;i++) {
		int mult = num * i;
		System.out.println("THE VALUE OF I IS: "+i);
		System.out.println(num + " * " + i + " = " + mult);
	}
	
	
	// THIS IS A NESTED FOR LOOP
		for(num=1;num<=100;num++) {
			for(j=1;j<=100;j++) {
				System.out.println("VALUE OF NUMBER IS: " + num);
				int mult = num * j;
				System.out.println("THE VALUE OF J IS: "+j);
				System.out.println(num + " * " + j + " = " + mult);
			}
		}
	
	
	}

}
