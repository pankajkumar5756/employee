package com.Employee.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "emp_registration")
@Data
public class RegisterEntity {

	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "new_table_sr_no_seq", allocationSize = 1)
	@GeneratedValue(generator = "mySeqGen")
	@Column(name = "serial_no")
	private Long sr_no;

	@Column(name = "f_name")
	private String firstName;

	@Column(name = "m_name")
	private String middleName;

	@Column(name = "l_name")
	private String lastName;

	@Column(name = "date_birth")
	private String dob;

	@Column(name = "gender")
	private String gender;

	@Column(name = "email")
	private String email;

	@Column(name = "mobile_no")
	private String mobile;

	@Column(name = "password")
	private String password;

	@Column(name = "confim_password")
	private String comfirmPassword;

	@Column(name = "reg_date")
	private LocalDateTime regDate;

	@Column(name = "User_validation") // true false
	private String validation;

}
