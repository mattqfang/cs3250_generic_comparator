package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		//Hint: use instanceof to check the type
		//      "The type is not supported" Exception will be thrown
		if (obj1 instanceof String && obj2 instanceof String) {
			// Strip both strings of punctuation using Regex
			String s1 = obj1.toString().replaceAll("[^a-zA-Z ]", "");
			String s2 = obj2.toString().replaceAll("[^a-zA-Z ]", "");
			if (s1.equals(s2))
				return false;
			else
				return true;
		}
		
		else if ((obj1 instanceof Long && obj2 instanceof Long) ||
				(obj1 instanceof LocalDate && obj2 instanceof LocalDate)) {
			if (obj1.equals(obj2))
				return false;
			
			else
				return true;
		}

		else {
			throw new Exception("The type is not supported");
		}
	}
}
