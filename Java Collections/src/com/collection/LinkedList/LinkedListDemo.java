package com.collection.LinkedList;

import java.util.LinkedList;

//add elements
//add element at specified index
//addFirst
//addLast
public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> citiesList = new LinkedList<>();
		citiesList.add("Gadag");
		citiesList.add("Hubli");
		citiesList.add("Dharwad");
		System.out.println("Initial linkedlist -> " + citiesList);

		citiesList.add(1, "Belagavi");
		System.out.println("Element at Index 1 " + citiesList);

		citiesList.addFirst("Bagalkot");
		System.out.println("List starts from " + citiesList);

		citiesList.addLast("Bijapur");
		System.out.println("List ends with " + citiesList);
	}

}
