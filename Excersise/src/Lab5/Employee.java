package Lab5;

public abstract class Employee implements IEmployee{
	protected String name;
	protected HiredDate date;
	public Employee(String name, HiredDate date) {
		super();
		this.name = name;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean sameName(IEmployee a) {
		if(this.name==a.getName()) {return true;}
		return false;
	}
	
	@Override
	public int workYears(int toYear) {
		return (toYear - this.date.getYear()); 
	}
	
	
}
