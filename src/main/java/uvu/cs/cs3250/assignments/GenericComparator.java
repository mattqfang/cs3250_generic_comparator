package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		//Hint: use instanceof to check the type
		//      "The type is not supported" Exception will be thrown
		if (obj1 instanceof String) {
			String formatString1;
			String formatString2;
			
			formatString1 = ((String) obj1).replaceAll("[^a-zA-Z]", "");
			formatString2 = ((String) obj2).replaceAll("[^a-zA-Z]", "");
			
			if (formatString1.equals(formatString2)) {
				return false;
			}
			else {
				return true;
			}
			
		}
		else if (obj1 instanceof Long) {
			Long longNum1 = (Long)obj1;
			Long longNum2 = (Long)obj2;
			
			if (longNum1.equals(longNum2)) {
				return false;
			}
			else {
				return true;
			}
		}
		else if (obj1 instanceof LocalDate) {
			LocalDate date1 = (LocalDate) obj1;
			LocalDate date2 = (LocalDate) obj2;
			
			if (date1.equals(date2)) {
				return false;
			}
			else {
				return true;
			}
		}
		else {
			throw new Exception("this class is not implemented yet!");
		}
	}
}
