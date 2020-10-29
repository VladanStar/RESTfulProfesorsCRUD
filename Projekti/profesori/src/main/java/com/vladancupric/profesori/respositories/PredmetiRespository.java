package com.vladancupric.profesori.respositories;

import org.springframework.data.repository.CrudRepository;

import com.vladancupric.profesori.entities.Predmet;

public interface PredmetiRespository extends CrudRepository<Predmet, Integer>{

	Predmet findByCode (String code);
//	Predmet findByCodeIgnoreCase(String code);
}
