package org.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("employee_regular")
public class Regular_EmployeeHierarchy extends EmployeeHierarchy {
	
	@Column(name = "salary")
	private float salary;
	
	@Column(name = "bonus")
	private int bonous;
	
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

	
	
	

}
