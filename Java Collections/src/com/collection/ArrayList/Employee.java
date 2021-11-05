package com.collection.ArrayList;

public class Employee {

	private int Id;
	private String name;
	private long salary;

	public Employee(int id, String name, long salary) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", salary=" + salary + "]";
	}

}
