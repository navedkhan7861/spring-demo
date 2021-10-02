package com.example.productManagment.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AttributeOverride(name="productDesc",column=@Column(name="product"))
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String productName;
	private String  productDesc;
	private boolean  eligibleForCOD;
	private double productPrice;
	private  boolean eligibleForOverNightDelivery;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productType, boolean eligibleForCOD, double productPrice,
			boolean eligibleForOverNightDelivery) {
		super();
		this.productId = productId;
		this.productName = productType;
		this.eligibleForCOD = eligibleForCOD;
		this.productPrice = productPrice;
		this.eligibleForOverNightDelivery = eligibleForOverNightDelivery;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productType=" + productName + ", eligibleForCOD=" + eligibleForCOD
				+ ", productPrice=" + productPrice + ", eligibleForOverNightDelivery=" + eligibleForOverNightDelivery
				+ "]";
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productType) {
		this.productName = productType;
	}
	public boolean isEligibleForCOD() {
		return eligibleForCOD;
	}
	public void setEligibleForCOD(boolean eligibleForCOD) {
		this.eligibleForCOD = eligibleForCOD;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public boolean isEligibleForOverNightDelivery() {
		return eligibleForOverNightDelivery;
	}
	public void setEligibleForOverNightDelivery(boolean eligibleForOverNightDelivery) {
		this.eligibleForOverNightDelivery = eligibleForOverNightDelivery;
	}
}
