package com.vladancupric.profesori.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "predmet")


public class Predmet { 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int predmet_id;
private String name;
private String code;
private int ESPB;


public Predmet() {
	super();
}


public Predmet(int predmet_id, String name, String code, int eSPB) {
	super();
	this.predmet_id = predmet_id;
	this.name = name;
	this.code = code;
	ESPB = eSPB;
}


public int getPredmet_id() {
	return predmet_id;
}


public void setPredmet_id(int predmet_id) {
	this.predmet_id = predmet_id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getCode() {
	return code;
}


public void setCode(String code) {
	this.code = code;
}


public int getESPB() {
	return ESPB;
}


public void setESPB(int eSPB) {
	ESPB = eSPB;
}


@Override
public String toString() {
	return "Predmet [predmet_id=" + predmet_id + ", name=" + name + ", code=" + code + ", ESPB=" + ESPB + "]";
}



}
