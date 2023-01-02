package com.Calculator.AdditionCalculator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TestingAdditionOperation {
	
	private int num1;
	private int num2;
	private int expectedResult;
	
	


	public TestingAdditionOperation(int num1, int num2, int expectedResult) {
		this.num1 = num1;
		this.num2 = num2;
		this.expectedResult = expectedResult;
	}


	@Parameters
	public static Collection<Integer[]> data(){
		return Arrays.asList(new Integer[][] {{1,2,3}, {2,3,5},{5,10,15}});
	}

	@Test
	public void test() {
		Addition addition = new Addition();
		
		int result =  addition.add(num1,num2);
		
		Assertions.assertEquals(expectedResult,result);
	}

}
