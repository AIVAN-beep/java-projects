package walkthrough1;
public class OneDArray {
    public static void main(String[] args) {
        int[] nums = {10, 3, 8, 9, 5};

        int max = nums[0];
        int min = nums[0];

        System.out.println("Original Numbers:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int left = 0, right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

        System.out.println("\nReversed Numbers:");
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
