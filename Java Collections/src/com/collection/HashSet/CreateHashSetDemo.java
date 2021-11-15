package com.collection.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("C");
		set.add("C++");
		set.add("Python");
		set.add("Scala");
		set.add("Scala");
		System.out.println(set);
		
		//Create HashSet from another collection
//		Set<Integer> firstFiveEvenNumbers = new HashSet<>();
		List<Integer> firstFiveEvenNumbers = new ArrayList<>();
		firstFiveEvenNumbers.add(2);
		firstFiveEvenNumbers.add(4);
		firstFiveEvenNumbers.add(6);
		firstFiveEvenNumbers.add(8);
		firstFiveEvenNumbers.add(10);
		
		Set<Integer> numbersSet = new HashSet<>(firstFiveEvenNumbers);
		
//		Set<Integer> nextTenEvenNumbers = new HashSet<>(firstFiveEvenNumbers);
		List<Integer> nextTenEvenNumbers = new ArrayList<>(firstFiveEvenNumbers);
		nextTenEvenNumbers.add(12);
		nextTenEvenNumbers.add(14);
		nextTenEvenNumbers.add(16);
		nextTenEvenNumbers.add(18);
		nextTenEvenNumbers.add(20);
		System.out.println(nextTenEvenNumbers);
		System.out.println("Set size " + firstFiveEvenNumbers.size());
		System.out.println("Set size " + nextTenEvenNumbers.size());
		
		numbersSet.addAll(nextTenEvenNumbers);
		System.out.println(numbersSet);
	}

}
