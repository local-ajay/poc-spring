package com.cognizant.poc.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.poc.model.MyBlueProdSample;

public interface UserRepositoryMyBlueProd extends JpaRepository<MyBlueProdSample, Integer>{

}
