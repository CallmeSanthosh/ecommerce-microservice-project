package com.ecom.userservice.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Getter
@Setter
public class Role extends BaseEntity {
	
	@Enumerated(EnumType.STRING)
	@Column(name = "role_name", nullable = false, unique = true)
	private RoleName roleName;
	
	@ManyToMany(mappedBy = "roles")
	private Set<User> user = new HashSet<>();
}
