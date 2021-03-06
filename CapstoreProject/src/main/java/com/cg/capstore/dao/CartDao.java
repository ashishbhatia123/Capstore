package com.cg.capstore.dao;

import java.util.List;

import com.cg.capstore.bean.Cart;
import com.cg.capstore.bean.Order;

public interface CartDao {
	public List<Cart> getAll();
	public Cart getCartDetails(String user_Id);
	public List<Cart> delete(String user_Id);
	public Cart add(Cart cart);
	public String update(Cart cart);
	public void order(Order order);
}

