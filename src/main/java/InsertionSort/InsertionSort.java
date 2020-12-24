package InsertionSort;

public class InsertionSort {
	public InsertionSort() {
	}

	public Integer[] sortIntegers(Integer[] intArray) {
		Integer[] retArray = intArray.clone();
		for (int j = 1; j < retArray.length; j++) {
			Integer currValue = retArray[j];
			int i = j - 1;
			while ((i >= 0) && (retArray[i] > currValue)) {
				retArray[i + 1] = retArray[i];
				i--;
			}
			retArray[i + 1] = currValue;
		}
		return retArray;
	}

}
