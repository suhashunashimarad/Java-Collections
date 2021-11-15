package com.collection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		duplicateValueCheck();
		nullValueCheck();
		insertValuesInSet();
	}

	private static void duplicateValueCheck() {
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("Java");
		System.out.println(set.toString());
	}

	private static void nullValueCheck() {
		Set<String> nullSet = new HashSet<>();
		nullSet.add(null);
		nullSet.add("Java");
		nullSet.add(null);
		System.out.println(nullSet);
	}

	private static void insertValuesInSet() {
		Set<String> set = new HashSet<>();
		set.add("BMW");
		set.add("Audi");
		set.add("Porsche");
		set.add("Lambo");
		set.add("Tata");
		System.out.println(set.toString());
	}

}
