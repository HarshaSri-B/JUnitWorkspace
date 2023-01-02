package com.IDGenrator.UserAdminService.dao;

import static org.junit.Assert.*;

import static org.powermock.api.mockito.PowerMockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.IDGenrator.UserAdminService.IDGenerator;
import com.IDGenrator.UserAdminService.dto.User;

@RunWith(PowerMockRunner.class)
@PrepareForTest(IDGenerator.class)
public class TestingIDGenerator {

	@Test
	public void IDGeneratorTesting() {
		UserDao dao = new UserDao();
		
		mockStatic(IDGenerator.class);
		
		when(IDGenerator.generateId()).thenReturn(1);
		int result = dao.create(new User());
		assertEquals(1,result);
		
		
		
	}

}
