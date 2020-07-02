package com.guiacompass.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_employee;
	
	private String name_employee;
	
	private String surname_employee;
	
	private String email_employee;
	
	public long getId_employee() {
		return id_employee;
	}

	public void setId_employee(long id_employee) {
		this.id_employee = id_employee;
	}

	public String getName_employee() {
		return name_employee;
	}

	public void setName_employee(String name_employee) {
		this.name_employee = name_employee;
	}

	public String getSurname_employee() {
		return surname_employee;
	}

	public void setSurname_employee(String surname_employee) {
		this.surname_employee = surname_employee;
	}

	public String getEmail_employee() {
		return email_employee;
	}

	public void setEmail_employee(String email_employee) {
		this.email_employee = email_employee;
	}

	public String getCpf_employee() {
		return cpf_employee;
	}

	public void setCpf_employee(String cpf_employee) {
		this.cpf_employee = cpf_employee;
	}

	public String getRg_employee() {
		return rg_employee;
	}

	public void setRg_employee(String rg_employee) {
		this.rg_employee = rg_employee;
	}

	public String getOffice_employee() {
		return office_employee;
	}

	public void setOffice_employee(String office_employee) {
		this.office_employee = office_employee;
	}

	public String getPhone_employee() {
		return phone_employee;
	}

	public void setPhone_employee(String phone_employee) {
		this.phone_employee = phone_employee;
	}

	public String getPassword_employee() {
		return password_employee;
	}

	public void setPassword_employee(String password_employee) {
		this.password_employee = password_employee;
	}

	private String cpf_employee;
	
	private String rg_employee;
	
	private String office_employee;
	
	private String phone_employee;
	
	private String password_employee;
	
}

