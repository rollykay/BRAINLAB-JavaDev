package com.calculator.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void verifyCompute() {
		String[] values = {"1", "-2"};
		assertEquals(-1, Engine.compute(values).result);
	}
	
	@Test
	void verifyValidExpression() {
		String[] values = {"a", "1"};
		assertEquals("Please enter a valid expression", Engine.compute(values).result);
	}


}
