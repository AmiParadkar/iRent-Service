package com.iRentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iRentService.repository.AppUserRepository;

public class AppController {
	
	private final AppUserRepository appUserRepository ;
	 @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String NewFile() {
        return "greeting";
    }
	 @RequestMapping(value="/createTables",method=RequestMethod.GET)
	 public void createTables(){
		// appUserRepository.
	 }
	 @Autowired
	    AppController(AppUserRepository userRepository) {
			this.appUserRepository = userRepository;
		}
}
