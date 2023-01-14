package com.driver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class Image{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String description;
	
	
	private String dimensions;
	
	@ManyToOne
	@JoinColumn
	private Blog blog;


	public int getId() {
		return id;
	}
    public Image(String description, String dimensions) {
        this.description = description;
        this.dimensions = dimensions;
    }

	public void setId(int id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDimensions() {
		return dimensions;
	}


	public void setDimensions(String dimension) {
		this.dimensions = dimension;
	}


	public Blog getBlog() {
		return blog;
	}


	public void setBlog(Blog blog) {
		this.blog = blog;
	}


	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Image(int id, String description, String dimensions, Blog blog) {
		super();
		this.id = id;
		this.description = description;
		this.dimensions = dimensions;
		this.blog = blog;
	}
	
	
}

