package com.coforge.training.hibernateweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="answers")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String answername;
	private String postedBy;
	
	public int getId() {
		return id;
	}
	public String getAnswername() {
		return answername;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAnswername(String answername) {
		this.answername = answername;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	
}
