package com.iRentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iRentService.model.AppUser;
import com.iRentService.repository.AppUserRepository;

@RestController
public class AppUserController {

		private final AppUserRepository userRepository ;

	    @RequestMapping(value = "/iRentService/user/{userFirstName}", method = RequestMethod.GET)
	    AppUser getDetails(@PathVariable String userFirstName){	    	
	    	System.out.println("USERID == "+userFirstName);
	    	return this.userRepository.findByFirstName(userFirstName);
	    }
	    @Autowired
	    AppUserController(AppUserRepository userRepository) {
			this.userRepository = userRepository;
		}
	    
}
