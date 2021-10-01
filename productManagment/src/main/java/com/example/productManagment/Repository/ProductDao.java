package com.example.productManagment.Repository;

import java.util.List;

import com.example.productManagment.entities.Product;

public interface ProductDao {
	Product addProduct(Product product);
	  Product deleteProduct(int prodId);
	  Product findProduct(int productId);
	  List<Product> showAllProducts();
}
