package com.cognizant.poc.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.poc.model.PocUser;

public interface LoginRepository extends JpaRepository<PocUser, Integer> {
	
	@Override
	List<PocUser> findAll();
}
