package org.howard.edu.lsp.assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/** IntegerSet class represents a set of integers and calculates several operations 
 * 
 */

public class IntegerSet {

	/** Main class for IntegerSet
	 * 
	 * @param args main class for IntegerSet
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	 
	/** List that stores integers in a set 
	 * 
	 */
	
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Constructor that creates an empty IntegerSet
	 */
		
	public IntegerSet() {
	}
	
	/** Constructor that intializes the IntegerSet with specific list of integers
	 * 
	 * @param set the list of integers to initialize the set with.
	 */

	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	
	/** clears a set 
	 * 
	 */
	
	public void clear() {
		set.clear();
	}
	
	/** returns the length of a set
	 * 	
	 * @return how many elements in the set. 
	 */
	
	public int length() {
		return set.size();
	}
	
	/** a boolean to compare IntegerSet with the object o. Its true if they have the same elements. False if not
	 * @param o the object to compare
	 * @return true if the sets have the same elements. False if not.
	 */
	
	public boolean equals(Object o) {
        if (this == o) return true; 
        if (o == null || getClass() != o.getClass()) return false; 
        IntegerSet otherSet = (IntegerSet) o; 
        return set.containsAll(otherSet.set) && otherSet.set.containsAll(set); 
    }
	
	/** returns the largest elements in a set. If the set is empty it gives an error that tells the user.
	 * 
	 * @return the largest element in set 
	 * @throws NoSuchElementException for an empty set
	 */
	
	public int largest() {
		if (set.isEmpty()) {
			throw new NoSuchElementException("Set is empty.");
		}
		return Collections.max(set);
	}
	
	/** 
	 * Returns the smallest element in the set. 
	 * @return the smallest element in the set. 
	 * @throws NoSuchElementException if the set is empty 
	 */
	
	public int smallest() {
		if (set.isEmpty()) {
			throw new NoSuchElementException("Set is empty.");
		}
		return Collections.min(set);
	}
	
	/** Checks to see if a particular item is already in the set. Adds it in if it's not already in the set. 
	 * 
	 * @param item the integer to add to the set.
	 */
	
	public void add (int item) {
		if(!set.contains(item)) {
			set.add(item);
		}
	}
	
	/** Removes the value of an item in the set
	 * 
	 * @param item the integer to remove from the set. 
	 */
	
	public void remove(int item) {
		set.remove(Integer.valueOf(item));
	}
	
	/** Creates a union between IntegerSet and intSetb
	 * Adds unique elements from IntegerSet into this set 
	 * Checks to see if a specific item is not in set and adds it in if so.
	 * 
	 * @param intSetb the IntegerSet to union with. 
	 */
	
	public void union(IntegerSet intSetb) {
		for (int item : intSetb.set) {
			if (!set.contains(item)) {
				set.add(item);
			}
		}
	}
	
	/** Intersection between IntegerSet and intSetb
	 * After calling this method, the current set will contain only the elements 
	 * that are present in both the current set and the provided IntegerSet.
	 * @param intSetb the IntegerSet to calculate intersection
	 */
	
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}
	
	/** Set difference operation 
	 * The current set will have the elements that are unique to it and not in IntegerSet
	 * @param intSetb the IntegerSet to compute the difference with. 
	 */
	
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	}
	
	/** Set complement 
	 * Current set has the elements that are in IntegerSet but not current set 
	 * @param intSetb the IntegerSet to calculate complement. 
	 */
	
	public void complement(IntegerSet intSetb) {
		List<Integer> complementSet = new ArrayList<>();
		for (int item : intSetb.set) {
			if (!set.contains(item)) {
				complementSet.add(item);
			}
		}
		set = complementSet;
	}
	
	/** Boolean to see if the set is empty 
	 * 
	 * @return true if the set is empty, if not returns false. 
	 */
	
	public boolean isEmpty() {
		return set.isEmpty();
	}
	
	/** 
	 * @return the method as a string 
	 */
	
	@Override 
	public String toString() {
		return set.toString();
	}
	
	public boolean contains(int value) {
		return set.contains(value);
	}
}

/* reference links
 * https://www.geeksforgeeks.org/arraylist-clear-method-in-java-with-examples/
 * we3dshools.com 
 * https://medium.com/@AlexanderObregon/javas-objects-equals-method-explained-3a84c963edfa
 * chat gpt
 * https://stackoverflow.com/questions/3590677/how-to-do-union-intersect-difference-and-reverse-data-in-java
 *
 * */
