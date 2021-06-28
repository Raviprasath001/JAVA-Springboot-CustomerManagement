package com.mayuratech.customermanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//Declaring the table name here
@Table(name = "mayuratechcustomermanagements")

//Class, where we declare, what are the columns we are going to use 
public class Customers {

	// Specifying the column names
	@Id
	@GeneratedValue
	private int id;

	private String customername;

	private String orderedproduct;

	private int quantitypurchased;

	private String price;

	private String emailid;

	private int phonenumber;

	private String address;

	private String city;

	// Getter and Setter methods for specifying values for each columns individually
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getOrderedproduct() {
		return orderedproduct;
	}

	public void setOrderedproduct(String orderedproduct) {
		this.orderedproduct = orderedproduct;
	}

	public int getQuantitypurchased() {
		return quantitypurchased;
	}

	public void setQuantitypurchased(int quantitypurchased) {
		this.quantitypurchased = quantitypurchased;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// Creating an empty constructor here
	public Customers() {

	}

}