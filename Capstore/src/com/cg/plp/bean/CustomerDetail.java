package com.cg.plp.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "customer_master")

public class CustomerDetail {
	

private String name;
	
private String email;
@Id
@Column(name="cust_mobile",length= 10)
private String mobile;
private String gender;
private Date Dob;
private List<Address> address;
private MyWishList wishlist;
private MyCart cart;
private SavedCardDetails cardDetail;
private List<MyOrders> myOrders;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Date getDob() {
	return Dob;
}
public void setDob(Date dob) {
	Dob = dob;
}
public List<Address> getAddress() {
	return address;
}
public void setAddress(List<Address> address) {
	this.address = address;
}
public MyWishList getWishlist() {
	return wishlist;
}
public void setWishlist(MyWishList wishlist) {
	this.wishlist = wishlist;
}
public MyCart getCart() {
	return cart;
}
public void setCart(MyCart cart) {
	this.cart = cart;
}
public SavedCardDetails getCardDetail() {
	return cardDetail;
}
public void setCardDetail(SavedCardDetails cardDetail) {
	this.cardDetail = cardDetail;
}
public List<MyOrders> getMyOrders() {
	return myOrders;
}
public void setMyOrders(List<MyOrders> myOrders) {
	this.myOrders = myOrders;
}
@Override
public String toString() {
	return "CustomerDetail [name=" + name + ", email=" + email + ", mobile=" + mobile + ", gender=" + gender + ", Dob="
			+ Dob + ", wishlist=" + wishlist + ", cart=" + cart + ", cardDetail=" + cardDetail + ", myOrders="
			+ myOrders + "]";
}
public CustomerDetail(String name, String email, String mobile, String gender, Date dob, List<Address> address,
		MyWishList wishlist, MyCart cart, SavedCardDetails cardDetail, List<MyOrders> myOrders) {
	super();
	this.name = name;
	this.email = email;
	this.mobile = mobile;
	this.gender = gender;
	Dob = dob;
	this.address = address;
	this.wishlist = wishlist;
	this.cart = cart;
	this.cardDetail = cardDetail;
	this.myOrders = myOrders;
}
public CustomerDetail() {
	super();
	// TODO Auto-generated constructor stub
}




}
