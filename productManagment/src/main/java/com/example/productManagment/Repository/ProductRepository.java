package com.example.productManagment.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.productManagment.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

//	public List<Product> codAvaiable(){
//		
//	}
	public List<Product> findByProductName( String productName);
	public List<Product> findByProductNameContaining( String name);
	
	@Query("select p from Product p where p.productPrice<?1")
	public List<Product> findByProductPriceLess(double price);
	
	
}
