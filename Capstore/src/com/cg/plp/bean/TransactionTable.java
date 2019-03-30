package com.cg.plp.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "transaction_master")
public class TransactionTable {
	@Id
private long transactionId;
private enum paymentMethod{cod , netBanking , CreaditCard};
private paymentMethod payMeth;
public long getTransactionId() {
	return transactionId;
}
public void setTransactionId(long transactionId) {
	this.transactionId = transactionId;
}
public TransactionTable(long transactionId) {
	super();
	this.transactionId = transactionId;
}


public paymentMethod getPayMeth() {
	return payMeth;
}
public void setPayMeth(paymentMethod payMeth) {
	this.payMeth = payMeth;
}
public TransactionTable() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "TransactionTable [transactionId=" + transactionId + ", payMeth=" + payMeth + "]";
}

	


}
