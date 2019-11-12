package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		//Hint: use instanceof to check the type
		//      "The type is not supported" Exception will be thrown
		String word1, word2;
		
				
		if(obj1 instanceof String && obj2 instanceof String) {			
			//cast into string types, get rid of punctuation then !.equals()
			word1 = ((String)obj1).replaceAll("[.,!?\\-]", "");
			word2 = ((String)obj2).replaceAll("[.,!?\\-]", "");
			return !word1.equalsIgnoreCase(word2);
		}
		else if(obj1 instanceof Long && obj2 instanceof Long) {
			return obj1 != obj2;
		}
		else if(obj1 instanceof LocalDate && obj2 instanceof LocalDate) {
			return obj1 != obj2;
		}
		else {
			throw new Exception("Variables are of non-acceptable instances");
		}
	}
}