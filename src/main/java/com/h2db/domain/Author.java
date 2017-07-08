package com.h2db.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {
	
	@Id
	@GeneratedValue
	private Long id;
	
	//post
	@OneToMany(mappedBy="author")
	private List<Post> posts;
	
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column
	private String firstName;
	@Column
	private String lastName;
	
	private Author(){
		
	}
	
	public Author(String firstName, String lastName){
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	
	@Override
	public String toString(){
		return "Author [firstName="+firstName+", lastName= "+lastName+"]";
	}
}
