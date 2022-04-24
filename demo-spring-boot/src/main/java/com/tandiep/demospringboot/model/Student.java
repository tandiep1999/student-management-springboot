package com.tandiep.demospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This annotation for declaring this class can interact with database
public class Student {
	@Id // This annotation will set ID as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // This annotation will auto increment ID value
	
	private int id;
	private String name;
	private String address;
	
	
	public Student() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
