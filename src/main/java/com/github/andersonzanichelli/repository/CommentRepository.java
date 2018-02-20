package com.github.andersonzanichelli.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.github.andersonzanichelli.model.Comment;

@RepositoryRestResource( collectionResourceRel = "data", path = "comment" )
public interface CommentRepository extends JpaRepository<Comment, Long> {}