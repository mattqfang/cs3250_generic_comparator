package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		//Hint: use instanceof to check the type
		//      "The type is not supported" Exception will be thrown
		
		if (obj1 instanceof String && obj2 instanceof String) {
			String str1 = obj1.toString();
			String str2 = obj2.toString();
			
			str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
			str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
			
			if (str1.equals(str2)) {
				return false;
			}
			else {
				return true;
			}
		}
		
		else if (obj1 instanceof Long && obj2 instanceof Long) {
			if (obj1 == obj2) {
				return false;
			}
			else {
				return true;
			}
		}
		
		else if (obj1 instanceof LocalDate && obj2 instanceof LocalDate) {
			if (obj1.equals(obj2)) {
				return false;
			}
			else {
				return true;
			}
		}
		
		throw new Exception("Unsupported Types!");
	}
}
