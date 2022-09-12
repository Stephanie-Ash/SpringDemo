package com.qa.springdemo.bean;

public class Address {
	private String houseNumber;
	private String street;
	private String town;
	private String postcode;
	
	public Address() {
		
	}
	
	public Address(String houseNumber, String street, String town, String postcode) {
		this.houseNumber = houseNumber;
		this.street = street;
		this.town = town;
		this.postcode = postcode;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", street=" + street + ", town=" + town + ", postcode="
				+ postcode + "]";
	}

}
