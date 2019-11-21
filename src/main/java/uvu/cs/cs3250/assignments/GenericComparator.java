package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception 
	{
		if (!(obj1 instanceof String && obj2 instanceof String))
			if (!(obj1 instanceof Long && obj2 instanceof Long))
				if (!(obj1 instanceof LocalDate && obj2 instanceof LocalDate))
					throw new Exception("Type not supported");
		
		return obj1.toString().replaceAll("[^a-zA-Z0-9]", "").equals(obj2.toString().replaceAll("[^a-zA-Z0-9]", "")) ? false : true;
	}
}
