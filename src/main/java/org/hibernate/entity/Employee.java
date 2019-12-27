package org.hibernate.entity;

/**
 * 
 * @author amir ansari
 * created at 21-12-2019
 *  Create an entity class of employee and declare its attribute
 *
 */
public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
