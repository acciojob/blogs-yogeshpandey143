package com.driver.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="user")
public class User{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String username;
	
	private String password;
	
	
	private String firstname;
	
	
	private String lastname ;
	
	
	@OneToMany(mappedBy="user", cascade= CascadeType.ALL )
	private List<Blog> blogList;
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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


	public List<Blog> getBlogList() {
		return blogList;
	}


	public void setBlogList(List<Blog> blogList) {
		this.blogList = blogList;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, String username, String password, String firstname, String lastname, List<Blog> blogList) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.blogList = blogList;
	}
	
	
	
	
	
	
	
}