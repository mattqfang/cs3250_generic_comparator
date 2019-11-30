package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		//Hint: use instanceof to check the type
		//      "The type is not supported" Exception will be thrown
		if (obj1 instanceof String && obj2 instanceof String) {
			String str1 = (String)obj1;
			String str2 = (String)obj2;
			str1 = str1.replaceAll("\\p{Punct}","");
			str2 = str2.replaceAll("\\p{Punct}","");
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			if (str1.length() != str2.length()) {
				return true;
			}
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					//System.out.println(str1 + " and " + str2 + " are different");
					return true;
				}
			}
			return false;
		}
		
		else if (obj1 instanceof Integer && obj2 instanceof Integer) {
			int a = (Integer)obj1;
			int b = (Integer)obj2;
			if ( a != b) {
				return true;
			}
			else {
				return false;
			}
		}
		
		else if (obj1 instanceof Long && obj2 instanceof Long) {
			Long a = (Long)obj1;
			Long b = (Long)obj2;
			if (a != b) {
				return true;
			}
			else {
				return false;
			}
			
		}
		
		else if (obj1 instanceof LocalDate && obj2 instanceof LocalDate) {
			LocalDate date1 = (LocalDate)obj1;
			LocalDate date2 = (LocalDate)obj2;
			if (date1 != date2) {
				return true;
			}
			else {
				return false;
			}
		}
		
		else {
			throw new Exception("this class is not implemented yet!");
		}
	}
}
