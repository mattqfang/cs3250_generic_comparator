package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		
		if(obj1 instanceof String && obj2 instanceof String) {
			String string1 = ((String) obj1).replaceAll("[^\\p{Alnum}]", "");
			String string2 = ((String) obj2).replaceAll("[^\\p{Alnum}]", "");
			
			if (string1.equalsIgnoreCase(string2)) {
				return false;
			} else {
				return true;
			}
		}
		
		if(obj1 instanceof Long && obj2 instanceof Long) {		
			if (((Long) obj1) == ((Long) obj2)){
				return false;
			} else {
				return true;
			}
		}
		
		if(obj1 instanceof LocalDate && obj2 instanceof LocalDate) {		
			if (((LocalDate) obj1).compareTo((LocalDate) obj2) == 0){
				return false;
			} else {
				return true;
			}
		}
		
		//      "The type is not supported" Exception will be thrown
		throw new Exception("Type not supported or type mismatch!");
	}
}
