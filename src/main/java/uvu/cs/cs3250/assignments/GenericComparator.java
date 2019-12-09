package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		if(obj1 instanceof String) {
			String s1 = ignorePunct((String) obj1);
			String s2 = ignorePunct((String) obj2);
			return !s1.equalsIgnoreCase(s2);
		}
		else if(obj1 instanceof Long) {
			Long l1 = (Long) obj1;
			Long l2 = (Long) obj2;
			return !l1.equals(l2);
		}
		else if(obj1 instanceof LocalDate) {
			LocalDate d1 = (LocalDate) obj1;
			LocalDate d2 = (LocalDate) obj2;
			return !d1.equals(d2);
		}
		else {
			throw new Exception("Umm... I don't know what to do with that.");
		}
	}
	
	static String ignorePunct(String s) {
		String temp = "";
		for(int i=0; i<s.length(); i++) {
			if(Character.isLetter(s.charAt(i))){
				temp =  temp + s.charAt(i);
			}
		}
		return temp;
	}
}