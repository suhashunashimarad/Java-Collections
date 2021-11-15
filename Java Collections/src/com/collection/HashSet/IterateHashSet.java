package com.collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateHashSet {

	public static void main(String[] args) {
		Set<String> courses = new HashSet<>();
		courses.add("Java");
		courses.add("C");
		courses.add("Python");
		courses.add("C++");

		enhancedForLoop(courses);
		basicLoopIterator(courses);
		whileLoopIterator(courses);
		lambdaForEach(courses);
		streamApi(courses);
	}

	private static void enhancedForLoop(Set<String> courses) {
		for (String courseSet : courses) {
			System.out.println(courseSet);
		}
		System.out.println("============================");
	}

	private static void basicLoopIterator(Set<String> courses) {
		for (Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
			String courseSet = (String) iterator.next();
			System.out.println(courseSet);
		}
		System.out.println("============================");
	}

	private static void whileLoopIterator(Set<String> courses) {
		Iterator<String> itr = courses.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("============================");
	}

	private static void lambdaForEach(Set<String> courses) {
		courses.forEach(courseSet -> System.out.println(courseSet));
		System.out.println("============================");
	}

	private static void streamApi(Set<String> courses) {
		courses.stream().filter(course -> !course.equalsIgnoreCase("Java")).forEach(c -> System.out.println(c));
	}

}
