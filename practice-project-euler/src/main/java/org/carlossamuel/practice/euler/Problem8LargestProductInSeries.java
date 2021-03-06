package org.carlossamuel.practice.euler;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Project Euler Problem 8
 * @author Carlos Cabral
 *
 */
public class Problem8LargestProductInSeries {

	/**
	 * @param args
	 */
	public static void main(String [] args) {
		String numbers = "73167176531330624919225119674426574742355349194934" + 
				"96983520312774506326239578318016984801869478851843" + 
				"85861560789112949495459501737958331952853208805511" + 
				"12540698747158523863050715693290963295227443043557" + 
				"66896648950445244523161731856403098711121722383113" + 
				"62229893423380308135336276614282806444486645238749" + 
				"30358907296290491560440772390713810515859307960866" + 
				"70172427121883998797908792274921901699720888093776" + 
				"65727333001053367881220235421809751254540594752243" + 
				"52584907711670556013604839586446706324415722155397" + 
				"53697817977846174064955149290862569321978468622482" + 
				"83972241375657056057490261407972968652414535100474" + 
				"82166370484403199890008895243450658541227588666881" + 
				"16427171479924442928230863465674813919123162824586" + 
				"17866458359124566529476545682848912883142607690042" + 
				"24219022671055626321111109370544217506941658960408" + 
				"07198403850962455444362981230987879927244284909188" + 
				"84580156166097919133875499200524063689912560717606" + 
				"05886116467109405077541002256983155200055935729725" + 
				"71636269561882670428252483600823257530420752963450";
	    Integer [] products = getPrimeByPosition(numbers, 13);
		for (int product:products) {
			System.out.print(product);
		}
		System.out.println(": " + calculateProduct(Arrays.asList(products)));
	}
	
	/**
	 * If productDigitNumbers = 2
	 * Then the product is 91*99 = 9009.
	 * 
	 * @param multipliersDigits
	 * @return
	 */
	public static Integer[] getPrimeByPosition(String numbers, int adjacentsDigits) {
		Integer [] result = new Integer [adjacentsDigits];  
		if (numbers != null && !numbers.isEmpty() && numbers.length() >= adjacentsDigits) {
			Matcher match = Pattern.compile("[0-9]{1}").matcher(numbers);
			LinkedList<Integer> products = new LinkedList<>();
			long biggestProduct = 0;
			while (match.find()) {
				int currentProduct = Integer.parseInt(match.group());
				products.addLast(currentProduct);
				if (products.size() > adjacentsDigits) {
					products.removeFirst();					
				}
				//While it does not have enought numbers of digits
				if (products.size() == adjacentsDigits) {
					long temporaryAmount = calculateProduct(products);
					if (temporaryAmount > biggestProduct) {
						System.out.println("Candidates: " + temporaryAmount);
						biggestProduct = temporaryAmount;
					    result = toArray(products);
					}
				}
			}
		}
		
		return result;
	}
	
	private static long calculateProduct(List<Integer> products) {
		long amount = 1;
		for (Integer product:products) {
			amount *= product;
		}
		return amount;
	}
	
	private static Integer [] toArray(List<Integer> products) {
		Integer [] arrayProducts = new Integer [products.size()];
		int count = 0;
		for (Integer product:products) {
			arrayProducts[count++] = product;
		}
		return arrayProducts;
	}
}
