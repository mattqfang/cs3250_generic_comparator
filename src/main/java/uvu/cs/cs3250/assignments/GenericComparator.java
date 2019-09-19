package uvu.cs.cs3250.assignments;

// import java.util.LocalDate;
import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		Boolean test = obj1 instanceof Object;
		Boolean test2 = obj1 instanceof Long;
		if (obj1 instanceof String && obj2 instanceof String ) {
			String obj1Clean = ((String) obj1).replaceAll("[^a-z]", "");
			String obj2Clean = ((String) obj2).replaceAll("[^a-z]", "");
			Boolean result = !((String)obj1Clean).equals((String)obj2Clean);
			return result;
		}
		if (obj1 instanceof Long && obj2 instanceof Long ) {
			return !((Long)obj1 > (Long)obj2);
		}
		if (obj1 instanceof LocalDate && obj2 instanceof LocalDate ) {
			Boolean result = !((LocalDate)obj1).equals((LocalDate)obj2);
			return result;
		}
		throw new Exception("This type is not supported!");
	}
}
