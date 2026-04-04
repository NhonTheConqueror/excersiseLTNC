package Lab5;

import MyTools.Input;

public class EmployeeManagement {
	
	
	public static void main(String[] args) {
		HiredDate date = new HiredDate(0, 0, 2007);
		IEmployee a = new SalaryEmployee("Nhon", date, 0, 0);
		IEmployee b = new HourlyEmployee("Nhon", date, 0, 0);
		//System.out.println(a.sameName(b));
		//System.out.println(a.workYears(2010));
		IEmployee[] EList = new IEmployee[10];
		
		System.out.println("Choose 1 for Full time\n"+
				"       "+"2 for Part time\n"+"       "+
							"other numbers for Consultant.\n");
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Employee number "
					+ Integer.toString(i+1) + " :");
			
			switch(Input.nextInt()) {
			
			case(1): {EList[i] = IEmployee.addFullTimeEmpl();}
			
			case(2): {EList[i] = IEmployee.addPartTimeEmpl();}
			
			default: {EList[i] = IEmployee.addConsultant();}
			
			}
		}
		
	}
}
