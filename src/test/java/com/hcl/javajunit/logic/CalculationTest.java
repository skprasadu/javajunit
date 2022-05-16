package com.hcl.javajunit.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

//Test Driven Development
public class CalculationTest {
	
	private Calculation calculation;
	
	@Before
	public void setup() {
		calculation = new Calculation();
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int expectedResult = 5;
		int sum = calculation.add(2, 3);
		assertEquals(expectedResult, sum);
	}
	
	@Test
	public void testSubstract() {
		//fail("Not yet implemented");
		int expectedResult = 1;
		int value = calculation.substract(3, 2);
		assertEquals(expectedResult, value);
	}
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int expectedResult = 6;
		int value = calculation.multiply(3, 2);
		assertEquals(expectedResult, value);
	}
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		
		double expectedResult = 1.5;
		double value = calculation.divide(3.0, 2.0);
		assertEquals(expectedResult, value, 0.1);
	}

}
