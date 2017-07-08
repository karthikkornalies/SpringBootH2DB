package com.h2db.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

@Entity
public class Post {
	@Id //this means a primary key
	@GeneratedValue //this means generate this value using underlying database
	private long id;
	
	//Author
	@ManyToOne
	private Author author;
	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}
	
	@Column
	private String title;
	@Column(columnDefinition = "TEXT")
	private String body;
	
	@Column(columnDefinition = "TEXT")
	private String teaser;
	
	public String getTeaser() {
		return teaser;
	}

	public void setTeaser(String teaser) {
		this.teaser = teaser;
	}

	@CreatedDate @Column(columnDefinition="TIMESTAMP")
	private Date postedOn;
	
	private Post(){
		
	}
	
	public Post(String title){
		this.setTitle(title);
	}
	
	@Override
	public String toString() {
		return "Post [title=" + title + "]";
	}
}
