package com.cognizant.poc.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.poc.model.MsstProdSample;

public interface UserRepositoryMsstProd extends JpaRepository<MsstProdSample, Integer> {

	@Override
	List<MsstProdSample> findAll();
}
