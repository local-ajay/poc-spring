package com.cognizant.poc.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.poc.model.MyBlueQaSample;

public interface UserRepositoryMyBlueQa extends JpaRepository<MyBlueQaSample, Integer> {

	
}
