package com.github.andersonzanichelli.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@Entity
public class Category extends BaseEntity {

	@NotEmpty
	private String title;
	@NotEmpty
	private String Description;
}
