package com.example.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.entity.User;
@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{

}
