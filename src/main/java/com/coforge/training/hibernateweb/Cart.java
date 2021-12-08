package com.coforge.training.hibernateweb;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cart_id")
	private long id;

	@Column(name="total")
	private double total;

	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "cart") //Use to define property in item class 
	//that is used for mapping purpose
	private Set<Items> items;

	public long getId() {
		return id;
	}

	public double getTotal() {
		return total;
	}

	public String getName() {
		return name;
	}

	public Set<Items> getItems() {
		return items;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setItems(Set<Items> items) {
		this.items = items;
	}
	
	
	
}
