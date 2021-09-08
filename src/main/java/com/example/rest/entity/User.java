package com.example.rest.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;

@Getter
public class User {
	String name;
	@Id
	@GeneratedValue
	Integer id;
}
