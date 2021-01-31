package arryp;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashmappra {
	public static void main(String[] args) {
		// HASHMAP REQUIRES USER GIVING KEY AND VALUE WHICH CAN BE OF SAME DATTYPE OR DIFFERENT
		HashMap<String, String> nap = new HashMap<String, String>(); // OR
		HashMap<String, Integer> nlap = new HashMap<String, Integer>(); //OR
		HashMap<String, Float> nwap = new HashMap<String, Float>(); // 
		
		// ADDING VALUES 
		nap.put("name", "Mubarak");
		nap.put("gender", "Male");
		nap.put("Interst", "Automation");
		nlap.put("SEED QUANTITY", 3);
		nwap.put("COCKEREL EGGS", (float) 14.5);
		
		// PRINTING INVIDUAL STUFFS IN HASHMAP
		System.out.println("****************************INDIVIDUAL METHOD*****************");
		System.out.println(nap.get("name"));
		System.out.println(nlap.get("SEED QUANTITY"));
		System.out.println(nwap.get("COCKEREL EGGS"));
		
		//OTHER METHODS TO PRINT OUT FROM HASHMAP
		//1. USING WHILE LOOP
		System.out.println("****************************WHILE MULTIPLE METHOD*****************");
		Iterator<String> iteratr = nap.keySet().iterator(); //iterator is used to iterate through the hahmap  
		
		while(iteratr.hasNext()) { // Checking if hashmap has another value or next value
			String key = iteratr.next();
			System.out.println(key + " : "+ nap.get(key));
		}
		System.out.println("****************************FOR EACH MULTIPLE METHOD*****************");
		for(Entry<String, String> entry: nap.entrySet()) { // entry library is used to check for every item in the hashmap
			System.out.println(entry.getKey()+ " : " + entry.getValue());
		}
		
	}

}
