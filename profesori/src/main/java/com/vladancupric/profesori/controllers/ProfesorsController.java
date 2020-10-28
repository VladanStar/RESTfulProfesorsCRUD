package com.vladancupric.profesori.controllers;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vladancupric.profesori.entities.Profesor;
import com.vladancupric.profesori.respositories.ProfesorsRespository;

@RestController
public class ProfesorsController {
	@Autowired
	private ProfesorsRespository respository;
	
	
	// odgovara na GET localhost/profesori
	@GetMapping("/profesori")
	public List<Profesor> getAllProfesors(){
		return (List<Profesor>)respository.findAll();
	
	}
	// dohvatanje jednog profesora
	@GetMapping("/profesori/{id}")
	public Profesor getProfesor(@PathVariable int id) {
		return respository.findById(id).orElse(null);
		
	}
	// kreiranje profesora
	@PostMapping("/profesori")
	public Profesor addProfesor(@RequestBody Profesor profesor) {
	return respository.save(profesor);
	}
	
	// brisanje jednog profesora
	@DeleteMapping("/profesori/{id}")
	public void  deleteProfesor(@PathVariable int id) {
	 respository.deleteById(id);
	}
	// azuriranje profesora
	@PutMapping("/profesori/{id}")
	public Profesor updateProfesor(@PathVariable int id, @RequestBody Profesor profesor) {
		return respository.save(profesor);
		
	}
	@GetMapping("profesori/count")
	public long getNumberOfProfesors(){
		return respository.count();
	}

}
