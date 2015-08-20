package com.wrox.beginspring.pix.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wrox.beginspring.pix.model.Product;

public interface ProductRepository  extends MongoRepository<Product,String>{

	public Product findByProdName (String prodName);
	public List<Product> findById (Integer id);
	

}
