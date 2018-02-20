package com.github.andersonzanichelli.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Comment extends BaseEntity {

	@ManyToOne
	private User owner;
	@NotEmpty
	private String comment;
	@SuppressWarnings("unused")
	private LocalDate createdAt = LocalDate.now();
}
