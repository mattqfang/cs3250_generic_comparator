package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		//Hint: use instanceof to check the type
		//      "The type is not supported" Exception will be thrown
		
		//String
	if (obj1 instanceof String){
		String object1 = ((String) obj1).replaceAll("[^a-z]", "");
		String object2 = ((String) obj2).replaceAll("[^a-z]", "");
		
		if(object1.equals(object2)) {
			return false;
		}
		else{
			return true;
		}
	}
		//Long
	else if (obj1 instanceof Long){
		if(obj1.equals(obj2)) {
			return false;
		}
		else{
			return true;
		}
	}
		//Date
	else if(obj1 instanceof LocalDate){
		if(obj1.equals(obj2)) {
			return false;
		}
		else{
			return true;
		}
	}
		throw new Exception("this class is not implemented yet!");
	}
}
