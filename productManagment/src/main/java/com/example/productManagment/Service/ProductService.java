package com.example.productManagment.Service;

import java.util.List;
import java.util.Optional;

import com.example.productManagment.entities.Product;


public interface ProductService {
	Product addProduct(Product product);
	  Product deleteProduct(int prodId);
	  Product findProduct(int id);
	  List<Product> showAllProducts();
	Product updateProduct(Product product);
	 List<Product> showAllProductsByName( String productName);
	 List<Product> showAllProductsByNameContaining( String name);
	 public List<Product> findByProductPriceLess(double price);
	 
}
