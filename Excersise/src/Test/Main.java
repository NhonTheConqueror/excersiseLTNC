package Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

abstract class trash { 
	public trash() {};
	public abstract int show() {};
}



abstract class String implements Comparable<String> {
	private String self;
	@Override
	public int compareTo(String str) {
		return super.toString().
	}
}

public class Main extends trash{
    public static void main(String[] args) {
    	
    	int[] arr = {0,9,8,6,7,4,5,2,1};
    	trash[] bin = new trash[5];
    	Arrays.sort(bin);
        System.out.println(arr);
        
    }

	@Override
	public int show() {
		// TODO Auto-generated method stub
		return 0;
	}
}