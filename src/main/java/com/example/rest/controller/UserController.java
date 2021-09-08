package com.example.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.entity.User;
import com.example.rest.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {//convention over configuration
	@Autowired
	IUserService userService;
	@GetMapping
	String getUser() {
		return "Ram";
	}
	@PostMapping 
	void createUser(@RequestBody User user){
		userService.createUser(user);
		System.out.println(user.getName());
	}
}
