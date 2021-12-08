package com.coforge.training.hibernateweb;



public class Person {

private Long personId;
private String firstname;
private String lastname;

//default constructor
public Person() {
super();
}

//Parameterized Constructor
public Person(String firstname, String lastname) {
super();
this.firstname = firstname;
this.lastname = lastname;
}



//getters and setters



public Long getPersonId() {
return personId;
}



public void setPersonId(Long personId) {
this.personId = personId;
}



public String getFirstname() {
return firstname;
}



public void setFirstname(String firstname) {
this.firstname = firstname;
}



public String getLastname() {
return lastname;
}



public void setLastname(String lastname) {
this.lastname = lastname;
}




}