package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Nurses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	@OneToMany	
	private List<Patient> patients;
	@OneToOne	
	private Doctors doctors;
	@OneToOne
	private Department department;
	@OneToOne
	private Hospital hospital;
	public Nurses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nurses(int id, String name, String city, List<Patient> patients, Doctors doctors, Department department,
			Hospital hospital) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.patients = patients;
		this.doctors = doctors;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	public Doctors getDoctors() {
		return doctors;
	}
	public void setDoctors(Doctors doctors) {
		this.doctors = doctors;
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
