package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collection.dto.Employee;

public class SortList {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Ramesh", 35000));
		empList.add(new Employee(3, "Pranesh", 45000));
		empList.add(new Employee(2, "Suresh", 80000));

		Collections.sort(empList, new MySort());
		System.out.println(empList);

//		Using Anonymous class
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		});
		System.out.println("Using Anonymous class " + empList);

//		Using Java 8
		Collections.sort(empList, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
		System.out.println("Using Java 8 " + empList);

	}

}

class MySort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary() - o2.getSalary()); // Asc order
//		return (int) (o2.getSalary() - o1.getSalary());    //Desc order
	}

}
