package com.github.andersonzanichelli.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.github.andersonzanichelli.model.Post;

@RepositoryRestResource( collectionResourceRel = "data", path = "post" )
public interface PostRepository extends JpaRepository<Post, Long> {}