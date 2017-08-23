package org.carlossamuel.practice.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilsTest {

	@Test
	public void testIsPrime() {
		Assert.assertTrue(MathUtils.isPrime(1l));
		Assert.assertTrue(MathUtils.isPrime(2l));
		Assert.assertTrue(MathUtils.isPrime(3l));
		Assert.assertTrue(MathUtils.isPrime(5l));
		Assert.assertTrue(MathUtils.isPrime(7l));
		Assert.assertTrue(MathUtils.isPrime(11l));
		Assert.assertTrue(MathUtils.isPrime(13l));
		Assert.assertFalse(MathUtils.isPrime(0l));
		Assert.assertFalse(MathUtils.isPrime(4l));
		Assert.assertFalse(MathUtils.isPrime(8l));
		Assert.assertFalse(MathUtils.isPrime(9l));
		Assert.assertFalse(MathUtils.isPrime(10l));
		Assert.assertFalse(MathUtils.isPrime(12l));
	}
	
	@Test
	public void testNextPrime() {
		Assert.assertEquals(0l, MathUtils.nextPrime(-1l));
		Assert.assertEquals(1l, MathUtils.nextPrime(0l));
		Assert.assertEquals(2l, MathUtils.nextPrime(1l));
		Assert.assertEquals(3l, MathUtils.nextPrime(2l));
		Assert.assertEquals(5l, MathUtils.nextPrime(3l));
	}
}
