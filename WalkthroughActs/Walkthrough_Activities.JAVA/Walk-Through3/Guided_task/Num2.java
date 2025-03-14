package walkthrough1;

public class OneDArray {
	public static void main(String[] args) {
		int[] nums = {10, 3, 8, 9, 5};
		
		int max = nums[0];
		int min = nums[0];
		
		
		System.out.println("Numbers:");
		for (int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
			if(nums[i] < min) {
				min = nums[i];
			}
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		
		System.out.println("Maximum Value: "+ max);
		System.out.println("Minimum Value: "+ min);
	}
}

