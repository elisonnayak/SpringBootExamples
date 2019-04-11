package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ResponseBean;

@RestController
public class ExampleRestController {
	
	@Autowired
	ResponseBean bean;
	
	@RequestMapping(path = "/details",method = RequestMethod.GET)
	public @ResponseBody ResponseBean getDetails(){
		bean.setFirstName("Elison");
		bean.setLastName("Nayak");
		return bean;
	}

}
