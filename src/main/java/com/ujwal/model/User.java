package com.ujwal.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity 
@Table (name = "accounts")
public class User {
	
	@Id
	@Column(name="id")
	
	private int id;
	@Column(name="email")
    private String email;
	@Column(name="username")
    private String name;
	@Column(name="password")
    private String password;
	@Column(name="date_added")
	private Date dateAdded;
	
	public User() {

	}

	public User(int id, String email, String name, String password, Date dateAdded) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dateAdded = dateAdded;
	}
	
	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
 
    
}