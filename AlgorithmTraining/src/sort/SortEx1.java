package sort;

public class SortEx1 {

	public static void main(String[] args) {
		// 선택 정렬
		// 가장 적은 것을 선택해서 가장 앞으로 보내는 것 
		int [] nums = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int index = 0;
		
		for (int i=0; i< nums.length; i++) {
						
			int min = 9999;

			for (int j=i; j< nums.length; j++) {
				if (min > nums[j]) {
					min = nums[j];
					index = j;
				}
			}
			
			int temp = nums[i];
			
			nums[i] = nums[index];
			
			nums[index] = temp;
			
		}
		
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	
	}
}
