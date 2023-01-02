package com.example.demo.CrapBook;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ATest {

	@Mock
	 B b;
	
	@InjectMocks
	private A a;
	
	@Test
	void Testng_Class_A() throws Exception{
		
		assertSame(1,a.usesVoidMethod());
		verify(b).voidmethod();

	}
	

}
