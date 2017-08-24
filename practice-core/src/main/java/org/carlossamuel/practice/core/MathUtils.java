package org.carlossamuel.practice.core;


public class MathUtils {

	public static boolean isEven(long number) {
	  return  number % 2l == 0;
	}
	
	public static boolean isPrime(long number) {
		boolean is = false;
		if (number > 0) {
			if (number == 1 || number == 2) {
				is = true;
			} else if (!isEven(number)){
				boolean hasFactor = false;
				for (int factor = 3; factor <= number/3; factor++) {
					if (number % factor ==0) {
						hasFactor = true;
						break;
					}
				}
				is = !hasFactor;
			}
		}
		return is;
	}
	
	/**
	 * Prime is a number that can be divided by 1 and itself.
	 * 
	 * @param number
	 * @return
	 */
	public static long nextPrime(long number) {
		long next = 0;
		if (number >= 0) {
			next = number;
			do {
				next++;
			} while(!isPrime(next));

		}
		return next;
		
	}
	
	/**
	 * Palindromic is a number that can be read equally in both direction
	 * 11, 22, 33, 44, 55, 66, 77, 88, 99
	 * 101, 111, 202 ... 999
	 * It is using module but we can also use StringBuilder.reverse
	 * 
	 * @param candidate
	 * @return
	 */
	public static boolean isPalindromic(long candidate) {
		return candidate == reverse(candidate);
	}
	
	public static long reverse(long candidate) {
		long reverse = 0;
		long clone = candidate;
		while (clone != 0) {
			long remainder = clone % 10;
			reverse = reverse * 10 + remainder;
			clone = clone / 10;
		}
		return reverse;
	}
}
