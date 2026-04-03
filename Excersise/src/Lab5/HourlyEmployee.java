package Lab5;

public class HourlyEmployee extends Employee{
	private double hourlyRate, primaryHours;

	public HourlyEmployee(String name, HiredDate date, double hourlyRate, double primaryHours) {
		super(name, date);
		this.hourlyRate = hourlyRate;
		this.primaryHours = primaryHours;
	}

	@Override
	public double monthlySalary() {
		// TODO Auto-generated method stub
		return this.hourlyRate*this.primaryHours;
	}
	
}
