package com.praneeth_works.learningWebDev.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praneeth_works.learningWebDev.Entity.RegisterEntity;
import com.praneeth_works.learningWebDev.Repository.RegisterRepo;

@Service
public class RegisterServices {
	@Autowired
	RegisterRepo registerRepo;
	
	public String registerUser(RegisterEntity registerEntity) {
		registerRepo.save(registerEntity);
		return "Registered";
	}
}
