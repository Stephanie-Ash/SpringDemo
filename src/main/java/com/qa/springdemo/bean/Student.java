package com.qa.springdemo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String firstName;
	private String surname;
	private int age;
	private String email;
	private String subject;
	private Double fees;
	private Address address;
	
	public Student() {
		System.out.println("Default constructor called...");
		
	}
	
	@Autowired
	public Student(@Qualifier("homeAddress") Address address) {
		System.out.println("Address constructor called...");
		this.address = address;
	}

	public Student(int id, String firstName, String surname, int age, String email, String subject, Double fees) {
		System.out.println("Constructor called...");
		this.id = id;
		this.firstName = firstName;
		this.surname = surname;
		this.age = age;
		this.email = email;
		this.subject = subject;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Double getFees() {
		return fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", surname=" + surname + ", age=" + age + ", email="
				+ email + ", subject=" + subject + ", fees=" + fees + ", address=" + address + "]";
	}
	
//	public void setup() {
//	System.out.println("Do some important setup");
//}
//
//public void closeDown() {
//	System.out.println("Do some important closing");
//}

}
