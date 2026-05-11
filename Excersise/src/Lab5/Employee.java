package Lab5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;




public abstract class Employee implements Comparable<Employee>{
	protected String name;
	protected HiredDate date;
	
	public Employee(String name, HiredDate date) {
		super();
		this.name = name;
		this.date = date;
	}
	
	@Override
	public int compareTo(Employee other) {
		return this.getName().compareTo(other.getName());
	}
	
	
	
	
	public String getName() {
		return name;
	}
	

	public boolean sameName(Employee a) {
		if(this.name == a.getName()) {return true;}
		return false;
	}
	

	public int workYears(int toYear) {
		return (toYear - this.date.getYear()); 
	}


	public HiredDate getDate() {
		return this.date;
	}
	

	public boolean isOlderThan(int year) {
		return (this.date.getYear() < year);
	}

	public abstract double monthlySalary();
	
	
}
