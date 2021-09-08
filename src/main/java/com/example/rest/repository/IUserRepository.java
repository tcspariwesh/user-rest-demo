package com.example.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer>{

}
