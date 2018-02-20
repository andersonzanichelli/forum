package com.github.andersonzanichelli.model;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Post extends BaseEntity {

	@ManyToOne
	private User owner;
	@SuppressWarnings("unused")
	private LocalDate createdAt = LocalDate.now();
	@NotEmpty
	private String content;
	@ManyToOne
	private Category category;
	@OneToMany
	List<Comment> comments;
}
