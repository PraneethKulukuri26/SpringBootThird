package com.praneeth_works.learningWebDev.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praneeth_works.learningWebDev.Entity.RegisterEntity;
import com.praneeth_works.learningWebDev.Services.RegisterServices;

import lombok.Data;

import lombok.Data;

@Controller
@RestController
@RequestMapping("/r")
public class RegisterController {
	
	@Autowired
	RegisterServices registerServices;
	
	@PostMapping("/Register")
	public ex postRegister(@RequestBody RegisterEntity registerEntity) {
		if(registerServices.registerUser(registerEntity).equals("Registered"))
			return new ex(1,"successfully");
		
		return new ex(-1,"failed");
	}
	
	@Data
	class ex{
		private int code;
		private String message;
		public ex(int code,String meaa) {
			this.code=code;
			this.message=meaa;
		}
	}
	
	
}
