package com.cognizant.poc.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.poc.model.MsstQaSample;

public interface UserRepositoryMsstQa extends JpaRepository<MsstQaSample,Integer> {

	@Override
	List<MsstQaSample> findAll();
}
