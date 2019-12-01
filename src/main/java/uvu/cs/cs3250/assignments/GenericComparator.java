package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		//Hint: use instanceof to check the type
		T value1 = obj1;
		T value2 = obj2;

		if ((value1 instanceof String) && (value2 instanceof String)) {
			String str1 = value1.toString().replaceAll("[!.,:;?]", "");
			String str2 = value2.toString().replaceAll("[!.,:;?]", "");
			
			return(!str1.equals(str2));
		}
		
		if((value1 instanceof Long) && (value2 instanceof Long)) {
			return(!value1.equals(value2));
		}
		
		if((value1 instanceof LocalDate) && (value2 instanceof LocalDate)) {
			return(!value1.equals(value2));
		}
		//      "The type is not supported" Exception will be thrown
		throw new Exception("this class is not implemented yet!");
	}
}
