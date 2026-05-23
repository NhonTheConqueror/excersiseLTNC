package n300baiCode;

import java.util.HashMap;

//Bài toán Two Sum trên LeetCode:
//Cho một mảng số nguyên và một giá trị target,
//cần tìm ra chỉ số của hai phần tử sao cho tổng bằng target.
//Yêu cầu: trả về đúng một cặp chỉ số, đảm bảo có lời giải.

public class bai1 {
	
	public int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> cont = new HashMap<>();
		
		for(int i = 0; i<nums.length; i++) {
			int key = target-nums[i];
			if(cont.containsKey(nums[i])) {
				return new int[] {cont.get(nums[i]), i};
			}
			cont.put(key, i);
		}
		
		return new int[] {};
		
	}
	
	public static void main(String[] agrs){
		
	}
		
}
