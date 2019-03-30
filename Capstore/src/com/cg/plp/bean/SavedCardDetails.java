package com.cg.plp.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "savedCard_master")
public class SavedCardDetails {

	private String cardHolderName;
	private String CardNumber;
	private  int expiryMonth;
	private int expiryYear;
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	public int getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	public SavedCardDetails(String cardHolderName, String cardNumber, int expiryMonth, int expiryYear) {
		super();
		this.cardHolderName = cardHolderName;
		CardNumber = cardNumber;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
	}
	public SavedCardDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SavedCardDetails [cardHolderName=" + cardHolderName + ", CardNumber=" + CardNumber + ", expiryMonth="
				+ expiryMonth + ", expiryYear=" + expiryYear + "]";
	}
	
	
	
}
