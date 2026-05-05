package bt5_5;

public class Date {
	private int day, month, year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public static String formatDate(String date) {
		String[] arr = date.split("/");
		String ans = "";
		ans += arr[0];
		switch(Integer.parseInt(arr[1])) {
			case 1: {ans+= " January ";break;}
			case 2: {ans+= " February ";break;}
			case 3: {ans+= " March ";break;}
			case 4: {ans+= " April ";break;}
			case 5: {ans+= " May ";break;}
			case 6: {ans+= " June ";break;}
			case 7: {ans+= " July ";break;}
			case 8: {ans+= " August ";break;}
			case 9: {ans+= " September ";break;}
			case 10: {ans+= " October ";break;}
			case 11: {ans+= " November ";break;}
			case 12: {ans+= " December ";break;}
		}
		
		ans += arr[2];
		return ans;
	}
	
	
//	public static void main(String[] agrs){
//		System.out.println(Date.formatDate("01/2/2000"));
//		
//	}
	
}







