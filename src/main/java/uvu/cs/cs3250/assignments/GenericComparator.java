package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		if (obj1 instanceof String && obj2 instanceof String) {
			String cleanedObj1 = ((String) obj1).replaceAll("^[a-zA-Z]", "");
			String cleanedObj2 = ((String) obj2).replaceAll("^[a-zA-Z]", "");

			return !(cleanedObj1).equals(cleanedObj2);
		}
		else if((obj1 instanceof Long && obj2 instanceof Long) ||
				(obj1 instanceof LocalDate && obj2 instanceof LocalDate)) {
			return false;
		}

		//Hint: use instanceof to check the type
		//      "The type is not supported" Exception will be thrown
		throw new Exception("Uh-oh, these types aren't supported!");
	}
}
