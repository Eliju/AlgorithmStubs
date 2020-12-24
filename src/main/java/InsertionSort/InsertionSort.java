package InsertionSort;
import java.util.HashMap;
import java.util.function.*;

public class InsertionSort {
	
	public static <T extends Number> T[] sortNumbers(T[] intArray, String... ascOrDesc) {
		T[] retArray = intArray.clone();
		String aOD = "asc";
		if (ascOrDesc.length > 0) {
			aOD = ascOrDesc[0];
		}
		for (int j = 1; j < retArray.length; j++) {
			T currValue = retArray[j];
			int i = j - 1;
			while ((i >= 0) && 
					((aOD.toLowerCase().equals("asc") && retArray[i].doubleValue() > currValue.doubleValue()) || 
					((aOD.toLowerCase().equals("desc") && retArray[i].doubleValue() < currValue.doubleValue())))) {
				retArray[i + 1] = retArray[i];
				i--;
			}
			retArray[i + 1] = currValue;
		}
		return retArray;
	}
	
	public static String[] sortStrings(String[] strArray, String...params) {
		String ascOrDesc = "asc";
		if (params.length > 0) {
			ascOrDesc = params[0];
		}
		Boolean ignoreCase = true;
		if (params.length > 1) {
			ignoreCase = params[1].equals("case_insensitive");
		}
		HashMap<String, BiFunction<String, String, Integer>> operators = new HashMap<String, BiFunction<String, String, Integer>>();
		operators.put("case_sensitive", (x,y) -> x.compareTo(y));
		operators.put("case_insensitive", (x,y) -> x.compareToIgnoreCase(y));
		
		String[] retArray = strArray.clone();
		for (int j = 1; j < retArray.length; j++) {
			String currValue = retArray[j];
			int i = j - 1;
			while ((i >= 0) && 
					((ascOrDesc.toLowerCase().equals("asc") && ((ignoreCase ? operators.get("case_insensitive").apply(retArray[i], currValue) : operators.get("case_sensitive").apply(retArray[i], currValue)) > 0)) ||
					((ascOrDesc.toLowerCase().equals("desc") && ((ignoreCase ? operators.get("case_insensitive").apply(retArray[i], currValue) : operators.get("case_sensitive").apply(retArray[i], currValue)) < 0))))) {
				retArray[i + 1] = retArray[i];
				i--;
			}
			retArray[i + 1] = currValue;
		}
		return retArray;
	}
}