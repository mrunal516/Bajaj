package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.UserClass;
import com.example.demo.service.UserService;


@CrossOrigin(origins = "", allowedHeaders = "")
@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@SuppressWarnings("null")
	@PostMapping("/bfhl")
	public UserClass getData(@RequestParam String[] values) {
		UserClass u = new UserClass();
		char []ch;
		String []str = null;
		int strCount=0;
		int []number = null;
		int numberCount=0;
		for(int i=0; i<values.length; i++) {
			if( (values[i].equals("a") && values[i].equals("z")) || (values[i].equals("A") && values[i].equals("Z"))){
				str[strCount] = values[i];
				strCount++;
			}
			else {
				number[numberCount] = Integer.parseInt(values[i]);
			}		
		}
		
		UserClass d1 = new UserClass(true,u.getUser_id(),u.getEmail(),u.getRoll_number(),number,str);
		
		return d1;
	}
}
