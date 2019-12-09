package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {

		// check for strings first
		if (obj1 instanceof String && obj2 instanceof String) {
			// convert T object to String and use regex to remove anything that is not a char
			String s1 = obj1.toString().replaceAll("[^a-zA-Z ]", "");
			String s2 = obj2.toString().replaceAll("[^a-zA-Z ]", "");

			// return true if the two objects are different
			return !s1.equals(s2);
		}

		// check for  either 2 instances of Longs or 2 LocalDates
		else if ((obj1 instanceof Long && obj2 instanceof Long) || (obj1 instanceof LocalDate && obj2 instanceof LocalDate))
			return !obj1.equals(obj2);

		// type is not supported, we throw exception
		else
			throw new Exception("The type is not supported");
	}
}
