package com.cognizant.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.poc.model.MyBlueProdSample;
import com.cognizant.poc.model.MyBlueQaSample;
import com.cognizant.poc.model.MyBlueStagingSample;
import com.cognizant.poc.service.UserRepositoryMyBlueProd;
import com.cognizant.poc.service.UserRepositoryMyBlueQa;
import com.cognizant.poc.service.UserRepositoryMyBlueStaging;
	
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("myblue")
public class MyBlueController {
	
	@Autowired
	UserRepositoryMyBlueQa userRepositoryMyBlueQa;

	@Autowired
	UserRepositoryMyBlueStaging userRepositoryMyBlueStaging;

	@Autowired
	UserRepositoryMyBlueProd userRepositoryMyBlueProd;

	@GetMapping("qa")
	List<MyBlueQaSample> getAllSampleCredentialsQA(){
		return userRepositoryMyBlueQa.findAll();
	}
	@PostMapping("qa")
	void addSampleCredentialQA(@RequestBody MyBlueQaSample[] myBlueQaSampleArray) {
		for(MyBlueQaSample myBlueQaSample:myBlueQaSampleArray) {
//			System.out.println(myBlueQaSample.getSrno());
			if(myBlueQaSample.getSrno()<=userRepositoryMyBlueQa.count())
				myBlueQaSample.setSrno((int)(userRepositoryMyBlueQa.count()+1));
			userRepositoryMyBlueQa.flush();
//			if(!myBlueQaSample.getUsername().isEmpty())
			userRepositoryMyBlueQa.save(myBlueQaSample);
		}
	}
	
	@GetMapping("staging")
	List<MyBlueStagingSample> getAllSampleCredentialsStaging(){
		return userRepositoryMyBlueStaging.findAll();
	}
	@PostMapping("staging")
	void addSampleCredentialStaging(@RequestBody MyBlueStagingSample[] myBlueStagingSampleArray) {
		/* Sample Alternate Code */
		long i= userRepositoryMyBlueStaging.count();
		for(MyBlueStagingSample myBlueStagingSample:myBlueStagingSampleArray) {
			myBlueStagingSample.setSrno(i+1);
			userRepositoryMyBlueStaging.save(myBlueStagingSample);
			i+=1;
			userRepositoryMyBlueStaging.flush();
		}
//		for(MyBlueStagingSample myBlueStagingSample:myBlueStagingSampleArray) {
//			System.out.println(myBlueStagingSample.getSrno()+ " "+userRepositoryMyBlueStaging.count());
//			
//			if(myBlueStagingSample.getSrno()<=userRepositoryMyBlueStaging.count())
//				myBlueStagingSample.setSrno((int)(userRepositoryMyBlueStaging.count()+1));
//			userRepositoryMyBlueStaging.flush();
//			userRepositoryMyBlueStaging.save(myBlueStagingSample);
//		}
	}
}