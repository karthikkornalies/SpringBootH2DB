package com.h2db.repository;

import org.springframework.data.repository.CrudRepository;

import com.h2db.domain.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
	
	Post findFirstByOrderByPostedOnDesc();
	
}
