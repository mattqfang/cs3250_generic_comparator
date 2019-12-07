package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		//Hint: use instanceof to check the type
		if (obj1 instanceof String && obj2 instanceof String) {
			obj1 = (T) ((String) obj1).replaceAll("[^a-zA-Z]", "");
			obj2 = (T) ((String) obj2).replaceAll("[^a-zA-Z]", "");
			if(obj1.equals(obj2)) {
				return false;
			}
			return true;
		}
		if (obj1 instanceof Long && obj2 instanceof Long) {
			if(obj1.equals(obj2)) {
				return false;
			}
			return true;
		}
		if (obj1 instanceof LocalDate && obj2 instanceof LocalDate) {
			if(obj1.equals(obj2)) {
				return false;
			}
			return true;
		}
		else {
			throw new Exception("This type is not supported");
		}
		
		
	}
}
