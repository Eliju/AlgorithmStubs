package InsertionSort;

import java.util.Arrays;

public class TestingSorts {

	public static void main(String[] args) {
		Integer[] intInput = new Integer[]{5,2,6,2,7,0,-1,18,0,-23,-67};
		Double[] doubleInput = new Double[]{5.23452435,2.4674567,6.0,2.0,7.7890798,0.0,-1.578,18.1234,0.01,-23.0,-67.3456,2.4674567};
		String[] strInput = new String[] {"aakkoset", "Aakkoset", "AlVaRi", "aLvArI", "TuOhItOrVi", "tUoHiToRvI", "Öökköset", "öökköset", "alavireinen", "ylävireinen"};
		
		Integer[] sortedI = InsertionSort.sortNumbers(intInput);
		System.out.println("Integer, without params: " + Arrays.toString(sortedI));
		sortedI = InsertionSort.sortNumbers(intInput, "asc");
		System.out.println("Integer, with asc: " + Arrays.toString(sortedI));
		sortedI = InsertionSort.sortNumbers(intInput, "desc");
		System.out.println("Integer, with desc: " + Arrays.toString(sortedI));
		System.out.println();
		Double[] sortedD = InsertionSort.sortNumbers(doubleInput);
		System.out.println("Double, without params: " + Arrays.toString(sortedD));
		sortedD = InsertionSort.sortNumbers(doubleInput, "asc");
		System.out.println("Double, with asc: " + Arrays.toString(sortedD));
		sortedD = InsertionSort.sortNumbers(doubleInput, "desc");
		System.out.println("Double, with desc: " + Arrays.toString(sortedD));
		System.out.println();
		String[] sortedS = InsertionSort.sortStrings(strInput);
		System.out.println("String, without params (case insensitive): " + Arrays.toString(sortedS));
		sortedS = InsertionSort.sortStrings(strInput, "asc");
		System.out.println("String, with asc, case insensitive: " + Arrays.toString(sortedS));
		sortedS = InsertionSort.sortStrings(strInput, "asc","case_sensitive");
		System.out.println("String, with asc, case sensitive: " + Arrays.toString(sortedS));
		sortedS = InsertionSort.sortStrings(strInput, "desc");
		System.out.println("String, with desc, case insensitive: " + Arrays.toString(sortedS));
		sortedS = InsertionSort.sortStrings(strInput, "desc","case_sensitive");
		System.out.println("String, with desc, case sensitive: " + Arrays.toString(sortedS));
	}

}
