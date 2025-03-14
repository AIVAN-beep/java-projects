package walkthrough1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemDup {
	 public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 5, 6, 7, 4};
	        

	        int[] uniqueArray = removeDuplicates(array);

	        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
	    }

	    public static int[] removeDuplicates(int[] arr) {
	        LinkedHashSet<Integer> set = new LinkedHashSet<>();

	        for (int num : arr) {
	            set.add(num);
	        }

	        return set.stream().mapToInt(Integer::intValue).toArray();
}
}