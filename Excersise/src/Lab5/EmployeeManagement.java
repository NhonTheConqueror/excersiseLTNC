package Lab5;

public class EmployeeManagement {
	
	
	public static void main(String[] args) {
		HiredDate date = new HiredDate(0, 0, 2007);
		IEmployee a = new SalaryEmployee("Nhon", date, 0, 0);
		IEmployee b = new HourlyEmployee("Nhon", date, 0, 0);
		System.out.println(a.sameName(b));
		System.out.println(a.workYears(2010));
		IEmployee[] EList = new IEmployee[4];
		
		for(i=0;i<4;i++) {
			
		}
		
	}
	
	
}
