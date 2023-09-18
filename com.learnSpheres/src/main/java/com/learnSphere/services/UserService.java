package com.learnSphere.services;

import com.learnSphere.entities.Users;

public interface UserService {
	String addUser(Users user);
	Users findUserByEmail(String email);
	
	boolean chechEmail(String email);

	String saveUsers(Users user);
}
