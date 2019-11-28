/*
Please complete the static method in GenericComparator:

1. compare two "String"s: when these two strings, excluding punctuation (!,.:;?),are the different, return true, otherwise, return false.

2. compare two "Long" numbers: when the two numbers are different, return true, otherwise, return false.

3. compare two LocalDate objects: when two objects are different, return true, otherwise, return false.

If passed-in objects are different type than "String", "Long", and "LocalDate", throw an exception.

Repo URL: https://github.com/mattqfang/cs3250_generic_comparator.git
*/

package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		if (obj1 instanceof String && obj2 instanceof String) { 
			// replace all ',' and '!' with ""
			String first = String.valueOf(obj1).replaceAll(",*!*", "");
			String second = String.valueOf(obj2).replaceAll(",*!*", "");
			return !first.equalsIgnoreCase(second);
		} else if (obj1 instanceof Long && obj2 instanceof Long) {
			return obj1 != obj2;
		} else if (obj1 instanceof LocalDate && obj2 instanceof LocalDate) {
			return obj1 != obj2;
		}
		else throw new Exception("this class is not implemented yet!");
	}
}
