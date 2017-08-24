package org.carlossamuel.practice.euler;

import java.util.ArrayList;
import java.util.List;
/**
 * Project Euler Problem 6
 * @author Carlos Cabral
 *
 */
public class Problem6DifferenceBetweenSumAndSquare {

	public static void main (String [] args) {
		for (int i=100; i <=100;i++) {
			System.out.println("I: " + i);
		    System.out.println("Diffrence: " + difference(i));
		}
	}
	
	public static long difference (int firstThNumbers) {
		long squareSum = 0;
		long sum = 0;
		
		if (firstThNumbers > 0) {
			for (int i = 1; i <= firstThNumbers;i++) {
				sum += i;
				squareSum += (i*i);
			}
		}
		System.out.println("Square sum: " + squareSum);
		System.out.println("Sum square: " + (sum * sum));
		return (sum * sum) - squareSum;
	}
}
