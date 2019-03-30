package com.cg.plp.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "MyWishList_master")
public class MyWishList {
	@Id
	private int wishId;
	private List<Long> productId;
	public int getWishId() {
		return wishId;
	}
	public void setWishId(int wishId) {
		this.wishId = wishId;
	}
	public List<Long> getProductId() {
		return productId;
	}
	public void setProductId(List<Long> productId) {
		this.productId = productId;
	}
	public MyWishList(int wishId, List<Long> productId) {
		super();
		this.wishId = wishId;
		this.productId = productId;
	}
	public MyWishList() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MyWishList [wishId=" + wishId + ", productId=" + productId + "]";
	}
	
	

}
