package com.project.CsvProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="ComponyDetail")


public class ComponyDetail {

	public ComponyDetail() {
		super();
	}
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "serial_number")
	//@JsonProperty("serialNumber")
	private String serialNumber;
	
	@Column(name = "compony_name")
	//@JsonProperty("componyName")
	private String componyName;
	
	@Column(name = "employee_markme")
	//@JsonProperty("employeeMarkme")
	private String employeeMarkme;
	
    @Column(name = "description")
	//@JsonProperty("description")
	private String description;
	
	@Column(name = "leave")
	//@JsonProperty("leave")
	private String leave;

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getComponyName() {
		return componyName;
	}

	public void setComponyName(String componyName) {
		this.componyName = componyName;
	}

	public String getEmployeeMarkme() {
		return employeeMarkme;
	}

	public void setEmployeeMarkme(String employeeMarkme) {
		this.employeeMarkme = employeeMarkme;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLeave() {
		return leave;
	}

	public void setLeave(String leave) {
		this.leave = leave;
	}

	
	

}
