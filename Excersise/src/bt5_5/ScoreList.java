package bt5_5;

import java.util.Vector;


public class ScoreList {
	private Vector<Subject> SubjectList = new Vector<>();

	public ScoreList(Vector<Subject> subjectList) {
		SubjectList = subjectList;
	}
	
	public ScoreList() {	}
	
	public void add(Subject sub) {
		SubjectList.add(sub);
	}

	public double getAVG() {
		double ans = 0;
		int l = SubjectList.size();
		for(int i =0; i<l; i++) {
			ans+= SubjectList.get(i).getScore();
		}
		return ans/l;
	}


}
