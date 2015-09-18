package com.iRentService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iRentService.model.AppUser;
import com.iRentService.repository.AppUserRepository;

@RestController
public class AppUserController {

		private final AppUserRepository appUserRepository ;

	    @RequestMapping(value = "/iRentService/user/{userFirstName}", method = RequestMethod.GET)
	    AppUser getDetails(@PathVariable String userFirstName){	    	
	    	System.out.println("USERID == "+userFirstName);
	    	return this.appUserRepository.findByFirstName(userFirstName);
	    }
	    @RequestMapping(value = "/iRentService/user/all", method = RequestMethod.GET)
	    List<AppUser> getDetails(){
	    
	    	return this.appUserRepository.findAll();
	    	
	    }
	    @Autowired
	    AppUserController(AppUserRepository appUserRepository) {
			this.appUserRepository = appUserRepository;
		}
	    
}
