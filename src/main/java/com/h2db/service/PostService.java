package com.h2db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2db.domain.Post;
import com.h2db.repository.PostRepository;

@Service
public class PostService {
	
	private PostRepository postRepository;
	
	@Autowired
	public PostService(PostRepository postRepository){
		this.postRepository = postRepository;
	}
	
	
	public Post getLatestPost(){
		return postRepository.findFirstByOrderByPostedOnDesc();
	}
}
