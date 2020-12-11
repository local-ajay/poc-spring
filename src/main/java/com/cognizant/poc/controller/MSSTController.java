package com.cognizant.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.poc.model.MsstProdSample;
import com.cognizant.poc.model.MsstQaSample;
import com.cognizant.poc.model.MsstStagingSample;
import com.cognizant.poc.service.UserRepositoryMsstProd;
import com.cognizant.poc.service.UserRepositoryMsstQa;
import com.cognizant.poc.service.UserRepositoryMsstStaging;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("msst")
public class MSSTController {

	@Autowired
	public UserRepositoryMsstProd userRepositoryMsstProd;

	@Autowired
	public UserRepositoryMsstQa userRepositoryMsstQa;

	@Autowired
	public UserRepositoryMsstStaging userRepositoryMsstStaging;


	@GetMapping("qa")
	List<MsstQaSample> getAllSampleCredentialsQA(){
		return userRepositoryMsstQa.findAll();
	}
	@PostMapping("qa")
	void addSampleCredentialQa(@RequestBody MsstQaSample[] msstQaSampleArray) {
		for(MsstQaSample msstQaSample:msstQaSampleArray) {
//			System.out.println(msstQaSample.getSrno());
			if(msstQaSample.getSrno()<=userRepositoryMsstQa.count())
				msstQaSample.setSrno((int)(userRepositoryMsstQa.count()+1));
			userRepositoryMsstQa.flush();
//			if(!msstQaSample.getUsername().isEmpty())
			userRepositoryMsstQa.save(msstQaSample);
		}
	}

	@GetMapping("staging")
	List<MsstStagingSample> getAllSampleCredentialsStaging(){
		return userRepositoryMsstStaging.findAll();
	}
	@PostMapping("staging")
	void addSampleCredentialStaging(@RequestBody MsstStagingSample[] msstStagingSampleArray) {
		for(MsstStagingSample msstStagingSample:msstStagingSampleArray) {
//			System.out.println(msstStagingSample.getSrno());
			if(msstStagingSample.getSrno()<=userRepositoryMsstStaging.count())
				msstStagingSample.setSrno((int)(userRepositoryMsstStaging.count()+1));
			userRepositoryMsstStaging.flush();
//			if(!msstStagingSample.getUsername().isEmpty())
			userRepositoryMsstStaging.save(msstStagingSample);
		}
	}
}