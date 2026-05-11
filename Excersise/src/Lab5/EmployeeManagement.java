package Lab5;

import java.util.Arrays;

import MyTools.Input;




public class EmployeeManagement {
	
	
	public static void main(String[] args) {
		//create an array of 3 employees
		Employee[] EList = new Employee[3];
		EList[0] = new SalaryEmployee("Nhon",
				new HiredDate(1, 1, 2000), 120000, 1000);
		EList[1] = new HourlyEmployee("Ha",
				new HiredDate(1, 12, 2001), 100, 160);
		EList[2] = new Consultant("Linh",
				new HiredDate(1, 11, 2004), 5000,10.9);
		Arrays.sort(EList);
		for(Employee i: EList) {
			System.out.println(i.getName());
		}
		

		
	}
}
