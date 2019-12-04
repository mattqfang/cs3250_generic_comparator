package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		//Hint: use instanceof to check the type		
		if(obj1 instanceof String) {
			if (obj2 instanceof String) {
				String val1 = ((String) obj1).replaceAll("\\P{Alnum}", "").toLowerCase();
				String val2 = ((String) obj2).replaceAll("\\P{Alnum}", "").toLowerCase();
				return (!(val1.contentEquals(val2)));
			}
			else return true;
		}
		
		if(obj1 instanceof Long) {
			if(obj2 instanceof Long) {
				return (!(obj1.equals(obj2)));
			}
			else return true;
		}
		
		if(obj1 instanceof LocalDate)
			if(obj2 instanceof LocalDate) {
				return (!(obj1.equals(obj2)));
			}
			else return true;
			
		throw new Exception("this class is not implemented yet!");
	}	
}
