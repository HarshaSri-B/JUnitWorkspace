package com.example.demo.Greeting;

public class Greetings {
	
	public String greet(String name) {
		
		if(name == null) throw new IllegalArgumentException();
		
		if(name == "") throw new IllegalArgumentException();
		
		return "Hello " + name +", How are you.";
	}
}
