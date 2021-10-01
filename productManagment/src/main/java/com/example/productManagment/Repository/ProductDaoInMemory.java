package com.example.productManagment.Repository;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.productManagment.entities.Product;
@Repository
public class ProductDaoInMemory implements ProductDao {
	
	List<Product> productList= Arrays.asList(
			 new Product(1, "trimmer", true, 100.0,false),
			 new Product(2, "water bottle", true, 1.0,true),
			 new Product(3, "cream", true, 20.0,false),
			 new Product(4, "comb", true, 5.0,false),
			 new Product(5, "notebook", true, 10.0,true)
			 );
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		productList.add(product);
		return product;
	}

	@Override
	public Product deleteProduct(int prodId) {
		Product p=null;
		Iterator<Product> itr = productList.iterator();
		while (itr.hasNext()) {
			Product temp=(Product) itr.next();
			if(temp.getProductId()==prodId) {
				p=temp;
				itr.remove();
				break;
			}
		}
		return p;
	}

	@Override
	public Product findProduct(int productId) {
		Product p=null;
		Iterator<Product> itr = productList.iterator();
		while (itr.hasNext()) {
			Product temp=(Product) itr.next();
			if(temp.getProductId()==productId) {
				p=temp;
				break;
			}
		}
		return p;
	}

	@Override
	public List<Product> showAllProducts() {
		// TODO Auto-generated method stub
		return productList;
	}

}
