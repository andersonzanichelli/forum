package com.github.andersonzanichelli.model;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class User extends BaseEntity {

	@NotEmpty
	@Email
	private String username;
	@NotEmpty
	@Size(min = 6)
	private String password;
}
