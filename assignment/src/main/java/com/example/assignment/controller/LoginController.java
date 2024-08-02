package com.example.assignment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment.model.User;
import com.example.assignment.service.LoginService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin
public class LoginController {
	
	@Autowired
	LoginService loginService;

	
	@PostMapping("/login")
	public ResponseEntity<User> loginUser(@RequestBody User user) {
		Optional<User> getUser = Optional.of(loginService.findUser(user.getEmail()));
		if (getUser.isPresent() && getUser.get().getPassword().equals(user.getPassword())) {
            return ResponseEntity.ok(getUser.get());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
	}
	
}
