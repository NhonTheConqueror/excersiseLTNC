package n300baiCode;

import java.util.HashMap;
import java.util.Stack;

//Bài toán Valid Parentheses (LeetCode):
//Cho một chuỗi chỉ gồm các ký tự ngoặc (), {}, [].
//Nhiệm vụ: kiểm tra xem chuỗi có hợp lệ không.
//Chuỗi hợp lệ khi:
//- Các ngoặc mở được đóng đúng loại.
//- Thứ tự đóng mở phải đúng (stack).

public class bai2 {
	
	public static String openCase = "({[";
	public static Character[] pair = new Character[128];
	static {
		pair[(int)'('] = ')';
		pair[(int)'{'] = '}';
		pair[(int)'['] = ']';
		pair[(int)')'] = 'c';
		pair[(int)'}'] = 'c';
		pair[(int)']'] = 'c';
		
	}
	
	
	public static boolean isOpen(Character s) {
		return pair[s] != 'c' ;
	}
	
    public static boolean isValid(String s) {
    	
    	if(s.length()%2!=0 || s.length()==0) {return false;}
    	
        
    	Stack<Character> openCont = new Stack<Character>();

    	
    	for(int i = 0; i<s.length(); i++) {
    		if(isOpen(s.charAt(i))) {openCont.addLast(pair[s.charAt(i)]);}
    		else {
    			if(openCont.size()!=0 && s.charAt(i) == openCont.getLast()) {openCont.removeLast();}
    			else {return false;}
    		}
    	}
    	
    	//true if openCont.size()==0 else false
    	return openCont.size()==0;
    }
    
    
    public static void main(String[] agrs) {
    	String s = "([)";
    	System.out.println(isValid(s));
    }
    
}
