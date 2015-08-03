package com.wrox.beginspring.pix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wrox.beginspring.pix.dao.UserRepository;
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

    	}

}
