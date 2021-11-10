package com.collection.LinkedList;

import java.util.LinkedList;

//Get first element
//Get last element
//Get element at the specified index
//Get all the elements
public class RetrieveLinkedListElements {

	public static void main(String[] args) {
		
		LinkedList<String> carsList = new LinkedList<>();
		carsList.add("BMW");
		carsList.add("Lambo");
		carsList.add("Audi");
		carsList.add("BMW");
		carsList.add("Tata");
		
		String firstCar = carsList.getFirst();
		System.out.println("First car -> " + firstCar);
		
		String lastCar = carsList.getLast();
		System.out.println("Last car -> " + lastCar);
		
		String spElement = carsList.get(3);
		System.out.println("Last car -> " + spElement);
		
		carsList.forEach(e ->{
			System.out.println(e);
		});
	}

}
