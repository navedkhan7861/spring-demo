package com.example.productManagment.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;

import org.springframework.stereotype.Service;

import com.example.productManagment.entities.Product;
@Service
public class ProductServiceStreamImpl implements ProductServiceStream  {
 List<Product> productList= Arrays.asList(
		 new Product(1, "trimmer", true, 100.0,false),
		 new Product(2, "water bottle", true, 1.0,true),
		 new Product(3, "cream", true, 20.0,false),
		 new Product(4, "comb", true, 5.0,false),
		 new Product(5, "notebook", true, 10.0,true)
		 );
 
 public void printAll() {
	 productList.stream().forEach(System.out::println);
 }
 
 public List<Product> prodctsEligibleForCOD (){
	 return productList.stream()
	 			.filter(p->p.isEligibleForCOD()==true)
	 			.collect(Collectors.toList());
 }
 public List<Product> productEligibleForOverNightDelivery (){
	 return productList.stream()
	 			.filter(p->p.isEligibleForOverNightDelivery()==true)
	 			.collect(Collectors.toList());
 }
 public List<Product> productOnSomeDiscount ( Double discount){
	 return productList.stream()
	  .map(p->new Product(p.getProductId(),p.getProductName(),p.isEligibleForCOD(),p.getProductPrice()*(1.0-discount*0.01),p.isEligibleForOverNightDelivery()))
	  .collect(Collectors.toList());
}
 public long productCount() {
	 return productList.stream().count();
 }
 public Optional<Product> productMaxPrice() {
	 return productList.stream().max((p1,p2)->(int)(p1.getProductPrice()-p2.getProductPrice()));
 } 
 public boolean productOfAType( String type) {
	 return productList.stream().anyMatch(p1->p1.getProductName()==type);
 }
 public Exception methodTest() throws Exception {
	 throw new Exception(); 
 }
 public static void main( String args[]) throws Exception {
	 ProductServiceStream productService= new ProductServiceStreamImpl();
	 System.out.println(productService.methodTest());
 }
}
