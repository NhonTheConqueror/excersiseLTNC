package Lab5;

public class Consultant extends Employee{
	private int contractNumber;
	private double billingRate;
	public Consultant(String name, HiredDate date, int contractNumber, double billingRate) {
		super(name, date);
		this.contractNumber = contractNumber;
		this.billingRate = billingRate;
	}
	@Override
	public double monthlySalary() {
		// TODO Auto-generated method stub
		return this.contractNumber;
	}
	
}
