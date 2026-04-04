package Lab5;
import MyTools.Input;

public class HiredDate {
	public int day, mont, year;

	public HiredDate(int day, int mont, int year) {
		this.day = day;
		this.mont = mont;
		this.year = year;
	}

	public int getYear() {
		return this.year;
	}

	public void setDate() {
		
		System.out.println("Day/Mont/Year hired: ");
		this.day = Input.nextInt();
		this.mont = Input.nextInt();
		this.year = Input.nextInt();
		return;
	}
	
}
