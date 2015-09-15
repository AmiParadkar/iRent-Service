package com.iRentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.iRentService.model.AppUser;
import com.iRentService.model.Product;
import com.iRentService.repository.AppUserRepository;
import com.iRentService.repository.ProductRepository;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
		@Autowired
    	private AppUserRepository repository;
		@Autowired
		private ProductRepository prodRepository;

    	public static void main(String[] args) {
    		SpringApplication.run(App.class, args);
    	}
    	@Transactional
    	public void run(String... args) throws Exception {

    		repository.deleteAll();

    		// save a couple of customers
    		repository.save(new AppUser("Alice", "Alice", "Smith", "alicesmith@abc.com","1234"));
    		repository.save(new AppUser("Bob", "Bob", "Smith", "BobSmith@bacd.com","1234"));
    	
    		

    		// fetch all customers
    		System.out.println("User found with findAll():");
    		System.out.println("-------------------------------");
    		for (AppUser user : repository.findAll()) {
    			System.out.println(user.toString());
    		}
    		System.out.println();

    		// fetch an individual customer
    		System.out.println("User found with findByFirstName('Alice'):");
    		System.out.println("--------------------------------");
    		System.out.println(repository.findByFirstName("Alice"));

    		System.out.println("Customers found with findByLastName('Smith'):");
    		System.out.println("--------------------------------");
    		for (AppUser user : repository.findByLastName("Smith")) {
    			System.out.println(user);
    		}
    		
    		prodRepository.deleteAll();
    		
    		AppUser user1 = new AppUser("ami", "Ami", "Paradkar", "amimehta@bacd.com","ami123");
    		repository.save(user1);
    		prodRepository.save(new Product("Prod1", "Prod1 Desc", 1, 100, 20.00,"IMG_3150.JPG",user1));
    		AppUser user2 = new AppUser("Sameer", "sameer", "Paradkar","samparadkard@bacd.com","sam123");
    		repository.save(user2);
    		prodRepository.save(new Product("Prod2", "Prod2 Desc", 1, 200, 30.30,"IMG_0455.JPG",user2));
    		AppUser user3 = new AppUser("Tiya", "Tiya", "Paradkar","tiyaparadkard@bacd.com","tiya123");
    		repository.save(user3);
    		prodRepository.save(new Product("Prod3", "Prod3 Desc", 1, 300, 50.00,"IMG_0458.JPG",user3));
    		AppUser user4 = new AppUser("Aanya", "Aanya", "Paradkar","aanyaparadkard@bacd.com","aanya123");
    		repository.save(user4);
    		prodRepository.save(new Product("Prod4", "Prod4 Desc", 1, 300, 50.00,"IMG_1458.JPG",user4));
    		AppUser user5 = new AppUser("Ekta", "ekta", "Mehta","ektamehta@bacd.com","ekta123");
    		repository.save(user5);
    		prodRepository.save(new Product("Prod5", "Prod5 Desc", 1, 300, 50.00,"IMG_3048.JPG",user5));
    		prodRepository.save(new Product("Prod6", "Prod6 Desc", 1, 300, 50.00,"IMG_3085.JPG",user1));
    		prodRepository.save(new Product("Prod7", "Prod7 Desc", 1, 300, 50.00,"IMG_3147.JPG",user2));
    		prodRepository.save(new Product("Prod8", "Prod8 Desc", 1, 300, 50.00,"IMG_3150.JPG",user3));
    		prodRepository.save(new Product("Prod9", "Prod9 Desc", 1, 300, 50.00,"IMG_3157.JPG",user4));
    		prodRepository.save(new Product("Prod10", "Prod10 Desc", 1, 300, 50.00,"Image1.jpg",user5));
    		
    		

    		// fetch all Products
    		System.out.println("Products found with findAll():");
    		System.out.println("-------------------------------");
    		for (Product prod : prodRepository.findAll()) {
    			System.out.println(prod.toString());
    		}
    		System.out.println();

    		// fetch an individual product
    		System.out.println("Product found with findByProdName('Prod1'):");
    		System.out.println("--------------------------------");
    		System.out.println(prodRepository.findByProdName("Prod1"));

    		System.out.println("Prod found with findById(1):");
    		System.out.println("--------------------------------");
    		for (Product prod : prodRepository.findById(1L)) {
    			System.out.println(prod);
    		}

    	}

}
