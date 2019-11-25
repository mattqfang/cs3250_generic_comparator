package uvu.cs.cs3250.assignments;

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
		
		
		//Hint: use instanceof to check the type
		//      "The type is not supported" Exception will be thrown
		throw new Exception("Type not supported or type mismatch!");
	}
}
