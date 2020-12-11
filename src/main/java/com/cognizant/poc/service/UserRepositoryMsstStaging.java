package com.cognizant.poc.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.poc.model.MsstStagingSample;

public interface UserRepositoryMsstStaging extends JpaRepository<MsstStagingSample, Integer> {
	
	@Override
	List<MsstStagingSample> findAll();
}
