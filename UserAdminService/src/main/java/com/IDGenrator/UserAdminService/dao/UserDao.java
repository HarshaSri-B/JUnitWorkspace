package com.IDGenrator.UserAdminService.dao;

import com.IDGenrator.UserAdminService.IDGenerator;
import com.IDGenrator.UserAdminService.dto.User;

public class UserDao {
	public int create(User user) {
		int id = IDGenerator.generateId();
		
		return id;
	}
}
