package bt5_5;

public class Subject {
	private String name;
	private long subjectCode;
	private double score;
	
	public Subject(String name, long subjectCode, double score) {
		this.name = name;
		this.subjectCode = subjectCode;
		this.score = score;
	}

	public double getScore() {
		return this.score;
	}
}
