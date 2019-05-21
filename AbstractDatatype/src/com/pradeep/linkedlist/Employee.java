package com.pradeep.linkedlist;

public class Employee {
	
	private int id;
	private String FirstName;
	private String LastName;
	
	
	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
	
	
	

}
