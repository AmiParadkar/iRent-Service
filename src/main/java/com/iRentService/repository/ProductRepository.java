package com.iRentService.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.iRentService.model.Product;

//public interface ProductRepository  extends MongoRepository<Product,String>{
public interface ProductRepository  extends CrudRepository<Product,Integer>{

	public Product findByProdName (String prodName);
	public Product findById (Long id);
	public List<Product> findAll();
	

}
