package Lab5;

public class SalaryEmployee extends Employee{
	private double annualSalary;
	private int stockOption;
	public SalaryEmployee(String name, HiredDate date, double annualSalary, int stockOption) {
		super(name, date);
		this.annualSalary = annualSalary;
		this.stockOption = stockOption;
	}
	@Override
	public double monthlySalary() {
		if(this.workYears(2008)>5) {return this.annualSalary/12 + 500000;}
		return this.annualSalary/12;
	}
	
}
