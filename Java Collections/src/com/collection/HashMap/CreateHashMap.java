package com.collection.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CreateHashMap {

	public static void main(String[] args) {

		// Map numbers to String
		Map<String, Integer> numberMapping = new HashMap<>();

		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		numberMapping.put("Four", 4);

		// HashMap allows only one null key
		numberMapping.put(null, null);
		numberMapping.put(null, 6);
		numberMapping.put(null, 8);
		System.out.println(numberMapping);

		// Check HashMap isEmpty
		System.out.println(numberMapping.isEmpty());
//		numberMapping.clear();
//		System.out.println(numberMapping.isEmpty());

		// Size of the HashMap
		System.out.println(numberMapping.size());

		// Check key exists or not
		if (numberMapping.containsKey("Three")) {
			System.out.println(numberMapping.get("Three") + " Exists..!");
		} else {
			System.out.println("Key doesn't exist");
		}

		// Check value exists or not
		if (numberMapping.containsValue(4)) {
			System.out.println("Value Exists..!");
		} else {
			System.out.println("Value doesn't exist");
		}

		// Get Value by Key
		Integer num = numberMapping.get("Two");
		System.out.println(num);

		// Rremove keys from HashMap
		numberMapping.remove("One");
		System.out.println(numberMapping);

		// Get only Keys from HashMap
		Set<String> keySet = numberMapping.keySet();
		System.out.println("Keys from the HashMap " + keySet);

		// Get only Values from HashMap
		Collection<Integer> values = numberMapping.values();
		System.out.println("Values from the HashMap " + values);
	}

}
