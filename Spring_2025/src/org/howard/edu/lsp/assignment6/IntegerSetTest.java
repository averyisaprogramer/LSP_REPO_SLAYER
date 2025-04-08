package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.NoSuchElementException;

public class IntegerSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	@Test
	@DisplayName("Test case for clear method")
	public void testClear() {
		IntegerSet set = new IntegerSet();
		set.add(1);
		set.add(2);
		set.clear();
		assertTrue(set.isEmpty(), "Set should be empty after clear.");
	}
	
	@Test
	@DisplayName("Test case for length method")
	public void testLength() {
		IntegerSet set = new IntegerSet();
		set.add(1);
		set.add(2);
		assertEquals(2, set.length(), "Length should be 2.");
		set.clear();
		assertEquals(0, set.length(), "Length should be 0 after clear.");
}
	
	@Test
	@DisplayName("Test case for equals method")
	public void testEquals() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set2.add(1);
		set2.add(2);
		
		assertTrue(set1.equals(set2), "Sets should be equal.");
		
		set2.add(3);
		assertFalse(set1.equals(set2), "Sets shouldn't be equal.");
	}
	
	@Test
	@DisplayName("Test case for largest method")
	public void testLargest() {
		IntegerSet set = new IntegerSet();
		set.add(1);
		set.add(5);
		set.add(3);
		
		assertEquals(5, set.largest(), "Largest value should be 5.");
		set.clear();
		assertThrows(NoSuchElementException.class, () -> set.largest(), "Should throw NoSuchElementException when the set is empty.");
	}
	
	@Test
	@DisplayName("Test case for smallest method")
	public void testSmallest() {
		IntegerSet set = new IntegerSet();
		set.add(1);
		set.add(5);
		set.add(3);
		
		assertEquals(1, set.smallest(), "Smallest value should be 1.");
		set.clear();
		assertThrows(NoSuchElementException.class, () -> set.smallest(), "Should throw NoSuchElementException when the set is empty.");
	}
	
	@Test
	@DisplayName("Test case for add method")
	public void testAdd() {
		IntegerSet set = new IntegerSet();
		set.add(1);
		set.add(2);
		set.add(2);
		
		assertEquals(2, set.length(), "Set should have 2 elements");
	}
	
	@Test
	@DisplayName("Test case for remove method")
	public void testRemove() {
		IntegerSet set = new IntegerSet();
		set.add(1);
		set.add(2);
		set.remove(1);
		
		assertFalse(set.contains(1), "Set should not contain 1 after removal.");
		assertEquals(1, set.length(), "Set should have 1 element after removing 1.");
	}
	
	@Test
	@DisplayName("Test case for union method")
	public void testUnion() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		
		set2.add(2);
		set2.add(3);
		
		set1.union(set2);

		IntegerSet expectedSet = new IntegerSet();
		expectedSet.add(1);
		expectedSet.add(2);
		expectedSet.add(3);
		
		assertTrue(set1.contains(1), "Set 1 should have 1.");
		assertTrue(set1.contains(2), "Set 1 should have 2.");
		assertTrue(set1.contains(3), "Set 1 should have 3.");
		
		assertEquals(expectedSet.toString(), set1.toString(), "Union operation failed.");
	}
	
	@Test
	@DisplayName("Test case for intersect method")
	public void testIntersect() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		set1.intersect(set2);
		
		IntegerSet expectedSet = new IntegerSet();
		expectedSet.add(2);
		expectedSet.add(3);
		
		assertTrue(set1.contains(2), "Set 1 should have 2 in it.");
		assertTrue(set1.contains(3), "Set 1 should have 3 in it.");
		
		assertFalse(set1.contains(1), "Set 1 should not have 1 in it.");
		assertFalse(set1.contains(4), "Set 1 should not have 4 in it.");
		
		assertEquals(expectedSet.toString(), set1.toString(), "Intersection operation failed.");
	}
	
	@Test
	@DisplayName("Test case for difference method")
	public void testDifference() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		set1.diff(set2);
		
		assertTrue(set1.contains(1), "Set 1 should have 1 in it.");
		assertTrue(set2.contains(2), "Set 1 should have 2 in it.");
		
		assertFalse(set1.contains(3), "Set 1 should not have 3 in it");
		assertFalse(set1.contains(4), "Set 1 should not have 4 in it after difference.");
		
		IntegerSet expectedSet = new IntegerSet();
		expectedSet.add(1);
		assertEquals(expectedSet.toString(), set1.toString(), "Difference operation failed.");
	}
	
	@Test
	@DisplayName("Test case for complement method")
	public void testComplement() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		set1.complement(set2);
		
		assertTrue(set1.contains(4), "Set 1 should have 4.");
		assertTrue(set1.contains(5), "Set 1 should haev 5.");
		
		assertFalse(set1.contains(1), "Set 1 should not have 1.");
		assertFalse(set1.contains(2), "Set 1 should not have 2.");
		assertFalse(set1.contains(3), "Set 2 should not have 3.");
		
		IntegerSet expectedSet = new IntegerSet();
		expectedSet.add(4);
		expectedSet.add(5);
		
		assertEquals(expectedSet.toString(), set1.toString(), "Complement opertion failed.");
	}
	
	@Test
	@DisplayName("Test case for isEmpty Method")
	public void testIsEmpty() {
		IntegerSet set = new IntegerSet();
		assertTrue(set.isEmpty(), "Set should be empty right now.");
		
		set.add(1);
		assertFalse(set.isEmpty(), "Set should not be empty because we added 1");
	}
	
	@Test
	@DisplayName("Test case for toString method")
	public void testToString() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		assertEquals("[1, 2]", set1.toString(), "toString() should return the correct string representation.");
	}
}


/* code sources from chat gpt, geeksforgeeks, and stackoverflow
 */
