package com.example.productManagment;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ProductManagmentApplication {
	
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ApplicationContext applicationContext = SpringApplication.run(ProductManagmentApplication.class, args);
		System.out.println("naved");
		
//		for (String name : applicationContext.getBeanDefinitionNames()) {
//			System.out.println("name="+name);
//		}
		//System.out.println(productService.showAllProducts());
	}

}
