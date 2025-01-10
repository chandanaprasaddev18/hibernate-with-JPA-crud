package com.tp.hibernate_with_jpa.entity;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "employee_management_system")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String empName;
	private Double salary;
	private String city;
}
