package com.example.productManagment.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.productManagment.Repository.ProductDao;
import com.example.productManagment.Repository.ProductRepository;
import com.example.productManagment.entities.Product;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product product) {
		
		//return productDao.addProduct(product);
		return productRepository.save(product);
	}

	@Override
	public Product deleteProduct(int prodId) {
		// TODO Auto-generated method stub
		//return productDao.deleteProduct(prodId);
		Product p=findProduct(prodId);
		 productRepository.deleteById(prodId);
		 return p;
	}

	@Override
	public Product findProduct(int productId) {
		// TODO Auto-generated method stub
		//return productDao.findProduct(productId);
		Optional<Product> productResponse=  productRepository.findById(productId);
		Product p = productResponse.get();
		return p;
	}

	@Override
	public List<Product> showAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public List<Product> showAllProductsByName(String productName) {
		// TODO Auto-generated method stub
		return productRepository.findByProductName(productName);
	}
	//findByProductNameContaining

	@Override
	public List<Product> showAllProductsByNameContaining(String name) {
		// TODO Auto-generated method stub
		return productRepository.findByProductNameContaining(name);
	}
	public List<Product> findByProductPriceLess(double price){
		return productRepository.findByProductPriceLess(price);
	}
	
}
