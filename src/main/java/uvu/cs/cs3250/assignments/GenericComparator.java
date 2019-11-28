package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		
		if ((!(obj1 instanceof String) && !(obj2 instanceof String)) &&
				(!(obj1 instanceof Long) && !(obj2 instanceof Long)) &&
				(!(obj1 instanceof LocalDate) && !(obj2 instanceof LocalDate))) {
			//Hint: use instanceof to check the type
			//      "The type is not supported" Exception will be thrown
			throw new Exception("this class is not implemented yet!");
		}
		
		else {
			if ((obj1 instanceof String) && (obj2 instanceof String)) {
				String puncPattern = "[!,.:;?]";
				String firstString = obj1.toString().replaceAll(puncPattern, "");
				String secondString = obj2.toString().replaceAll(puncPattern, "");
				
				obj1 = (T) firstString;
				obj2 = (T) secondString;
				
			}
			
			if (!obj1.equals(obj2)) {
				return true;
			}
			
			else {
				return false;
			}
		}
		
	}
}
