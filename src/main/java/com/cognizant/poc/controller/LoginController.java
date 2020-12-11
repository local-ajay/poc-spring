package com.cognizant.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cognizant.poc.model.PocUser;
import com.cognizant.poc.model.User;
import com.cognizant.poc.service.LoginRepository;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	LoginRepository loginRepository;
	
	@GetMapping("/get")
	List<PocUser> getAllSampleCredentialsQA(){
		return loginRepository.findAll();
	}
	
//	@GetMapping(produces = "application/json")
//	@RequestMapping("/validateLogin")
//	public User validateUser() {
//		return new User("User successfully authenticated");
//	}
}
