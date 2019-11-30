package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		if(obj1 instanceof String && obj2 instanceof String){
			String temp1 = ((String) obj1).replaceAll("[^a-zA-Z0-9\\s]","");
			String temp2 = ((String) obj2).replaceAll("[^a-zA-Z0-9\\s]","");
			return !temp1.equals(temp2);
		}
		else if(obj1 instanceof Long && obj2 instanceof Long){
			return !obj1.equals(obj2);
		}
		else if(obj1 instanceof	LocalDate && obj2 instanceof LocalDate){
			return !((LocalDate) obj1).isEqual((LocalDate) obj2);
		}
		else throw new Exception("The type is not supported.");
	}
}
