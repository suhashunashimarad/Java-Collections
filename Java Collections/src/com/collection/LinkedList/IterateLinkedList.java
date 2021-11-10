package com.collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

import javax.management.MBeanAttributeInfo;

public class IterateLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> mobilesList = new LinkedList<>();
		mobilesList.add("Samsung");
		mobilesList.add("Nokia");
		mobilesList.add("Iqoo");
		mobilesList.add("Oneplus");
		mobilesList.add("Realme");
		mobilesList.add("Realme");
		
		boolean exists = mobilesList.contains("iphone");
		System.out.println("Exists or not : " + exists);
		
		int indexOf = mobilesList.indexOf("Iqoo");
		System.out.println("Index of Iqoo mobile " + indexOf);
		
		int lastIndexOf = mobilesList.lastIndexOf("Realme");
		System.out.println("Index of Realme mobile " + lastIndexOf);
		
		System.out.println("Iterate elements using Iterator ");
		Iterator<String> iterator = mobilesList.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		System.out.println("Iterate elements using Enhanced for loop ");
		for(String list : mobilesList) {
			System.out.println(list);
		}
		
		System.out.println("Iterate elements using forEach ");
		mobilesList.forEach(e -> {
			System.out.println(e);
		});
		
	}

}
