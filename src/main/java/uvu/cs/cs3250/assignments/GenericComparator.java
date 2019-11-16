package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		if (obj1 instanceof String && obj2 instanceof String) {
			String temp1 = ((String) obj1).replaceAll("[^A-Za-z]", "");
			String temp2 = ((String) obj2).replaceAll("[^A-Za-z]", "");
			return !temp1.equals(temp2);
		} else if (obj1 instanceof Long && obj2 instanceof Long) {
			return !((Long) obj1).equals((Long) obj2);
		} else if (obj1 instanceof LocalDate && obj2 instanceof LocalDate) {
			return ((LocalDate) obj1).compareTo((LocalDate) obj2) != 0;
		}
		throw new Exception("this class is not implemented yet!");
	}
}
