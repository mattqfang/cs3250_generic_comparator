package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

//class Test<T>
//{
//	T obj;
//	Test(T obj){this.obj = obj;}
//	public T getObject() {return this.obj;}
//}


public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		if(obj2 instanceof String && obj1 instanceof String) {
			String s1,s2;
			s1 = (String) obj1;
			s2 = (String) obj2;
			
			s1 =s1.replaceAll("[^a-zA-Z0-9_-]", "");
			s2 = s2.replaceAll("[^a-zA-Z0-9_-]", "");
			
			
			if(s1.compareTo(s2) == 0) {
				return false;
			}
			
			else return true;
			
		}
		else if(obj2 instanceof Long && obj1 instanceof Long) {
			if(obj1==obj2) {
				return false;
			}
			else return true;
			
		}
		else if(obj2 instanceof LocalDate && obj1 instanceof LocalDate) {
			if(obj1==obj2) {
				return false;
			}
			else return true;
			
		}
		//Hint: use instanceof to check the type
		//      "The type is not supported" Exception will be thrown
		else {
		throw new Exception("The type is not supported");
		}
	}
}
