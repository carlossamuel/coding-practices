package org.carlossamuel.practice.euler;

import org.carlossamuel.practice.core.MathUtils;
/**
 * Project Euler Problem 7
 * @author Carlos Cabral
 *
 */
public class Problem7TenThousandFirstPrime {

	public static void main(String [] args) {
		System.out.println(getPrimeByPosition(10001));
	}
	
	/**
	 * If productDigitNumbers = 2
	 * Then the product is 91*99 = 9009.
	 * 
	 * @param multipliersDigits
	 * @return
	 */
	public static long getPrimeByPosition(int position) {
		long prime = 0;
		if (position == 1) {
			prime = 2;
		} else if (position > 1) {
			int count = 1;
			long candidate = 3;
			while (count < position) {
				if (MathUtils.isPrime(candidate)) {
					count ++;
					prime = candidate;
					System.out.println(count + " - " + prime);
				}
				candidate += 2;
			}
		}
		return prime;
	}
}
