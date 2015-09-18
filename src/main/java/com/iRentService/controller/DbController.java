package com.iRentService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iRentService.model.AppUser;
import com.iRentService.model.Product;
import com.iRentService.repository.AppUserRepository;
import com.iRentService.repository.ProductRepository;

@RestController
@EnableAutoConfiguration
public class DbController {
//	@Autowired
	private final AppUserRepository appUserRepository;
//	@Autowired
	private final ProductRepository prodRepository;

	@RequestMapping(value = "/iRentService/insertAppUser/{deleteFlag}", method = RequestMethod.GET)
	public void insertAppUser(@PathVariable boolean deleteFlag) {

		if (deleteFlag)
			appUserRepository.deleteAll();
	
		
		AppUser user1 = new AppUser();
		user1.setEmail("amimehta@bacd.com");
		user1.setFirstName("Ami");
		user1.setLastName("Paradkar");
		user1.setPassword("ami123");
		user1.setUserName("ami");
		appUserRepository.save(user1);
		
		AppUser user2 = new AppUser();
		user2.setEmail("samparedkar@bacd.com");
		user2.setFirstName("Sameer");
		user2.setLastName("Paradkar");
		user2.setPassword("sam123");
		user2.setUserName("sameer");
		appUserRepository.save(user2);
		
		AppUser user3 = new AppUser();
		user3.setEmail("tiyaparadkar@bacd.com");
		user3.setFirstName("Tiya");
		user3.setLastName("Paradkar");
		user3.setPassword("tiya123");
		user3.setUserName("tiya");
		appUserRepository.save(user3);
		
		AppUser user4 = new AppUser();
		user4.setEmail("aanyaparadkar@bacd.com");
		user4.setFirstName("Aanya");
		user4.setLastName("Paradkar");
		user4.setPassword("aanya123");
		user4.setUserName("aanya");
		appUserRepository.save(user4);
		
		AppUser user5 = new AppUser();
		user5.setEmail("ektamehta@bacd.com");
		user5.setFirstName("Ekta");
		user5.setLastName("Mehta");
		user5.setPassword("ekta123");
		user5.setUserName("ekta");
		appUserRepository.save(user5);		
		

	}

