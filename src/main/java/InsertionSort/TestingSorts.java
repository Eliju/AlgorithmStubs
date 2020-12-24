package InsertionSort;

import java.util.Arrays;

public class TestingSorts {

	public static void main(String[] args) {
		Integer[] sorted = new InsertionSort().sortIntegers(new Integer[]{5,2,6,2,7,0,-1,18,0,-23,-67});
		System.out.print(Arrays.toString(sorted));
	}

}
