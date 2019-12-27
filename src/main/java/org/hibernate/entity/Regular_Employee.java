package org.hibernate.entity;

public class Regular_Employee extends Employee{
	private  float salary;
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonous() {
		return bonous;
	}
	public void setBonous(int bonous) {
		this.bonous = bonous;
	}
	private int bonous;
	
	
	

}
