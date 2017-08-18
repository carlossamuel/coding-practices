package org.carlossamuel.practice.euler;

import org.carlossamuel.practice.core.MathUtils;

public class EvenFibonacci {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(brutalForce(4000000));
		System.out.println("Time: " + (System.currentTimeMillis() - start));
		start = System.currentTimeMillis();
		System.out.println(brutalForceImproved(4000000));
		System.out.println("Time: " + (System.currentTimeMillis() - start));
	}

	private static long brutalForce(long limit) {
		int totalEven = 0;
		long previous = 1l;
		long current = 1l;
		long next = 0;
		while (current <= limit) {
			System.out.println("Current: " + current);
			if (MathUtils.isEven(current)) {
				System.out.println("Even: " + current);
				totalEven += current;
			}
			next = previous + current;
			previous = current;
			current = next;
		}
		System.out.println("Total Even: " + totalEven);
		return totalEven;
	}
	
	/**
	 * Every third element is even
	 * @param limit
	 * @return
	 */
	private static long brutalForceImproved(long limit) {
		int totalEven = 0;
		long previous = 1l;
		long current = 2l;
		long next = 0;
		while (current <= limit) {
			System.out.println("Current: " + current);
			totalEven += current;
			//First
			next = previous + current;
			previous = current;
			current = next;
			//SEcond
			next = previous + current;
			previous = current;
			current = next;
			//Third
			next = previous + current;
			previous = current;
			current = next;
		}
		System.out.println("Total Even: " + totalEven);
		return totalEven;
	}
}
