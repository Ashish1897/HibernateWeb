package com.coforge.training.hibernateweb;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String qName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="qid") //foreign key field in answer table
	@OrderColumn(name="type")
	private List<Answer> answers;

	public int getId() {
		return id;
	}

	public String getqName() {
		return qName;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setqName(String qName) {
		this.qName = qName;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
}
