package com.example.productManagment.Service;

import java.util.List;
import java.util.Optional;

import com.example.productManagment.entities.Product;

public interface ProductServiceStream {
	public void printAll();
	public List<Product> prodctsEligibleForCOD ();
	public List<Product> productEligibleForOverNightDelivery ();
	public List<Product> productOnSomeDiscount ( Double discount);
	public long productCount();
	public Optional<Product> productMaxPrice();
	public boolean productOfAType( String type);
	public Exception methodTest() throws Exception;
	 
}
