package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.UserClass;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired	
	UserRepository userRepository;
	
	/*
	public UserClass getUserByUserId(int id) {
		return userRepository.getById(id);
	}
	*/

}

