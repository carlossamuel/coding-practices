package org.carlossamuel.practice.euler;

/**
 * 
 * Project Euler - exercise 1
 * @author Carlos Cabral
 */
public class MultiplesOf3And5 {
  
  public static void main (String [] args) {
	int total = 0;
	for (int i = 3; i < 1000; i++ ) {
	  if (i % 3 == 0 || i % 5 == 0) {
		System.out.println(i);
		total += i;
	  }
	}
	System.out.println(total);
  }
}
