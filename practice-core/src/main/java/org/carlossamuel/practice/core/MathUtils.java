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
}
