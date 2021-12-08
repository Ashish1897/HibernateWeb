package com.coforge.training.hibernateweb;

public class Student {

	private int studentId;
	private String firstName;
	private String lastName;
	private String rollNo;
	private int age;
	
	private Branch branch; // component --has a relationship

	public Student(String firstName, String lastName, String rollNo, int age, Branch branch) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.age = age;
		this.branch = branch;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getRollNo() {
		return rollNo;
	}

	public int getAge() {
		return age;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	
}
