package com.example.productManagment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.productManagment.Service.*;
import com.example.productManagment.entities.Product;



@SpringBootTest

class ProductManagmentApplicationTests {
	
	ProductServiceStream productService= new ProductServiceStreamImpl();
	
	@Test
	@Order(8)
	void contextLoads() {
	}
//	@BeforeAll
//	void initializeObject() {
//		productService= new ProductServiceImpl();
//	}

	@Test
	@Order(4)
	@Tag("dev")
	void TestProdctsEligibleForCOD() {
		assertNotNull(productService.prodctsEligibleForCOD());
	}
	@Test
	@Order(6)
	@Tag("dev")
	void TestProdctsCount() {
		assertEquals(productService.productCount(),5);
	}
	@Test
	@Order(7)
	void TestProdctsCountFail4() {
		assertNotEquals(productService.productCount(),4);
	}
	//productMaxPrice
	@Test
	@Order(5)
	void TestProductMaxPrice() {
		//assertNotEquals((Product)productService.productMaxPrice().getProductPrice(),100.0);
	}
	//productOfAType
	@Test
	@Order(3)
	void TestproductOfAType() {
		assertTrue(productService.productOfAType("comb"));
	}
	@Test
	@Order(1)
	void TestproductOfAType2() {
		assertFalse(productService.productOfAType("tyre"));
	}
	//@Test
	@Order(2)
	@RepeatedTest(3)
	void methodTest() {
		assertThrows(Exception.class,()->productService.methodTest());
	}
}
