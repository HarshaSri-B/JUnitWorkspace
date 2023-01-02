package com.example.demo.Greeting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {
	
	Greetings greeting;
	
	@BeforeEach
	public void setup() {
		System.out.println("Setup");
		greeting = new Greetings();
		
	}

	@Test
	public void CheckGreetingMsg() {
		//fail("Not yet implemented");
		System.out.println("CheckGreetingMsg");
		String result = greeting.greet("Harsha");
		
		assertNotNull(result);	
		
		//assertEquals("Hello",result);
		
		
	}
	
	
	@Test
	public void CheckGreetingMsgResult() {
		//fail("Not yet implemented");
		System.out.println("CheckGreetingMsgResult");
		String result = greeting.greet("Harsha");
		
		//assertNotNull(result);	
		
		assertEquals("Hello Harsha, How are you.",result);
		
		
	}
	
	
	
	@Test
	public void CheckIfGreetingMsgIsNull() {
		//fail("Not yet implemented");
		
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			greeting.greet(null);
		});
		
	}
	
	@Test
	public void CheckIfGreetingMsgIsBlank() {
		//fail("Not yet implemented");
		
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			greeting.greet("");
		});
		
	}

	@AfterEach
	public void tearDown() {
		System.out.println("tearDown");
		greeting = null;
	}

}
