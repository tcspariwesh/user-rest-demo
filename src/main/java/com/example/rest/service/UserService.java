package com.example.rest.service;

import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.NotAddedException;
import com.example.rest.entity.User;
import com.example.rest.repository.IUserRepository;
@Service
public class UserService implements IUserService{
	@Autowired
	IUserRepository repository;
	@Override
	@Transactional(rollbackOn = Exception.class)
	public void createUser(User user)  {
		repository.save(user);
		//Exception -> rollback
		throw new NotAddedException();
//		throw new IOException();
	}

}

