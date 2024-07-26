package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Doctors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	private String specialization;
	@OneToMany
	private List<Patient> patients;
	@OneToMany
	private List<Department> departments;
	@OneToMany
	private List<Hospital> hospitals;
	@OneToMany
	private List<Nurses> nurses;
	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctors(int id, String name, String city, String specialization, List<Patient> patients,
			List<Department> departments, List<Hospital> hospitals, List<Nurses> nurses) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.specialization = specialization;
		this.patients = patients;
		this.departments = departments;
		this.hospitals = hospitals;
		this.nurses = nurses;
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
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	public List<Hospital> getHospitals() {
		return hospitals;
	}
	public void setHospitals(List<Hospital> hospitals) {
		this.hospitals = hospitals;
	}
	public List<Nurses> getNurses() {
		return nurses;
	}
	public void setNurses(List<Nurses> nurses) {
		this.nurses = nurses;
	}



}
