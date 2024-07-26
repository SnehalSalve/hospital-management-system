package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	@OneToMany
	private List<Doctors> doctors;
	@OneToOne
	private Hospital hsoHospital;
	@OneToOne
	private Nurses nurses;
	@OneToOne
	private Medical medical;
	@OneToMany
	private List<Department> departments;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int id, String name, String city, List<Doctors> doctors, Hospital hsoHospital, Nurses nurses) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.doctors = doctors;
		this.hsoHospital = hsoHospital;
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
	public List<Doctors> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<Doctors> doctors) {
		this.doctors = doctors;
	}
	public Hospital getHsoHospital() {
		return hsoHospital;
	}
	public void setHsoHospital(Hospital hsoHospital) {
		this.hsoHospital = hsoHospital;
	}
	public Nurses getNurses() {
		return nurses;
	}
	public void setNurses(Nurses nurses) {
		this.nurses = nurses;
	}



}
