package bt5_5;

import java.util.HashMap;
import java.util.Vector;

public class StudentManagement {
	private Vector<Student> list = new Vector<>();

	public StudentManagement(Vector<Student> list) {
		super();
		this.list = list;
	}
	
	public StudentManagement() {}
	
	
	public void add(Student a) {
		list.add(a);
	}
	
	public Student findStudent(String name ,long mssv) {
		for(Student x : list) {
			if(x.getName()==name && x.getMSSV() == mssv) {
				return x;
			}
		}
		return null;
	}

	public double getThisStudentAVG(String name ,long mssv) {
		try {
			Student a = findStudent( name , mssv);
			return a.getAVG();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			return 0.0;
		}
	}
	
	public static void main(String[] agrs) {
		
	}
	
}
