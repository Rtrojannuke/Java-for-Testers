package clsObj;
import clsObj.intface;

public class infcecall implements intface {
	//to use an interface user must first implement the unimplemented methods
	// HOW THE METHODS WORK DEPENDS SOLELY ON THE IMPLEMENTING CLASS

	public void catchcruise() {
		//Implement what the catchcruise function of the Interface should do 
		System.out.println("CONFIRM");
		
	}

	public void funfwb() {
		// Implement what the funfwb function of the Interface should do
		if(havefwb == true) {
			System.out.println("ENJOY YOURSELF ON MY BROTHER");
		}
		else {
			System.out.println("JUST GO AND SIT DOWN");
		}
		
	}
	public static void main(String[] args) {
		infcecall man = new infcecall();
		man.catchcruise();
		man.funfwb();
		
		
	}

}
