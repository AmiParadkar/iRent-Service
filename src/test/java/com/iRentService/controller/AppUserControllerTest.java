package com.iRentService.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iRentService.App;
import com.iRentService.model.AppUser;
import com.iRentService.repository.AppUserRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebIntegrationTest

public class AppUserControllerTest {
	@Autowired
	AppUserRepository appUserRepo;
	AppUser user1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		
		
		user1 = new AppUser();
		user1.setEmail("user1@bacd.com");
		user1.setFirstName("User");
		user1.setLastName("User1");
		user1.setPassword("user123");
		user1.setUserName("User1");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetDetailByName() {
		//AppUser u = appUserRepo.findByFirstName(user1.getFirstName());
		//System.out.println("User found : "+ u.toString());
	}

	@Test
	public void testGetDetailById() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetDetails() {
		//fail("Not yet implemented");
	}

	@Test
	public void testSaveAppUser() {
	
		//appUserRepo.save(user1); 
	}
	@Test
	public void testDeleteAppUser() {
	
		appUserRepo.delete(user1); 
	}
	@Test
	public void testAppUserController() {
		//fail("Not yet implemented");
	}
	
}
	

