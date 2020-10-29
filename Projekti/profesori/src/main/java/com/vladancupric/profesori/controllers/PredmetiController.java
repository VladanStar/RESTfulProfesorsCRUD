package com.vladancupric.profesori.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vladancupric.profesori.entities.Predmet;
import com.vladancupric.profesori.entities.Profesor;
import com.vladancupric.profesori.respositories.PredmetiRespository;

@RestController
public class PredmetiController {
	@Autowired
	private PredmetiRespository respository;
	
	@GetMapping("/predmet")
	public List<Predmet> getAllPredmets(){
		return (List<Predmet>)respository.findAll();
	
	}
	// dohvatanje jednog predmeta
		@GetMapping("/predmet/{id}")
		public Predmet getPredmet(@PathVariable int id) {
			return respository.findById(id).orElse(null);

		}
		// kreiranje predmeta
		@PostMapping("/predmet")
		public Predmet addPredmet(@RequestBody Predmet predmet) {
		return respository.save(predmet);
		}
		// brisanje jednog predmeta
		@DeleteMapping("/predmet/{id}")
		public void  deletePredmet(@PathVariable int id) {
		 respository.deleteById(id);
		}
		// azuriranje predmeta
		@PutMapping("/predmet/{id}")
		public Predmet updatePredmet(@PathVariable int id, @RequestBody Predmet predmet) {
			return respository.save(predmet);
			
		}
		// broj predmeta u bazi
		@GetMapping("predmet/count")
		public long getNumberOfPredmets(){
			return respository.count();
		}
		// 
		@GetMapping("/predmet/search/{code}")
		public Predmet getPredmetByCode(@PathVariable String code) {
			return respository.findByCode(code);
		}
		/*@GetMapping("/predmet/search/{code}")
		public Predmet getPredmetByCodeIgnoreCase(@PathVariable String code) {
			return respository.findByCodeIgnoreCase(code);
		}
*/
}
