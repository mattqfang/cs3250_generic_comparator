package uvu.cs.cs3250.assignments;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

public class GenericComparatorTest {
	
	@Test
	public void testIsDifferentString_True_NoSpecialChar() throws Exception {
		assertTrue(GenericComparator.isDifferent("hello", "world"));
	}
	
	@Test
	public void testIsDifferentString_False_SpecialChar() throws Exception {
		assertFalse(GenericComparator.isDifferent("hello, world", "hello world!"));
	}
	
	@Test
	public void testIsDifferentLong_True() throws Exception {
		assertTrue(GenericComparator.isDifferent(3L, 13L));
	}
	
	@Test
	public void testIsDifferentLocalDate_True() throws Exception {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = date1.plusDays(3);
		assertTrue(GenericComparator.isDifferent(date1, date2));
	}
	
	@Test(expected = Exception.class)
	public void testIsDifferentNotSupportType() throws Exception {
		GenericComparator.isDifferent(BigDecimal.ONE, BigDecimal.TEN);
	}
}
