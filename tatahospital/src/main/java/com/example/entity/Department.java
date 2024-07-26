package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String floor;
	@ManyToOne
	private Hospital hsoHospital;
	@OneToMany
	private List<Patient> patients;
	@OneToMany
	private List<Doctors> doctors;
	@OneToMany
	private List<Nurses> nurses;
	@OneToMany
	private List<SupportingStaff> supportingstaff;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String name, String floor, Hospital hsoHospital, List<Patient> patients,
			List<Doctors> doctors, List<Nurses> nurses, List<SupportingStaff> supportingstaff) {
		super();
		this.id = id;
		this.name = name;
		this.floor = floor;
		this.hsoHospital = hsoHospital;
		this.patients = patients;
		this.doctors = doctors;
		this.nurses = nurses;
		this.supportingstaff = supportingstaff;
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
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public Hospital getHsoHospital() {
		return hsoHospital;
	}
	public void setHsoHospital(Hospital hsoHospital) {
		this.hsoHospital = hsoHospital;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	public List<Doctors> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<Doctors> doctors) {
		this.doctors = doctors;
	}
	public List<Nurses> getNurses() {
		return nurses;
	}
	public void setNurses(List<Nurses> nurses) {
		this.nurses = nurses;
	}
	public List<SupportingStaff> getSupportingstaff() {
		return supportingstaff;
	}
	public void setSupportingstaff(List<SupportingStaff> supportingstaff) {
		this.supportingstaff = supportingstaff;
	}
}
