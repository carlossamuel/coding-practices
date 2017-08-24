package org.carlossamuel.practice.euler;

import org.carlossamuel.practice.core.MathUtils;
/**
 * Project Euler Problem 4
 * @author Carlos Cabral
 *
 */
public class Problem4LargestPalindrome {

	public static void main(String [] args) {
		System.out.println(searchForTheLargestPalindrome(3));
		//9009
		//%10
	}
	
	/**
	 * If productDigitNumbers = 2
	 * Then the product is 91*99 = 9009.
	 * 
	 * @param multipliersDigits
	 * @return
	 */
	public static long searchForTheLargestPalindrome(int multipliersDigits) {
		long palindrome = 0;
		if (multipliersDigits > 0) {
			long firstMultiplier = 0;
			long lastMultiplier = 0;
			for (int i = 0; i < multipliersDigits; i++) {
				firstMultiplier = firstMultiplier * 10 + 9;
				lastMultiplier = lastMultiplier * 10 + ( i == 0 ? 1 : 0);
			}
			System.out.println("Biggest Factor: " + firstMultiplier);
			System.out.println("Smaller Factor: " + lastMultiplier);
			long product = 0;
			for (long factor1 = firstMultiplier; factor1 >= lastMultiplier; factor1--) {
				//check if the next calculates number is already smaller than the current palindromic
				if ((factor1 * factor1) > palindrome) {
					for (long factor2= factor1; factor2 >= lastMultiplier; factor2--) {
						product = factor1 * factor2;
						if (MathUtils.isPalindromic(product)) {
							if (product > palindrome) {
							    palindrome = product;
							}
							break;
						} else if (product <= palindrome) {
							break;
						}
					}
				} else {
					break;
				}
			}
			
		}
		return palindrome;
	}
//	
//	public static boolean isPalindromic(long candidate) {
//		long reverse = 0;
//		long clone = candidate;
//		while (clone != 0) {
//			long remainder = clone % 10;
//			reverse = reverse * 10 + remainder;
//			clone = clone / 10;
//		}
//		return reverse == candidate;
//	}
}
