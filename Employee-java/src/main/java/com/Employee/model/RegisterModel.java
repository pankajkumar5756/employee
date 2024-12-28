package com.Employee.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class RegisterModel {

	private Long sr_no;
	private String firstName;
	private String middleName;
	private String lastName;
	private String dob;
	private String gender;
	private String email;
	private String mobile;
	private String password;
	private String comfirmPassword;
	private LocalDateTime regDate;

}
