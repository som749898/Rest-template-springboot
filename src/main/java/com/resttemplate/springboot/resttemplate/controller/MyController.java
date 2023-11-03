package com.resttemplate.springboot.resttemplate.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.resttemplate.springboot.resttemplate.entity.Requestdata;
import com.resttemplate.springboot.resttemplate.entity.Response;
import com.resttemplate.springboot.resttemplate.userStatus.userdesc;

@RestController
public class MyController {
	
	@PostMapping("/user")
	private userdesc getUser(@RequestBody Requestdata reqdata) {
//		Response res = new Response();
		String url = "https://coreuat-zwqcqy3qmq-el.a.run.app/getlogintoken";
		RestTemplate restTemplate = new RestTemplate();
		
		userdesc userdesc = new userdesc();
		
		
//		if(reqdata == null) {
//			userdesc.setStatus("wrong username and password");
//		} else {
//			userdesc.setStatus("Success");
//			userdesc.setResponse(user);
//		}
		
		try {
			Response user = restTemplate.postForObject(url, reqdata,Response.class);
			userdesc.setStatus("Success");
			userdesc.setResponse(user);
		} catch (Exception ex) {
			userdesc.setStatus("wrong username and password");
		}
		
		return userdesc;
	}
}
