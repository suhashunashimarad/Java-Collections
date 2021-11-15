package com.collection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetRemoveElements {

	public static void main(String[] args) {
		
		Set<String> citiesSet = new HashSet<>();
		citiesSet.add("Gadag");
		citiesSet.add("Hubli");
		citiesSet.add("Dwd");
		citiesSet.add("Belagavi");
		citiesSet.add("Ballary");
		
		//remove
		boolean check = citiesSet.remove("Dwd");
		System.out.println("Check whether element removed from set " + check);
		System.out.println(citiesSet);
		
		//removeAll
		Set<String> set = new HashSet<>();
		set.add("Gadag");
		set.add("Ballary");
		
		citiesSet.removeAll(set);
		System.out.println("Remove all from the set " + citiesSet);
		
		//clear
		
		citiesSet.clear();
		System.out.println("After clean " + citiesSet);
		
	}

}
