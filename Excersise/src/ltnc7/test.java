package ltnc7;

public class test {
	public static void main(String[] args) {
		CdList list = new CdList(5);
		list.append(new CD(1, "title1", "singer1", 10, 100.0));
		list.append(new CD(2, "title2", "singer2", 20, 200.0));
		list.append(new CD(3, "title3", "singer3", 30, 300.0));
		list.append(new CD(4, "title4", "singer4", 40, 400.0));
		list.append(new CD(5, "title5", "singer5", 50, 500.0));
		
		list.sortByTilteAcs(false);
		
		System.out.println(list.toString());
		
	}
}
