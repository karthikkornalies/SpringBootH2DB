package com.h2db.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.h2db.domain.Author;
import com.h2db.domain.Post;
import com.h2db.repository.AuthorRepository;
import com.h2db.repository.PostRepository;

@Service
public class DataLoader {
	
	private PostRepository postRepository;
	private AuthorRepository authorRepository;
	
	public DataLoader(PostRepository postRepository, AuthorRepository authorRepository){
		this.authorRepository = authorRepository;
		this.postRepository = postRepository;
	}
	
	@PostConstruct
	public void loadData(){
		//create an author
		Author author = new Author("Sai","Ram");
		authorRepository.save(author);
		
		//create an Post
		
		Post post = new Post("Guru Pournima day!");
		post.setAuthor(author);
		post.setBody("Post Body Heere");
		post.setPostedOn(new Date());
		postRepository.save(post);
	}
}
