package com.vladancupric.profesori.respositories;

import org.springframework.data.repository.CrudRepository;

import com.vladancupric.profesori.entities.Profesor;

public interface ProfesorsRespository extends CrudRepository<Profesor, Integer>{
	
}
