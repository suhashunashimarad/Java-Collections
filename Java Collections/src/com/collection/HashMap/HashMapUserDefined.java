package com.collection.HashMap;

import java.util.HashMap;
import java.util.Map;

import com.collection.dto.Student;

public class HashMapUserDefined {

	public static void main(String[] args) {

		Map<Integer, Student> studentMap = new HashMap<>();
		studentMap.put(1, new Student("Virat", "Kohli"));
		studentMap.put(2, new Student("Ab", "Devilliars"));
		studentMap.put(3, new Student("Yuzhi", "Chahal"));
		System.out.println(studentMap.values());
	}

}
