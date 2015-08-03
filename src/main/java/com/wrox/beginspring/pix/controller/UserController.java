package com.wrox.beginspring.pix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wrox.beginspring.pix.dao.UserRepository;
import com.wrox.beginspring.pix.model.User;

@RestController
public class UserController {

		private final UserRepository userRepository ;

	    @RequestMapping(value = "/pix/user/{userFirstName}", method = RequestMethod.GET)
	    User getDetails(@PathVariable String userFirstName){
	    	System.out.println("USERID == "+userFirstName);
	    	return this.userRepository.findByFirstName(userFirstName);
	    }
	    @Autowired
	    UserController(UserRepository userRepository) {
			this.userRepository = userRepository;
		}
}
