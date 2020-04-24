package week3.day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		
		Map<String, String> mp=new HashMap<String, String>();
		
		//Add entry
		mp.put("AC001", "Neeraja");
		mp.put("AC002", "jaya");
		mp.put("AC003", "Krishna");
		
		//count---->sise
		int size = mp.size();
		System.out.println(size);
		
		//pick value from map---->get(key)
		String value = mp.get("AC001");
		System.out.println(value);
		
		//validation
		System.out.println(mp.containsKey("AC002"));
		System.out.println(mp.containsValue("Krishna"));
		
		//remove all rntries
		//mp.clear();
		
		//is empty
		
		System.out.println(mp.isEmpty());
		
		
		for (Entry<String,String> eachItem : mp.entrySet()) {
			System.out.println(eachItem.getKey());
			System.out.println(eachItem.getValue());
			
		}
		

	}

}
