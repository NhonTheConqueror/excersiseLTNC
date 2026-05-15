package ltnc7;

import java.util.Arrays;
import java.util.Comparator;

public class CdList {
	private CD[] list;
	private int size;
	
	public CdList(int size) {
		this.list = new CD[size];
		this.size = size;
	}
	
	public void append(CD item) {
		for(int i =0 ; i<size; i++) {
			if(list[i]==null) {list[i] = item; return;}
			else if(list[i].id == item.id) {System.out.println("item already in the list");return;}
		}
		System.out.println("the CD list was full, add item unsuccesful");
	}
	
	public int totalItem() {
		int ans = 0;
		for(int i =0 ; i<size; i++) {
			if(list[i]==null) {return ans;}
			ans++;
		}
		return ans;
	}
	
	public double totalPrice() {
		double ans = 0.0;
		for(CD item:list) {
			if(item==null) {return ans;}
			ans += item.price;
		}
		return ans;
	}
	
	@Override
	public String toString() {
		String ans = "";
		for(CD item:list) {
			if(item==null) return ans;
			ans += "\n" + item.toString();
		}
		return ans;
	}
	
	public void sortByPriceDec(boolean decsend) {
		int opt;
		if(decsend == true) {opt =-1;}
		else{opt = 1;}
		Arrays.sort(this.list, new Comparator<CD>() {
			public int compare(CD a, CD b) {
				return (int)(opt*(a.price - b.price));
				}
			}
		);
	}
	
	public void sortByTilteAcs(boolean acsend) {
		int opt;
		if(acsend == true) {opt =1;}
		else{opt = -1;}
		Arrays.sort(this.list, new Comparator<CD>() {
			public int compare(CD a, CD b) {
				return opt*a.title.compareToIgnoreCase(b.title);
				}
		});
	}
	
}









