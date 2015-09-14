package com.wrox.beginspring.pix.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wrox.beginspring.pix.model.AppUser;
//public interface UserRepository extends MongoRepository<AppUser,String>{
public interface UserRepository extends CrudRepository<AppUser,Integer>{

		public AppUser findByFirstName (String firstName);
		public List<AppUser> findByLastName (String lastName);
		public List<AppUser> findAll();
		public AppUser findById(int userId);
		//public void save(String firstName, String lastName);

		
	}


