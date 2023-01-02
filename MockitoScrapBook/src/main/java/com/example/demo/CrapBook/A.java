package com.example.demo.CrapBook;

public class A {
	
	private B b;
	
	public A(B b) {
		this.b = b;
	}
	
	public int usesVoidMethod() {
		
		try {
			b.voidmethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			new RuntimeException(e);
		}
		return 1;
	}
}
