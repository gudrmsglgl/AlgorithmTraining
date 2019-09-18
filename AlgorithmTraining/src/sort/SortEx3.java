package sort;

public class SortEx3 {
	
	public static void main(String[] args) {
		
		int[] nums = {1,3,7,4,6,5,2,9,8,10};
		int temp;
		int j;
		
		// 삽입 정렬 
		
		for (int i=0; i<nums.length-1; i++) {
			j = i;
			
			while (nums[j] > nums[j+1]) {
				
				temp = nums[j];
				nums[j] = nums[j+1];
				nums[j+1] = temp;
				
				j--;
			}
		}

		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		
	}
}
