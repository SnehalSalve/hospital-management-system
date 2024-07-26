package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class SupportingStaff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToOne
	private  Department department;
	@ManyToOne
	private Hospital hospital;
	public SupportingStaff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SupportingStaff(int id, String name, Department department, Hospital hospital) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.hospital = hospital;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}



}
