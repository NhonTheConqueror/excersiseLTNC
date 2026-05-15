package Lab2_1;

import junit.framework.TestCase;

public class NumberTest extends TestCase {
	
	public void test() {
		long n = 567;
		
	}
}


class numbers{
	
	public static int countNum1(long num) {
		int ans = 0;
		long numCopy = num;
		while(numCopy/10l != 0l) {
			ans++;
			numCopy /= 10l;
		}	if(numCopy%10l != 0l) ans++;
		
		return ans;
	}
	
	public static int countNum2(long num) {
		return Long.toString(num).length();
	}
	
	public static long revert1(long num) {
		long ans = 0;
		long numCopy = num;
		long unit = (long) Math.pow(10, numbers.countNum1(num)-1);
		while(numCopy/10l != 0l) {
			ans += (numCopy%10l)*unit; unit/=10l;
			numCopy /= 10l;
		} if(numCopy%10l != 0) ans+=numCopy%10l; 
		
		return ans;
	}
	
	public static long revert2(long num) {
		String str = Long.toString(num);
		int len = str.length();
		String ans = "";
		for(int i = len-1; i>=0; i--) {
			ans+= str.charAt(i);
		}
		return Long.parseLong(ans);
	}
	
	

}