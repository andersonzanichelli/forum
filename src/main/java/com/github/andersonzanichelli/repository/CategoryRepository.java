package com.github.andersonzanichelli.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.github.andersonzanichelli.model.Category;

@RepositoryRestResource( collectionResourceRel = "data", path = "category" )
public interface CategoryRepository extends JpaRepository<Category, Long> {}
