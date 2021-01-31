package arryp;

public class twodarry {
	
	public static void main(String[] args) {
		//to declare an array which can store all possible dataTypes use the object data type when creating 
				Object groceries[] = new Object[16];
				// TWO DIMENSIONAL ARRAY ARE THE COMIN TOGETHER OF TWO OR MORE ARRAY
				int grocery[][] = new int[3][5]; //AN ARRAY OF 3 ROWS 5 COLUMN IS WHAT IS MEANT BY [3][5]
				//ASIGNING /ACCESSING Values
				// FIRST ROW
				grocery[0][0] = 00; 
				grocery[0][1] = 01; 
				grocery[0][2] = 02; 
				grocery[0][3] = 03;
				grocery[0][4] = 04;
				// SECOND ROW
				grocery[1][0] = 10; 
				grocery[1][1] = 11; 
				grocery[1][2] = 12; 
				grocery[1][3] = 13;
				grocery[1][4] = 14;
				// THIRD ROW
				grocery[2][0] = 20; 
				grocery[2][1] = 21; 
				grocery[2][2] = 22; 
				grocery[2][3] = 23;
				grocery[2][4] = 24;
				System.out.println(grocery);
				int rownum;
				int colnum;
				for(rownum=0;rownum<=2;rownum++) {
					System.out.println("ROW NUMBER IS: "+ rownum);
					for(colnum=0; colnum<=4; colnum++) {
						System.out.println(grocery[rownum][colnum]);
					}
				}
				
	}

}
