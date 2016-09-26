package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
	private int ProductId;
	private String ProductName;
	private String ProductType;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductType() {
		return ProductType;
	}
	public void setProductType(String productType) {
		ProductType = productType;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public float getDiscount() {
		return Discount;
	}
	public void setDiscount(float discount) {
		Discount = discount;
	}
	public float getEstimateVAT() {
		return EstimateVAT;
	}
	public void setEstimateVAT(float estimateVAT) {
		EstimateVAT = estimateVAT;
	}
	public int getDeliveryCharges() {
		return DeliveryCharges;
	}
	public void setDeliveryCharges(int deliveryCharges) {
		DeliveryCharges = deliveryCharges;
	}
	public float getOrderTotal() {
		return OrderTotal;
	}
	public void setOrderTotal(float orderTotal) {
		OrderTotal = orderTotal;
	}
	private int Quantity;

	private float Discount,EstimateVAT;
	 
	private int DeliveryCharges;
	private float OrderTotal,Price;
	
}
