package com.ecom.userservice.dto.response;

import java.util.List;

import lombok.Data;

@Data
public class UserResponse {
	private Long id;
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private String phone;
	private String accountStatus;
	private List<String> roles;
	private String createdAt;
}