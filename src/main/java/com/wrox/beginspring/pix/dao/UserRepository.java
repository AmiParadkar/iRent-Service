package com.wrox.beginspring.pix.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wrox.beginspring.pix.model.User;
public interface UserRepository extends MongoRepository<User,String>{

		public User findByFirstName (String firstName);
		public List<User> findByLastName (String lastName);
		//String uId = userId;
		//int id = Integer.parseInt (uId);
		public User findById(String userId);
		//public void save(String firstName, String lastName);

		
	}


