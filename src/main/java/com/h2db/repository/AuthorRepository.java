package com.h2db.repository;

import org.springframework.data.repository.CrudRepository;

import com.h2db.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
