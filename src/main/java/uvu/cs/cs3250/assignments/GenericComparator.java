package uvu.cs.cs3250.assignments;
//class Test<T>
//{
//	T obj;
//	Test(T obj){this.obj = obj;}
//	public T getObject() {return this.obj;}
//}


public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception {
		T val1 = obj1;
		T val2 = obj2;
		if(val2 instanceof val1 == true) {
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
