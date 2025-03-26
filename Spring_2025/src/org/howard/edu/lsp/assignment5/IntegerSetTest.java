package org.howard.edu.lsp.assignment5;

/**
 * Tests the IntegerSet class
 * Calculates intersection, complement, union and difference with two IntegerSet instances
 * Also assesses smallest and largest and an empty set 
 */
public class IntegerSetTest {
	
	/** Main class for driver class. Declares two instances of IntegerSet for union, intersection, and other operations 
	 * 
	 * @param args Command-line arguments (not used in test) 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** Creates IntegerSet instances set1
		 * 
		 */
		
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		/** Prints out the value of Set1
		 * 
		 */
		
		System.out.println("Value of Set1 is: " + set1.toString());
		
		/** Prints the smallest and largest values in Set1
		 * 
		 */
		
		System.out.println("Smallest value in Set1: " + set1.smallest());
		System.out.println("Largest value in Set1: " + set1.largest());
		
		/** Makes set2 
		 * 
		 */
		
		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		/** Prints value, calculates the union between set1 and set2 and prints it.
		 * 
		 */
		
		System.out.println("Value of Set2 is: " + set2.toString());
		
		System.out.println("Union of Set1 and Set2");
		set1.union(set2);
		System.out.println("Result of union of Set1 and Set2: " + set1.toString());
		
		/** Re-makes set1 and set2 for next operation
		 * 
		 */
		
		set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		/** Calculates and prints out the Intersection of set1 and set2
		 * 
		 */
		
		System.out.println("Intersection of Set1 and Set2");
		set1.intersect(set2);
		System.out.println("Result of intersection of Set1 and Set2: " + set1.toString());
		
		/** Makes another set1 and set2 to find the difference
		 * 
		 */
		
		set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		/** Calculates and prints the difference in set1 and set2
		 * 
		 */
		
		System.out.println("Difference of Set1 and Set2");
		set1.diff(set2);
		System.out.println("Result of difference (Set1 - Sect2): " +set1.toString());
		
		/** Makes another set1 and set2 to find the complement 
		 * 
		 */
		
		set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		/** Calculates and prints the complement of set1 and set2 
		 * 
		 */
		
		System.out.println("Complement of Set1 and Set2");
		set1.complement(set2);
		System.out.println("Result of complement: " + set1.toString());
		
		/** Calculates if set1 is empty
		 * clears set1 and prints the answer
		 */
		
		System.out.println("Is Set1 empty? " + set1.isEmpty());
		set1.clear();
		System.out.println("After clearing, is Set1 empty? " + set1.isEmpty());

	}
	


}
/* Code referenced by https://www.w3schools.com/java/java_ref_arraylist.asp,
 * chat gpt,
 * 
 */
