package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		if(obj1 instanceof String && obj2 instanceof String) {
			String str1 = ((String)obj1).replaceAll("\\W", "");
			String str2 = ((String)obj2).replaceAll("\\W", "");
			return !str1.equals(str2);
		}
		else if(obj1 instanceof Long && obj2 instanceof Long) {
			return obj1 != obj2;
		}
		else if(obj1 instanceof LocalDate && obj2 instanceof LocalDate) {
			return obj1 != obj2;
		}
		throw new Exception("this class is not implemented yet!");
	}
}
