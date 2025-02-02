package com.webdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webdemo.service.MsgService;

@RestController
public class MsgRestController {
	
@Autowired
	private MsgService msgService;

@GetMapping("/welcome")
public String welcomeMsg() {
	String welcomeMsg=msgService.getWelcomeMsg();
	return welcomeMsg;
}
@GetMapping("/greet")
public String greetMsg() {
	String greetMsg = msgService.getGreetMsg();
	greetMsg = greetMsg.toUpperCase();
	return greetMsg;
}

  
}
