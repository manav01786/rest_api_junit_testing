package com.webdemo.service;

import org.springframework.stereotype.Service;

@Service
public class MsgService {

	public String getWelcomeMsg() {
		String msg="welcome to Ashok it";
		return msg; 
	}
	
	public String getGreetMsg() {
		String msg = "Good Evening..!!";
		return msg;
	}
}
