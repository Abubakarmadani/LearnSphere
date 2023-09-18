package com.learnSphere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entities.Users;
import com.learnSphere.repositories.UserRepository;
@Service
public class UserServiceImplementation implements UserService {
@Autowired
	 UserRepository repo;
	@Override
	public String addUser(Users user) {
		repo.save(user);
		return "User added";
	}
	@Override
	public Users findUserByEmail(String email) {

		return repo.findByEmail(email);
	}
	@Override
	public boolean chechEmail(String email) {

		return repo.existsByEmail(email);
	}
	@Override
	public String saveUsers(Users user) {
repo.save(user);
return "users updated";
	}


}
