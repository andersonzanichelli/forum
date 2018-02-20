package com.github.andersonzanichelli.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.github.andersonzanichelli.model.User;

@RepositoryRestResource( collectionResourceRel = "data", path = "user" )
public interface UserRepository extends JpaRepository<User, Long> {}