package com.example.productManagment.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productManagment.Service.ProductService;
import com.example.productManagment.entities.Product;





@RestController
@RequestMapping("/api/v1")
public class ProductController {
	@Autowired
	 ProductService productService;
	
	@GetMapping("/allProducts")
	public List<Product> getAllProduct() {
		System.out.println("insite first rest api");
		return productService.showAllProducts();
	}
	 @GetMapping("/{id}")
	 public Product getById(@PathVariable(required = true) int id) {
		 System.out.println("searching for="+id);
	        return productService.findProduct(id);
	 }
	 @GetMapping("/searcByName/{productName}")
	 public List<Product> showAllProductsByName(@PathVariable(required = true) String productName) {
		 
	        return productService.showAllProductsByName( productName);
	 }
	 @GetMapping("/searcByNameContaining/{name}")
	 public List<Product> showAllProductsByNameContaining(@PathVariable(required = true) String name) {
		 
	        return productService.showAllProductsByNameContaining( name);
	 }
	 @GetMapping("/findByProductPriceLess/{price}")
	 public List<Product> findByProductPriceLess(@PathVariable(required = true) double price) {
		 
	        return productService.findByProductPriceLess( price);
	 }
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		System.out.println("insite first rest api");
		return productService.addProduct(product);
	}
	@DeleteMapping("/{id}")
	 public Product deleteById(@PathVariable(required = true) int id) {
		 System.out.println("searching for="+id);
	        return productService.deleteProduct(id);
	 }
	@PutMapping("/{id}")
	 public Product updateProduct(@RequestBody Product product) {
		 
	        return productService.updateProduct(product);
	 }
}