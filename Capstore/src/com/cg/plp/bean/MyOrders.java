package com.cg.plp.bean;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "MyOrders_master")
public class MyOrders {

	@Id
	private long myoOrderId;
	private List<Long > prodId;
	private LocalDate purchaseDate;
	private Address deliveryAddress;
	private LocalDate DeliveryDate;
	private  TransactionTable  transDetails;	
	private String orderStatus;
	private Double subTotal;
	public long getMyoOrderId() {
		return myoOrderId;
	}
	public void setMyoOrderId(long myoOrderId) {
		this.myoOrderId = myoOrderId;
	}
	public List<Long> getProdId() {
		return prodId;
	}
	public void setProdId(List<Long> prodId) {
		this.prodId = prodId;
	}
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Address getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public LocalDate getDeliveryDate() {
		return DeliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		DeliveryDate = deliveryDate;
	}
	public TransactionTable getTransDetails() {
		return transDetails;
	}
	public void setTransDetails(TransactionTable transDetails) {
		this.transDetails = transDetails;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	public MyOrders(long myoOrderId, List<Long> prodId, LocalDate purchaseDate, Address deliveryAddress,
			LocalDate deliveryDate, TransactionTable transDetails, String orderStatus, Double subTotal) {
		super();
		this.myoOrderId = myoOrderId;
		this.prodId = prodId;
		this.purchaseDate = purchaseDate;
		this.deliveryAddress = deliveryAddress;
		DeliveryDate = deliveryDate;
		this.transDetails = transDetails;
		this.orderStatus = orderStatus;
		this.subTotal = subTotal;
	}
	public MyOrders() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MyOrders [myoOrderId=" + myoOrderId + ", prodId=" + prodId + ", purchaseDate=" + purchaseDate
				+ ", DeliveryDate=" + DeliveryDate + ", transDetails=" + transDetails + ", orderStatus=" + orderStatus
				+ ", subTotal=" + subTotal + "]";
	}
	
	
	
}
