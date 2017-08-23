package org.carlossamuel.practice.euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.carlossamuel.practice.core.MathUtils;

/**
 * 
 * Project Euler - exercise 3
 * @author Carlos Cabral
 */
public class LargestPrimeFactor {
  
  public static void main (String [] args) {
	long number = 600851475143l;
	System.out.println("Biggest Factor: " + brutalForce(number));
	System.out.println("Biggest Factor: " + brutalForceImproved(number));
	
	  
  }
  
  public static long brutalForceImproved (long number) {
	  long lastFactor = 1;
	  if (MathUtils.isEven(number)) {
		  lastFactor = 2;
	  } else if (number >0 ) {
		  long factor = 3;
		  long result = number;
		  while (result >= factor) {
			  if (result % factor == 0) {
				  lastFactor = factor;
				  result = result / factor;
			  }
			  factor += 2;
		  }
	  }
	  
	  return lastFactor;
  }
  
  public static long brutalForce (long number) {
	  List<Long> primeFactors = getPrimeFactors(number);
	  Collections.sort(primeFactors);
	  for (long toPrint:primeFactors) {
		  System.out.println("Factor: " + toPrint);
	  }
	  return primeFactors.get(primeFactors.size() -1);
  }
  
  public static List<Long> getPrimeFactors (long number) {
	  List<Long> primeFactors = new ArrayList<>();
	  if (number == 1 || number == 2) {
		  primeFactors.add(number);
	  } else if (number > 2) {
//		  if (MathUtils.isPrime(number)) {
//			  primeFactors.add(number);
//		  } else {
			  long currentResult = number;
			  for (long factorCandidate = 3l; factorCandidate <= currentResult; factorCandidate = MathUtils.nextPrime(factorCandidate)) {
				  System.out.println("Next PRime: " + factorCandidate);
				  if(currentResult % factorCandidate == 0) {
					  primeFactors.add(factorCandidate);
					  currentResult = currentResult / factorCandidate ;
				  }
			  }
//		  }
	  }
	  return primeFactors;
  }
}