	@RequestMapping(value = "/iRentService/insertProduct/{deleteFlag}", method = RequestMethod.GET)
	public void insertProduct(@PathVariable boolean deleteFlag) {

		if (deleteFlag)
			prodRepository.deleteAll();
		
		//Get User to add to the products
		List<AppUser> appUserList = new ArrayList<AppUser>();
		appUserList = appUserRepository.findAll();
		if(appUserList == null)
		{
			System.err.println("No User Found in Database. Please add the user first");
			return;
		}
		
		
		Product prod1 = new Product();
		AppUser appUser1 = appUserList.get(0);
		prod1.setAppUser(appUser1);
		prod1.setProdDesc("Prod1 Desc");
		prod1.setProdImagePath("IMG_3150.JPG");
		prod1.setProdName("Prod1");
		prod1.setProdPrice(100.00);
		prod1.setProdQuantity(10);
		prod1.setProdType(1);
		List<Product> listProd1 = appUser1.getListProducts();
		if(listProd1 == null)
			listProd1  = new ArrayList<Product>();
		listProd1.add(prod1);
		appUser1.setListProducts(listProd1);
		prodRepository.save(prod1);
		appUserRepository.save(appUser1);
		
		Product prod2 = new Product();
		AppUser appUser2 = appUserList.get(1);
		prod2.setAppUser(appUser2);
		prod2.setProdDesc("Prod2 Desc");
		prod2.setProdImagePath("IMG_0455.JPG");
		prod2.setProdName("Prod2");
		prod2.setProdPrice(200.00);
		prod2.setProdQuantity(20);
		prod2.setProdType(2);
		List<Product> listProd2 = appUser2.getListProducts();
		if(listProd2 == null)
			listProd2  = new ArrayList<Product>();
		listProd2.add(prod2);
		appUser2.setListProducts(listProd2);
		prodRepository.save(prod2);
		appUserRepository.save(appUser2);
		
		Product prod3 = new Product();
		AppUser appUser3 = appUserList.get(2);
		prod3.setAppUser(appUser3);
		prod3.setProdDesc("prod3 Desc");
		prod3.setProdImagePath("IMG_0458.JPG");
		prod3.setProdName("prod3");
		prod3.setProdPrice(300.00);
		prod3.setProdQuantity(30);
		prod3.setProdType(3);
		List<Product> listProd3 = appUser3.getListProducts();
		if(listProd3 == null)
			listProd3  = new ArrayList<Product>();
		listProd3.add(prod3);
		appUser3.setListProducts(listProd3);
		prodRepository.save(prod3);
		appUserRepository.save(appUser3);
		
		Product prod4 = new Product();
		AppUser appUser4 = appUserList.get(3);
		prod4.setAppUser(appUser4);
		prod4.setProdDesc("prod4 Desc");
		prod4.setProdImagePath("IMG_1458.JPG");
		prod4.setProdName("prod4");
		prod4.setProdPrice(400.00);
		prod4.setProdQuantity(40);
		prod4.setProdType(4);
		List<Product> listProd4 = appUser4.getListProducts();
		if(listProd4 == null)
			listProd4  = new ArrayList<Product>();
		listProd4.add(prod4);
		appUser4.setListProducts(listProd4);
		prodRepository.save(prod4);
		appUserRepository.save(appUser4);
		
		Product prod5 = new Product();
		AppUser appUser5 = appUserList.get(4);
		prod5.setAppUser(appUser5);
		prod5.setProdDesc("prod5 Desc");
		prod5.setProdImagePath("IMG_3048.JPG");
		prod5.setProdName("prod5");
		prod5.setProdPrice(500.00);
		prod5.setProdQuantity(50);
		prod5.setProdType(5);
		List<Product> listProd5 = appUser5.getListProducts();
		if(listProd5 == null)
			listProd5  = new ArrayList<Product>();
		listProd5.add(prod5);
		appUser5.setListProducts(listProd5);
		prodRepository.save(prod5);
		appUserRepository.save(appUser5);
		
		Product prod6 = new Product();
		AppUser appUser6 = appUserList.get(0);
		prod6.setAppUser(appUser6);
		prod6.setProdDesc("prod6 Desc");
		prod6.setProdImagePath("IMG_3085.JPG");
		prod6.setProdName("prod6");
		prod6.setProdPrice(600.00);
		prod6.setProdQuantity(60);
		prod6.setProdType(6);
		List<Product> listProd6 = appUser6.getListProducts();
		if(listProd6 == null)
			listProd6  = new ArrayList<Product>();
		listProd6.add(prod6);
		appUser6.setListProducts(listProd6);
		prodRepository.save(prod6);
		appUserRepository.save(appUser6);
		
		Product prod7 = new Product();
		AppUser appUser7 = appUserList.get(1);
		prod7.setAppUser(appUser7);
		prod7.setProdDesc("prod7 Desc");
		prod7.setProdImagePath("IMG_3147.JPG");
		prod7.setProdName("prod7");
		prod7.setProdPrice(700.00);
		prod7.setProdQuantity(70);
		prod7.setProdType(7);
		List<Product> listProd7 = appUser7.getListProducts();
		if(listProd7 == null)
			listProd7  = new ArrayList<Product>();
		listProd7.add(prod7);
		appUser7.setListProducts(listProd7);
		prodRepository.save(prod7);
		appUserRepository.save(appUser7);
		
		Product prod8 = new Product();
		AppUser appUser8 = appUserList.get(2);
		prod8.setAppUser(appUser8);
		prod8.setProdDesc("prod8 Desc");
		prod8.setProdImagePath("IMG_3150.JPG");
		prod8.setProdName("prod8");
		prod8.setProdPrice(800.00);
		prod8.setProdQuantity(80);
		prod8.setProdType(8);
		List<Product> listProd8 = appUser8.getListProducts();
		if(listProd8 == null)
			listProd8  = new ArrayList<Product>();
		listProd8.add(prod8);
		appUser8.setListProducts(listProd8);
		prodRepository.save(prod8);
		appUserRepository.save(appUser8);
		
		Product prod9 = new Product();
		AppUser appUser9 = appUserList.get(3);
		prod9.setAppUser(appUser9);
		prod9.setProdDesc("prod9 Desc");
		prod9.setProdImagePath("IMG_3157.JPG");
		prod9.setProdName("prod9");
		prod9.setProdPrice(900.00);
		prod9.setProdQuantity(90);
		prod9.setProdType(9);
		List<Product> listProd9 = appUser9.getListProducts();
		if(listProd9 == null)
			listProd9  = new ArrayList<Product>();
		listProd9.add(prod9);
		appUser9.setListProducts(listProd9);
		prodRepository.save(prod9);
		appUserRepository.save(appUser9);
		
		Product prod10 = new Product();
		AppUser appUser10 = appUserList.get(4);
		prod10.setAppUser(appUser10);
		prod10.setProdDesc("prod10 Desc");
		prod10.setProdImagePath("Image1.JPG");
		prod10.setProdName("prod10");
		prod10.setProdPrice(1000.00);
		prod10.setProdQuantity(100);
		prod10.setProdType(10);
		List<Product> listProd10 = appUser10.getListProducts();
		if(listProd10 == null)
			listProd10  = new ArrayList<Product>();
		listProd10.add(prod10);
		appUser10.setListProducts(listProd10);
		prodRepository.save(prod10);
		appUserRepository.save(appUser10);
		
		
	}
	@RequestMapping(value = "/iRentService/insertAll/{deleteFlag}", method = RequestMethod.GET)
	public void insertAll(@PathVariable boolean deleteFlag) {
		DbController db = new DbController(appUserRepository,prodRepository);
		db.insertAppUser(deleteFlag);
		db.insertProduct(deleteFlag);
	}
	@Autowired
	DbController(AppUserRepository appUserRepository,ProductRepository prodRepository) {
		this.appUserRepository = appUserRepository;
		this.prodRepository = prodRepository;
	}
	

}
