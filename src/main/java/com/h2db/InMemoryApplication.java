package com.h2db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.h2db.service.DataLoader;

@SpringBootApplication
//@EntityScan(basePackages = {"com.h2db,com.h2db.domain,com.h2db.repository"})
@EntityScan
public class InMemoryApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(InMemoryApplication.class);
	
	/*@Autowired
	PostRepository postRepository;
	
	@Autowired
	DataLoader dataloader;*/
	
	public static void main(String[] args) {
		SpringApplication.run(InMemoryApplication.class, args);
	}
	
	//post construct
	
	/*@PostConstruct
	void seePosts(){
		logger.info("See Posts method called..");
		for(Post post : postRepository.findAll()){
			logger.info(post.toString());
		}
	}*/
}
