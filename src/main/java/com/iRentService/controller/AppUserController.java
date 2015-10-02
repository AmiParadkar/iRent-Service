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

	private final AppUserRepository appUserRepository;

//	@RequestMapping(value = "/user", method = RequestMethod.GET)
//	public Principal user(Principal user) {
//		return user;
//	}

	@RequestMapping(value = "/iRentService/user/{userFirstName}", method = RequestMethod.GET)
	AppUser getDetailByName(@PathVariable String userFirstName) {
		System.out.println("USERName == " + userFirstName);
		return this.appUserRepository.findByFirstName(userFirstName);
	}
//	@RequestMapping(value = "/iRentService/user/{symbolicName:[/d]}", method = RequestMethod.GET)
//	AppUser getDetailById(@PathVariable Long userId) {
//		
//		System.out.println("USERID == " + userId);
//		return this.appUserRepository.findById(userId);
//	}

	@RequestMapping(value = "/iRentService/user/all", method = RequestMethod.GET)
	List<AppUser> getDetails() {
		return this.appUserRepository.findAll();
	}
	@RequestMapping(value = "/iRentService/user/create", method = RequestMethod.POST)
	void saveAppUser() {

		 //this.appUserRepository.save(appUser);

	}

//	@Configuration
//	@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
//	protected static class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//		@Override
//		protected void configure(HttpSecurity http) throws Exception {
//			http.httpBasic().and().authorizeRequests().antMatchers("/index.html", "/home.html", "/login.html", "/")
//					.permitAll().anyRequest().authenticated();
//		}
//	}

	@Autowired
	AppUserController(AppUserRepository appUserRepository) {
		this.appUserRepository = appUserRepository;
	}

}
