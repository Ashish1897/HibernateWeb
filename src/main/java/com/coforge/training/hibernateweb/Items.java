package com.coforge.training.hibernateweb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Items")
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="item_id")
	private String itemId;

	@Column(name="item_total")
	private double itemTotal;

	@Column(name="quantity")
	private int quantity;

	@ManyToOne
	@JoinColumn(name ="cart_id",nullable = false)
	private Cart cart;
	
	
	public Items(String itemId, double itemTotal, int quantity, Cart cart) {
		super();
		this.itemId = itemId;
		this.itemTotal = itemTotal;
		this.quantity = quantity;
		this.cart = cart;
	}

	

	public long getId() {
		return id;
	}



	public String getItemId() {
		return itemId;
	}



	public double getItemTotal() {
		return itemTotal;
	}



	public int getQuantity() {
		return quantity;
	}



	public Cart getCart() {
		return cart;
	}



	public void setId(long id) {
		this.id = id;
	}



	public void setItemId(String itemId) {
		this.itemId = itemId;
	}



	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public void setCart(Cart cart) {
		this.cart = cart;
	}



	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
