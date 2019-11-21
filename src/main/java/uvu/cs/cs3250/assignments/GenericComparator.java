package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		//Hint: use instanceof to check the type
		//      "The type is not supported" Exception will be thrown
		System.out.println(obj1.getClass().getName());
		if (obj1 instanceof String && obj2 instanceof String) {
			return isDifferentString((String) obj1, (String) obj2);
		}
		if (obj1 instanceof Long && obj2 instanceof Long) {
			return (Long) obj1 != (Long) obj2;
		}
		if (obj1 instanceof LocalDate && obj2 instanceof LocalDate) {
			return ((LocalDate) obj1).equals((LocalDate) obj2) == false;
		}

		throw new Exception("Parameter objects are not supported!");
	}
	
	static boolean isDifferentString(String obj1, String obj2) {
		obj1 = obj1.replaceAll("[^a-zA-Z0-9]", "");
		obj2 = obj2.replaceAll("[^a-zA-Z0-9]", "");
		return obj1.equals(obj2) == false;
	}
}
