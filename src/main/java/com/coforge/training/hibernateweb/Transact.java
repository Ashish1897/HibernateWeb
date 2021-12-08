package com.coforge.training.hibernateweb;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="Transaction")
public class Transact {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="txn_id")
	private long id;

	@Column(name="txn_date")
	private Date date;

	@Column(name="txn_total")
	private double total;

	@OneToOne(mappedBy ="txn")
	@Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Customer cust;

	public long getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public double getTotal() {
		return total;
	}

	public Customer getCust() {
		return cust;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	@Override
	public String toString() {
		return "Transact [id=" + id + ", cust=" + cust + "]";
	}
	
	
}
