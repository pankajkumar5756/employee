package com.Employee.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employee_Details")
@Data
public class EmployeeDetails {

	@Id
	@Column(name = "serial_no")
	private Long ser_no;

	@Column(name = "employee_name")
	private String employeeName;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "creater_name")
	private LocalDateTime createrName;

	@Column(name = "created_date")
	private LocalDateTime createDate;
}
