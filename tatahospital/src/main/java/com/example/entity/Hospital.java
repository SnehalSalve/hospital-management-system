package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int regno;
	private String name;
	private String location;
	@OneToMany
	private List<Department> departments;
	@OneToMany
	private List<Doctors> doctors;
	@OneToMany
	private List<Patient> patients;
	@OneToMany
	private List<Nurses> nurses;
	@OneToMany
	private List<SupportingStaff> suppotingStaffs;
	@OneToOne
	private Medical medical;
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hospital(int regno, String name, String location, List<Department> departments, List<Doctors> doctors,
			List<Patient> patients, List<Nurses> nurses, List<SupportingStaff> suppotingStaffs, Medical medical) {
		super();
		this.regno = regno;
		this.name = name;
		this.location = location;
		this.departments = departments;
		this.doctors = doctors;
		this.patients = patients;
		this.nurses = nurses;
		this.suppotingStaffs = suppotingStaffs;
		this.medical = medical;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	public List<Doctors> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<Doctors> doctors) {
		this.doctors = doctors;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	public List<Nurses> getNurses() {
		return nurses;
	}
	public void setNurses(List<Nurses> nurses) {
		this.nurses = nurses;
	}
	public List<SupportingStaff> getSuppotingStaffs() {
		return suppotingStaffs;
	}
	public void setSuppotingStaffs(List<SupportingStaff> suppotingStaffs) {
		this.suppotingStaffs = suppotingStaffs;
	}
	public Medical getMedical() {
		return medical;
	}
	public void setMedical(Medical medical) {
		this.medical = medical;
	}


	
	
}
