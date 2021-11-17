package com.collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateHashMap {

	public static void main(String[] args) {

		Map<String, Integer> numberMapping = new HashMap<>();

		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		numberMapping.put("Four", 4);
		
		//Using enhanced for loop
		for(Map.Entry<String, Integer> entry : numberMapping.entrySet()) {
			 System.out.println("Key -> " + entry.getKey() + 
					   " Value -> " + entry.getValue());
		}
		
		//Using Iterator
		Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();
		Iterator<Entry<String, Integer>> iterator = entries.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("Key : " + entry.getKey() + 
					 " Value : " + entry.getValue());
		}
		
		//Using Java 8 forEach
		numberMapping.forEach((K,V) -> {
			System.out.println("Key -----> " + K);
			System.out.println("Value -----> " + V);
		});
				

	}

}
