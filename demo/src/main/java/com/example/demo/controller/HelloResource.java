package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloResource {
	@RequestMapping({ "/hello" })
	public String hello() {
		return "Hello World";
	}
//
//	@RequestMapping(value= "/authenticate", method = RequestMethod.POST )
//	public ResponseEntity<?> createAuthenticationToken(@RequestBody Auth){
//		
//	}
}
