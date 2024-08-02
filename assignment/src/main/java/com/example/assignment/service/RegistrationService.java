package com.example.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment.model.User;
import com.example.assignment.repository.UserRepository;

@Service
public class RegistrationService {

	@Autowired
	UserRepository registrationRepository;
	
	public User registerUser(User user) {
		return registrationRepository.save(user);
	}
	
	public User findUser(String name) {
		return registrationRepository.findByEmail(name);
	}
}
