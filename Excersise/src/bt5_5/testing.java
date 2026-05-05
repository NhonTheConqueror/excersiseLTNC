package bt5_5;

import junit.framework.TestCase;

public class testing extends TestCase {
	public void testConstructor() {
		Date date1 = new Date(4,3,2007);
		Date date2 = new Date(26,7,2007);
		
		Subject toan,ly,anh;
		toan = new Subject("Toan", 1, 8.5);
		ly = new Subject("Ly", 2, 9);
		anh = new Subject("Anh Van", 3, 9.5);
		ScoreList listScore = new ScoreList();
		listScore.add(toan);
		listScore.add(ly);
		listScore.add(anh);
		Student Nhon,Ha;
		Nhon = new Student("DHNhon", 2511130192L, date1, listScore);
		Ha = new Student("DTTHa", 5711014L, date2, new ScoreList());
		StudentManagement dslop = new StudentManagement();
		dslop.add(Ha);
		dslop.add(Nhon);
		
		System.out.println(dslop.getThisStudentAVG("DHNhon", 2511130192L));
	}
}
