package org.carlossamuel.practice.euler;

import java.util.ArrayList;
import java.util.List;
/**
 * Project Euler Problem 5
 * @author Carlos Cabral
 *
 */
public class Problem5SmallestPositiveDivisible {

	public static void main (String [] args) {
		System.out.println(smallestDivisible(1, 20));
	}
	
	public static long smallestDivisible (long startRange, long endRange) {
		long smallest = 0;
		if (startRange > 0 && startRange <= endRange) {
			List<Long> dividers = new ArrayList<>();
			for (long i = startRange; i <= endRange; i++) {
				System.out.println("Divider: " + i);
				dividers.add(i);
			}
			//first candidate
			smallest = dividers.get(dividers.size()-1);
			while (!isDivisibleByAll(smallest, dividers)) {
				smallest++;
			}
			
		}
		return smallest;
	}
	
	public static boolean isDivisibleByAll (long number, List<Long> dividers) {
		boolean is = true;
		if (dividers != null && dividers.size() > 0) {
			for (long divider:dividers) {
				if (number % divider != 0) {
					is = false;
					break;
				}
			}
		} else {
			is = false;
		}
		return is;
	}
}
