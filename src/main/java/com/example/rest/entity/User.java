package com.example.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
	String name;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
}
