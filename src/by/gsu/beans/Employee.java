package by.gsu.beans;

import java.io.Serializable;

public class Employee implements Serializable {
	private String name;
	private String vacancy;
	private float salary;
	private float bonus;
	static float baseBonus=15;
	
	public Employee(String name, String vacancy, float salary) {
		super();
		this.name = name;
		this.vacancy = vacancy;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVacancy() {
		return vacancy;
	}

	public void setVacancy(String vacancy) {
		this.vacancy = vacancy;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public static float getBaseBonus() {
		return baseBonus;
	}
	
	public float totalBonus() {
		return bonus*baseBonus;
	}

	@Override
	public String toString() {
		return name + ";" + vacancy + ";" + salary + ";" + bonus;
	}
	

}