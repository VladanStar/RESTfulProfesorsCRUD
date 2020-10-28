package com.vladancupric.profesori.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "profesori")


public class Profesor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private String email;
	private String fakultet;
	
	
	public Profesor() {
	}

	public Profesor(int id, String name, String surname, String email, String fakultet) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.fakultet = fakultet;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFakultet() {
		return fakultet;
	}

	public void setFakultet(String fakultet) {
		this.fakultet = fakultet;
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", fakultet="
				+ fakultet + "]";
	}
	
	

}
