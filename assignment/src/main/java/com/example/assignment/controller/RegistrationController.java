package com.example.assignment.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.assignment.model.User;
import com.example.assignment.service.RegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin
public class RegistrationController {
	
	@Autowired
	RegistrationService  registrationService;

	
	@GetMapping("/")
	public String Home() {
		return new String("Home page");
	}
	
	@PostMapping("/register")
	public ResponseEntity<User> register(@RequestBody User user) {
		return ResponseEntity.ok(registrationService.registerUser(user));
	}
	
	
	
}
