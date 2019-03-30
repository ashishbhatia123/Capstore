package com.cg.plp.bean;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "myCart_master")
public class MyCart {
	@Id
	private int cartId;
	private Map<Long,Integer> productId_Quantity =new HashMap<>();
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Map<Long, Integer> getProductId_Quantity() {
		return productId_Quantity;
	}
	public void setProductId_Quantity(Map<Long, Integer> productId_Quantity) {
		this.productId_Quantity = productId_Quantity;
	}
	public MyCart(int cartId, Map<Long, Integer> productId_Quantity) {
		super();
		this.cartId = cartId;
		this.productId_Quantity = productId_Quantity;
	}
	public MyCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MyCart [cartId=" + cartId + ", productId_Quantity=" + productId_Quantity + "]";
	}
	
	
	
}
