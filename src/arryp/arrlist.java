package arryp;

import java.util.ArrayList;

public class arrlist {
	// using arraylist.
	//Arraylist is betterthan array because array once the size is declare can't be changed but Arraylist size can be changed
	public static void main(String[] args) {
		ArrayList<String> arrlstp = new ArrayList<String>(); // declaring an empty value array
		ArrayList arlstp = new ArrayList(); // declaring AN ARRAY OF OBJECT WHERE ANY DATATYPE CAN BE ADDED 
		arrlstp.add("SWEET"); // adding values to arraylist 
		arrlstp.add("NUNU");
		arrlstp.add("BREAD");
		arrlstp.add("RICE");
		arrlstp.add("CHIN CHIN");
		arrlstp.add("GROUNDNUT");
		arrlstp.add("CAKE");
		arrlstp.add(3, "SEA CHICKEN"); // Specifying location to add new item in arraylist(e.g. at index 3, SEA CHICKEN WILL BE ADDEDD)
		arrlstp.remove(2); //remove with index no(e.g this removes anything at index 2 on the arraylist)
		arrlstp.remove("CHIN CHIN");
		//ADDING VALUES TO THE OBJECT ARRAY
		arlstp.add(1);
		arlstp.add("MOIN MOIN");
		arlstp.add(2, "arlstp");

		System.out.println("***********************DATA TYPE ARRAYLIST*****************************");
		for(String food: arrlstp) {
			System.out.println(food);
		}
		
		
		System.out.println("***********************OBJECT ARRAYLIST*****************************");
		for(Object stf: arlstp) {
			System.out.println(stf);
		}
	}

}
