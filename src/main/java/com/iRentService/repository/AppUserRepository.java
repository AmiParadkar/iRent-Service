package com.iRentService.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.iRentService.model.AppUser;
//public interface UserRepository extends MongoRepository<AppUser,String>{
public interface AppUserRepository extends CrudRepository<AppUser,Integer>{

		public AppUser findByFirstName (String firstName);
		public List<AppUser> findByLastName (String lastName);
		public List<AppUser> findAll();
		public AppUser findById(Long userId);
		public AppUser save(AppUser appUser);
		public void delete(AppUser appUser);

		
	}


