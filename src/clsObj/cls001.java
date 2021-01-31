package clsObj;

public class cls001 {
	// A class is the template for creating other sample/item (e.g. Humans walk, have name, height, eat, weight, run e.t.c)
	//A class can be created to contain the above(e.g. like below) and also include other attributes that human should have e.g the robot functions below 
	// BEGINNING OF THE CLASS WHICH CONTAIN ATTRIBUTE AND FUNCTIONS OF A ROBOT SPECIES
	String gender;
	
	String name;
	
	int height;
	
	int weight;
	
	int physique;
	
	public void walk() {
		System.out.println("WALKIN AROUND FORM SMALL AGE");
		
	}
	public void eat() {
		System.out.println("EATING \nEATING \nEATING");
		
	}
	public void run() {
		System.out.println("RUNNING RUNNING");
	}
	public void gotogym() {
		physique = height + weight;
		//System.out.println("YOUR PHYSIQUE IS: "+ physique);
	}
	public void details() {
		System.out.println("YOUR NAME IS: "+ name);
		System.out.println("YOUR GENDER IS: "+ gender);
		System.out.println("YOUR HEIGHT IS: "+ height);
		System.out.println("YOUR WEIGHT IS: "+ weight);
		System.out.println("YOUR PHYSIQUE IS: "+ physique);
	}
	// END OF CLASS 
	
	
	public static void main(String[] args) {
		//AFTER A CLASS HAS BEEN CREATED, IT IS USED BY CREATING AN OBJECT e.g the robots class is called to create rob1 
		// GIVE ACCESS TO THE FEATURES YOU WANT ROB01 TO HAVE FROM THE ROBOT CLASS 
		cls001 rob1 = new cls001();
		rob1.gender = "female";
		rob1.name ="001";
		rob1.height = 340;
		rob1.weight = 600;
		rob1.details();
		rob1.eat();
		rob1.walk();
		rob1.run();
		rob1.gotogym();
		
	}
}
