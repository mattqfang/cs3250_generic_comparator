package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		if (obj1 instanceof String && obj2 instanceof String) {
			String str1 = ((String) obj1).replaceAll("[^a-zA-Z0-9]", "");
			String str2 = ((String) obj2).replaceAll("[^a-zA-Z0-9]", "");

			if (str1.equals(str2)) return false;
			return true;
		}
		else if (obj1 instanceof Long && obj2 instanceof Long) {
			if (obj1.equals(obj2)) return false;
			return true;
		}
		else if (obj1 instanceof LocalDate&& obj2 instanceof LocalDate) {
			if (obj1.equals(obj2)) return false;
			return true;
		}
		//Hint: use instanceof to check the type
		//      "The type is not supported" Exception will be thrown
		throw new Exception("The type is not supported");
	}
}
