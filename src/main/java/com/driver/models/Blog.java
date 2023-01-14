package com.driver.models;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="blog")
public class Blog{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	private String title;
	
	private String content;
	
	private Date pubDate;
	
	@OneToMany(mappedBy="blog", cascade= CascadeType.ALL )
	private List<Image> imageList;
	
	
	@ManyToOne
	@JoinColumn
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
		
		
	}

	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Image> getImageList() {
		return imageList;
	}

	public void setImageList(List<Image> imageList) {
		this.imageList = imageList;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Blog(int id, String title, String content, Date pubDate, List<Image> imageList, User user) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.pubDate = pubDate;
		this.imageList = imageList;
		this.user = user;
	}
	
	
	
}

