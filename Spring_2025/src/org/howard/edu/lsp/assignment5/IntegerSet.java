package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	private List<Integer> set = new ArrayList<Integer>();
		
	public IntegerSet() {
	}

	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
		
	public void clear() {
		set.clear();
	}
		
	public int length() {
		return set.size();
	}
	
	public boolean equals(Object o) {
        if (this == o) return true; 
        if (o == null || getClass() != o.getClass()) return false; 
        IntegerSet otherSet = (IntegerSet) o; 
        return set.containsAll(otherSet.set) && otherSet.set.containsAll(set); 
    }
	public int largest() {
		if (set.isEmpty()) {
			throw new NoSuchElementException("Set is empty.");
		}
		return Collections.max(set);
	}
	
	public int smallest() {
		if (set.isEmpty()) {
			throw new NoSuchElementException("Set is empty.");
		}
		return Collections.min(set);
	}
	
	public void add (int item) {
		if(!set.contains(item)) {
			set.add(item);
		}
	}
	public void remove(int item) {
		set.remove(Integer.valueOf(item));
	}
	
	public void union(IntegerSet intSetb) {
		for (int item : intSetb.set) {
			if (!set.contains(item)) {
				set.add(item);
			}
		}
	}
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}
	
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	}
	
	public void complement(IntegerSet intSetb) {
		List<Integer> complementSet = new ArrayList<>();
		for (int item : intSetb.set) {
			if (!set.contains(item)) {
				complementSet.add(item);
			}
		}
		set = complementSet;
	}
	public boolean isEmpty() {
		return set.isEmpty();
	}
	@Override 
	public String toString() {
		return set.toString();
	}
}
