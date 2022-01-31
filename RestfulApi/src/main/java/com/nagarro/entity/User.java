package com.nagarro.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
   

	@Id
	@GeneratedValue
	private Integer id;
	
	
	private String name;
	
	
	private Date birthDate;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name,Date date) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
