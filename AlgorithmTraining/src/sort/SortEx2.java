package sort;

public class SortEx2 {
	
	public static void main(String[] args) {
		// 근접 해 있는 두 개를 비교하여 적은 것을 왼쪽으로 보냄 ==> 한 바퀴를 다 돌면 가장 큰게 제일 오른쪽에 있음
		int [] nums = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<9-i; j++) {
				
				if (nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
				
			}	
		}
		
		for (int i=0; i< nums.length; i++) {
			System.out.print(nums[i]+" ");	
		}
		
		
	}
}
