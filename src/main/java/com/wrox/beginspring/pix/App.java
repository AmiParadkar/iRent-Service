package com.wrox.beginspring.pix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wrox.beginspring.pix.dao.ProductRepository;
import com.wrox.beginspring.pix.dao.UserRepository;
import com.wrox.beginspring.pix.model.Product;
import com.wrox.beginspring.pix.model.User;

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
    		repository.save(new User(1, "Alice", "Alice", "Smith", "alicesmith@abc.com", "1234", 3,1));
    		repository.save(new User(2, "Bob", "Bob", "Smith", "BobSmith@bacd.com", "2345", 0,1));
    		repository.save(new User(3, "Ami", "ami", "mehta", "amimehta@bacd.com", "2345", 0,1));
    		

    		// fetch all customers
    		System.out.println("User found with findAll():");
    		System.out.println("-------------------------------");
    		for (User user : repository.findAll()) {
    			System.out.println(user.toString());
    		}
    		System.out.println();

    		// fetch an individual customer
    		System.out.println("User found with findByFirstName('Alice'):");
    		System.out.println("--------------------------------");
    		System.out.println(repository.findByFirstName("Alice"));

    		System.out.println("Customers found with findByLastName('Smith'):");
    		System.out.println("--------------------------------");
    		for (User user : repository.findByLastName("Smith")) {
    			System.out.println(user);
    		}
    		
    		prodRepository.deleteAll();
    		
    		prodRepository.save(new Product(1, "Prod1", "Prod1 Desc", 1, 100, 20.00,"IMG_3150.JPG"));
    		prodRepository.save(new Product(2, "Prod2", "Prod2 Desc", 1, 200, 30.30,"/Users/ami/Documents/Paintings/IMG_0458.JPG"));
    		prodRepository.save(new Product(3, "Prod3", "Prod3 Desc", 1, 300, 50.00,"/Users/ami/Documents/Paintings/IMG_1166.JPG"));
    		

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
    		for (Product prod : prodRepository.findById(1)) {
    			System.out.println(prod);
    		}

    	}

}
