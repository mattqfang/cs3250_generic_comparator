package uvu.cs.cs3250.assignments;
import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		if (!(obj1 instanceof String || obj1 instanceof Long || obj1 instanceof LocalDate)) {
			throw new Exception("Unsupported type");
		}
		if (obj1 instanceof String && obj2 instanceof String) {
			String string1 = (String) obj1;
			String string2 = (String) obj2;
			obj1 = (T) string1.replaceAll("[^a-zA-Z0-9]", "");
			obj2 = (T) string2.replaceAll("[^a-zA-Z0-9]", "");
		}
		return !obj1.equals(obj2);
	}
}
