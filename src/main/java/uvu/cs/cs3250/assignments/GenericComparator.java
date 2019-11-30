package uvu.cs.cs3250.assignments;

import java.time.LocalDate;

public interface GenericComparator {
	static <T> boolean isDifferent(T obj1, T obj2) throws Exception 
	{
		
		//Check strings
		if (obj1 instanceof String && obj2 instanceof String)
		{
			//Create string objects and convert them to Char Arrays
			String first = (String) obj1;
			String second = (String) obj2;
			char[] firstChar;
			char[] secondChar;
			firstChar = first.toCharArray();
			secondChar = second.toCharArray();
			
			//Create a CharArray without special characters
			int sizeFirst = firstChar.length;
			int sizeSecond = secondChar.length;
			char[] firstNew = new char[sizeFirst];
			char[] secondNew = new char[sizeSecond];
			int index = 0;
			int newIndex = 0;
			int countFirst = 0;
			int countSecond = 0;
			
			while (index < sizeFirst)
			{
				if ((firstChar[index] > 47 && firstChar[index] < 58) || (firstChar[index] > 64 && firstChar[index] < 91) || (firstChar[index] > 96 && firstChar[index] < 123))
				{
					firstNew[newIndex] = firstChar[index];
					index++;
					countFirst++;
					newIndex++;
				}
				
				else
				{
					index++;
				}
			}
			
			newIndex = 0;
			index = 0;
			
			while (index < sizeSecond)
			{
				if ((secondChar[index] > 47 && secondChar[index] < 58) || (secondChar[index] > 64 && secondChar[index] < 91) || (secondChar[index] > 96 && secondChar[index] < 123))
				{
					secondNew[newIndex] = secondChar[index];
					index++;
					countSecond++;
					newIndex++;
				}
				
				else
				{
					index++;
				}
			}
			
			
			//Compare the newly created CharArrays according to their size to see if they are different.
			boolean different = false;
			
			if (countFirst <= countSecond)
			{
				index = 0;
				while (index < countFirst && different == false)
				{
					if (firstNew[index] == secondNew[index])
					{
						different = false;
					}
					
					else
					{
						different = true;
					}
					index++;
				}
				
			}
			
			else
			{
				index = 0;
				while (index < countSecond && different == false)
				{
					if (firstNew[index] == secondNew[index])
					{
						different = false;
					}
					
					else
					{
						different = true;
					}
					index++;
				}
			}
			
			return different;
		}
		
		//Check longs
		if (obj1 instanceof Long && obj2 instanceof Long)
		{
			if (obj1 == obj2)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		
		//Check local date
		if (obj1 instanceof LocalDate && obj2 instanceof LocalDate)
		{
			return true;
		}
		
		//"The type is not supported" Exception will be thrown
		else
		{
			throw new Exception("this class is not implemented yet!");
		}
	}
}
