package com.cognizant.poc.service;

import java.util.List;

import com.cognizant.poc.model.SampleCredentials;

public interface SampleCredDao {

	List<SampleCredentials> getAllSamples(String environment);
}
