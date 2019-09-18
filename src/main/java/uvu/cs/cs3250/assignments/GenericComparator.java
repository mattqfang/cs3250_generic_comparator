package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	public final String REGEX_PUNCTUATION = "[!,.:;?]",
						NO_SPACE = "";
	
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		if(obj1 instanceof LocalDate && obj2 instanceof LocalDate) {
			return !(((LocalDate) obj1).compareTo((LocalDate)obj2) == 0);
		}
		
		if(obj1 instanceof Long && obj2 instanceof Long) {
			return !(((Long) obj1).compareTo((Long)obj2) == 0);
		}
		
		if(obj1 instanceof String && obj2 instanceof String) {
			String s1 = obj1.toString().replaceAll(REGEX_PUNCTUATION, NO_SPACE);
			String s2 = obj2.toString().replaceAll(REGEX_PUNCTUATION, NO_SPACE);
			
			return !(s1.compareTo(s2) == 0);
		}
		
		throw new Exception("this class is not implemented yet!");
	}
}
