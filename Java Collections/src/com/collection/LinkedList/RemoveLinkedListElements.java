package com.collection.LinkedList;

import java.util.LinkedList;

//Remove the first element
//Remove the last element
//Remove the first occurrence of given element
//CLear the list
public class RemoveLinkedListElements {

	public static void main(String[] args) {

		LinkedList<String> companiesList = new LinkedList<>();
		companiesList.add("Amazon");
		companiesList.add("Facebook");
		companiesList.add("Google");
		companiesList.add("Apple");
		System.out.println(companiesList);

		String removeFirst = companiesList.removeFirst();
		System.out.println("Removed " + removeFirst + " from list -> " + companiesList);

		String removeLast = companiesList.removeLast();
		System.out.println("Removed " + removeLast + " from list -> " + companiesList);		
		
		companiesList.remove("Google");
		System.out.println("Remaining list " + companiesList);
		
		companiesList.clear();
		if(companiesList.isEmpty()) {
			System.out.println("Empty List " + companiesList);
		}

	}

}
