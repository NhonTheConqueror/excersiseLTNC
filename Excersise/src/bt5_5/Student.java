package bt5_5;

public class Student {
	private String name;
	private long mssv;
	private Date date;
	private ScoreList score;
	
	public Student(String name, long mssv, Date date, ScoreList score) {
		super();
		this.name = name;
		this.mssv = mssv;
		this.date = date;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}
	
	public long getMSSV() {
		return mssv;
	}
	public double getAVG() {
		return score.getAVG();
	}

	
}
