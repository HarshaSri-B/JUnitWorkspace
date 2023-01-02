package com.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoUtilTest {

	@Test
	void testEqualsAndnotEquals() {
		DemoUtils demoUtils = new DemoUtils();
		
		int expected = 6;
		
		int actual = demoUtils.add(4, 2);
		
		Assertions.assertEquals(expected, actual, "4 + 2 must be 6");
		
	}
	
}
