package com.wrox.beginspring.pix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wrox.beginspring.pix.dao.ProductRepository;
import com.wrox.beginspring.pix.dao.UserRepository;
import com.wrox.beginspring.pix.model.Product;
import com.wrox.beginspring.pix.model.AppUser;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
		@Autowired
    	private UserRepository repository;
		@Autowired
		private ProductRepository prodRepository;

    	public static void main(String[] args) {
    		SpringApplication.run(App.class, args);
    	}

    	public void run(String... args) throws Exception {

    		repository.deleteAll();

    		// save a couple of customers
    		repository.save(new AppUser("Alice", "Alice", "1234","Smith", "alicesmith@abc.com"));
    		repository.save(new AppUser("Bob", "Bob", "2345","Smith", "BobSmith@bacd.com"));
    		repository.save(new AppUser("Ami", "ami", "2345","mehta", "amimehta@bacd.com"));
    		

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
    		
    		prodRepository.save(new Product("Prod1", "Prod1 Desc", 1, 100, 20.00,"IMG_3150.JPG"));
    		prodRepository.save(new Product("Prod2", "Prod2 Desc", 1, 200, 30.30,"IMG_0455.JPG"));
    		prodRepository.save(new Product("Prod3", "Prod3 Desc", 1, 300, 50.00,"IMG_0458.JPG"));
    		prodRepository.save(new Product("Prod4", "Prod4 Desc", 1, 300, 50.00,"IMG_1458.JPG"));
    		prodRepository.save(new Product("Prod5", "Prod5 Desc", 1, 300, 50.00,"IMG_3048.JPG"));
    		prodRepository.save(new Product("Prod6", "Prod6 Desc", 1, 300, 50.00,"IMG_3085.JPG"));
    		prodRepository.save(new Product("Prod7", "Prod7 Desc", 1, 300, 50.00,"IMG_3147.JPG"));
    		prodRepository.save(new Product("Prod8", "Prod8 Desc", 1, 300, 50.00,"IMG_3150.JPG"));
    		prodRepository.save(new Product("Prod9", "Prod9 Desc", 1, 300, 50.00,"IMG_3157.JPG"));
    		prodRepository.save(new Product("Prod10", "Prod10 Desc", 1, 300, 50.00,"Image1.jpg"));
    		
    		

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
