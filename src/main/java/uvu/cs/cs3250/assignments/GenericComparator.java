package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		//Hint: use instanceof to check the type
		//      "The type is not supported" Exception will be thrown
		if(obj1 instanceof String && obj2 instanceof String) {
			String text1 = obj1.toString();
			text1 = text1.replaceAll("[^a-zA-Z0-9]", "");
			String text2 = obj2.toString();
			text2 = text2.replaceAll("[^a-zA-Z0-9]", "");
			//System.out.println(text1);
			//System.out.println(text2);
			if(text1.equals(text2)) {
				return false;
			}
			else {
				return true;
			}
		}
		else if(obj1 instanceof LocalDate && obj2 instanceof LocalDate) {
			if(obj1.equals(obj2)) {
				return false;
			}
			else {
				return true;
			}
		}
		else if(obj1 instanceof Long && obj2 instanceof Long) {
			if(obj1.equals(obj2)) {
				return false;
			}
			else {
				return true;
			}
		}
		throw new Exception("this class is not implemented yet!");
	}
}
