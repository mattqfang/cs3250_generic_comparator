package uvu.cs.cs3250.assignments;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		String obj1String = obj1.toString();
		String obj2String = obj2.toString();
		if ((obj1 instanceof String) &&(obj2 instanceof String)) {
			obj1String = obj1String.replaceAll("[^a-zA-Z0-9]", "");
			obj2String = obj2String.replaceAll("[^a-zA-Z0-9]", "");
			if (!obj1String.contentEquals(obj2String)) {
				return true;
			}
			return false;
		}
		if ((obj1 instanceof Long) &&(obj2 instanceof Long)) {
			if (!obj1.equals(obj2)) {
				return true;
			}
			return false;
		}
		if ((obj1.toString().substring(4,5)).equals("-") && (obj2.toString().substring(4,5)).equals("-")) {
			if (!obj1.equals(obj2)) {
				return true;
			}
			return false;
		}
		//Hint: use instanceof to check the type
		//      "The type is not supported" Exception will be thrown
		throw new Exception("The type is not supported.");
	}
}
