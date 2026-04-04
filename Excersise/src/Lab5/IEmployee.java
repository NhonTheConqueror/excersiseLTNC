package Lab5;

import MyTools.Input;

public interface IEmployee {
	public boolean sameName(IEmployee b);
	public String getName();
	public int workYears(int toYear);
	public double monthlySalary();
	
	public static IEmployee addFullTimeEmpl() {
		//full time eployee have (name,date,annualSalary,stock)
		String name;
		HiredDate date = new HiredDate(0, 0, 0);
		double annualSalary;
		int stockOpt;
		
		System.out.println("Name: ");
		name = Input.nextLine();
		
		date.setDate();
		
		System.out.println("Annual Salary: ");
		annualSalary = Input.nextDouble();
		
		System.out.println("Stock option: ");
		stockOpt = Input.nextInt();
		
		return new SalaryEmployee(name, date, annualSalary, stockOpt);
		
	}
	
	public static IEmployee addPartTimeEmpl() {
		//part time eployee have (name,date,hourlyRate,primaryHours)
		String name;
		HiredDate date = new HiredDate(0, 0, 0);
		double hourlyRate;
		double primaryHours;
		
		System.out.println("Name: ");
		name = Input.nextLine();
		
		date.setDate();
		
		System.out.println("hourly Rate: ");
		hourlyRate = Input.nextDouble();
		
		System.out.println("primary Hours: ");
		primaryHours = Input.nextDouble();
		return new HourlyEmployee(name, date, hourlyRate, primaryHours);
		
	}
	
	public static IEmployee addConsultant() {
		//Consultant( name, HiredDate,contractNumber,billingRate)
		String name;
		HiredDate date = new HiredDate(0, 0, 0);
		int contractNumber;
		double billingRate;
		
		Input.nextLine(); // CLEAR THE buffer: Eat the leftover newline
		
		System.out.println("Name: ");
		name = Input.nextLine();
		
		date.setDate();
		
		System.out.println("contract number: ");
		contractNumber = Input.nextInt();
		
		System.out.println("billing rate: ");
		billingRate = Input.nextDouble();
		
		return new Consultant(name, date, contractNumber, billingRate);
		
	}
}


