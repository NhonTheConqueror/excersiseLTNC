package n300baiCode;

// Bài toán Merge Two Sorted Lists (LeetCode):
// Cho hai danh sách liên kết đơn đã được sắp xếp tăng dần.
// Nhiệm vụ: gộp chúng lại thành một danh sách liên kết mới,
// cũng được sắp xếp tăng dần.


 // Definition for singly-linked list.
class ListNode {
	 //properties
     int val;
     ListNode next;
     
     ListNode() {} //construction1
     ListNode(int val) { this.val = val; } //construction2
     ListNode(int val, ListNode next) { this.val = val; this.next = next; } //construction3
}


public class bai3 {
	
	
	public static String showList(ListNode x) {
		String res = "[";
		while(x!=null) {
			res+= " "+Integer.toString(x.val);
			x = x.next;
		}
		return res + " ]";
	}
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	    if(list1 == null) return list2;
	    if(list2 == null) return list1;
	    
	    ListNode dummy = new ListNode(0);  // Node giả
	    ListNode current = dummy;
	    
	    while(list1 != null && list2 != null) {
	        if(list1.val <= list2.val) {
	            current.next = list1;
	            list1 = list1.next;
	        } else {
	            current.next = list2;
	            list2 = list2.next;
	        }
	        current = current.next;
	    }
	    
	    // Nối phần còn lại
	    current.next = (list1 != null) ? list1 : list2;
	    
	    return dummy.next;  // Bỏ qua node giả
	}
    
    
    
//    public static void main(String[] args) {
//		bai3 test = new bai3();
//		
//		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
//		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
//		
//		System.out.println(showList(test.mergeTwoLists(list1, list2)));
//	}
    
}
