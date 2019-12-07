package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		//Hint: use instanceof to check the type
		//      "The type is not supported" Exception will be thrown
		if (obj1 instanceof String) {
			String compare1 = (String) obj1;
			String compare2 = (String) obj2;
			compare1 = compare1.replace(",", " ")
					.replace("!", " ")
					.strip();
			compare2 = compare2.replace(",", " ")
					.replace("!", " ")
					.strip();
			return compare1.contentEquals(compare2);
					
		}
		if (obj1 instanceof Long) {
			return obj1.equals(obj2);		
		}
		if (obj1 instanceof LocalDate) {
			return obj1.equals(obj2);		
		}
		throw new Exception("this class is not implemented yet!");
	}
}
