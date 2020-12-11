package com.cognizant.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.poc.model.DataBean;

@RestController
public class Demo {
	
	@RequestMapping(method=RequestMethod.GET,path="/demo")
	public String demo() {
		return "demoshit";
	}
	
	@GetMapping(path="/data")
	public DataBean dataBean() {
		return new DataBean("demo");
	}
}
