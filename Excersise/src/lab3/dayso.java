package lab3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class dayso {

	
	public static int[] removeAllSame(int[] list, int target) {
		int id=0, n = list.length;
		int[] temp=new int[n];
		for(int i=0; i<n; i++) {
			if(list[i]!=target) {temp[id]=list[i];id++;}
		}
		return Arrays.copyOf(temp,id);
	}
	
	
	public static boolean isDoiXung(int[] list) {
		int j=list.length-1;
		for(int i=0;i<=j;i++) {
			if(list[i]!=list[j]) return false;
			j--;
		}
		return true;
	}
	
	public static int[] diffElementsArrAcs(int[] list) {
		TreeMap<Integer, Integer> count = new TreeMap<Integer, Integer>();
		for(int i:list) {
			count.put(i, count.getOrDefault(i, 0)+1);
		}
		int[] temp=new int[count.size()]; int id=0;
		for(int i: count.keySet()) {
			if(count.get(i)==1) {temp[id] = i;id++;}
		}
		return Arrays.copyOf(temp, id);
	}
	
	public static void main(String[] agrs) {
		int[] list = {1,3,5,5,3,-1};
		
//		for(int i: removeAllSame(list, 5)) {
//			System.out.println(i);
		
		System.out.println(diffElementsArrAcs(list));

		for(int i:diffElementsArrAcs(list)) {
			System.out.println(i);
		}
		
	
		
		
		
	}
}
