package com.example.rest.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.rest.entity.User;
import com.example.rest.repository.IUserRepository;

public class UserService implements IUserService{
	@Autowired
	IUserRepository repository;
	@Override
	public void createUser(User user) {
		repository.save(user);
	}

}
