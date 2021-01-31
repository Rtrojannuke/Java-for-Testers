package clsObj;

public class clsconstrct {
	
//THIS IS TO SHOW HOW TO CREATE AND USE CONSTRUCTORS 
//CONSTRUCTORS HAVE SAME NAME AS CLASS 
// CONSTRUCTORS DON'T HAVE RETURN TYPE
// CONSTRUCTORS DON'T HAVE DATATYPE (e.g Void, int e.t.)
	int age;
	
	String name;
	
	String gender; 
	 
	String height;
	
	String hobbies;
	
	public clsconstrct() { // is a constructor doesn't have type and has same name as class
		// it is called by default whenever the class is called(object is created);
		// if a constructor isn't in a class Java create one by default;
		name = "MUBARAK";
		gender = 
				"MALE";
		height = 
				"66 inches";
		System.out.println("YOUR NAME IS: " + name);
		System.out.println("YOUR GENDER IS: " + gender);
		System.out.println("YOUR HEIGHT IS: " + height);
		
		
	}
	
	public clsconstrct(String name_,int age_,String height_, String hobbies_) {// Constructors can accept value as well
		name = name_;
		age = age_;
		height = height_;
		hobbies = hobbies_;
		System.out.println("YOUR NAME IS: " + name);
		System.out.println("YOUR GENDER IS: " + gender);
		System.out.println("YOUR HEIGHT IS: " + height);
		System.out.println("YOUR HOBBIES IS: " + hobbies);
		
		
	}
	
	public clsconstrct(clsconstrct a) { // Calling constructor by copying constructor
		name = a.name;
		age = a.age;
		height = a.height;
		hobbies = a.hobbies;
		System.out.println("YOUR NAME IS: " + name);
		System.out.println("YOUR GENDER IS: " + gender);
		System.out.println("YOUR HEIGHT IS: " + height);
		System.out.println("YOUR HOBBIES IS: " + hobbies);
		
	}
	
	public void details() { // a method not constructor bcos it doesn't have same name as class and it has a type(void)
		System.out.println("YOUR NAME IS: " + name);
		System.out.println("YOUR GENDER IS: " + gender);
		System.out.println("YOUR HEIGHT IS: " + height);
		System.out.println("YOUR HOBBIES IS: " + hobbies);
	}
	
	public static void main(String[] args) {
		System.out.println("****************************DEFAULT CONSTRUCTOR*************************"); 
		clsconstrct frst = new clsconstrct(); // calling default constructor
		System.out.println("****************************CONSTRUCTOR WITH VALUES*************************");
		clsconstrct fst = new clsconstrct("Mutiu",23,"69 inches","Playing football"); 
		System.out.println("****************************COPYING CONSTRUCTOR*************************");
		clsconstrct fsst = new clsconstrct(fst);
		
	}

}
