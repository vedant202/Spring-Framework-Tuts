package com.SpringBootTuts.SpringBootJpaTuts.Controler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootTuts.SpringBootJpaTuts.Service.AlienService;
import com.SpringBootTuts.SpringBootJpaTuts.dao.AlienRepo;
import com.SpringBootTuts.SpringBootJpaTuts.model.Alien;

@RestController //for rest api
public class AlienControlerRest {
	@Autowired
	AlienRepo repo;
	
	@Autowired
	AlienService alienService;
	
	
	@GetMapping(path = "/aliens")
	public Iterable<Alien> getAliens(){
		return repo.findAll();
	}
	
	@GetMapping(path="/alien/{aid}")
	public Optional<Alien> getAlien(@PathVariable("aid") int aid){
		return repo.findById(aid);
	}
	
	@PostMapping(path="/alien")
	public Alien addAlien(@RequestBody Alien alien) {
		System.out.println(alien);
		repo.save(alien);
		return alien;
	}
	
	@DeleteMapping(path="/alien/{aid}")
	public String deleteAlien(@PathVariable int aid) {
		Alien a = repo.getById(aid);
		repo.delete(a);
		return "deleted";
	}
	
	@PutMapping(path="/alien",consumes = {"application/json"})
	public Alien saveOrUpdate(@RequestBody Alien alien){
		
		Alien savedAlien = repo.save(alien);
		return savedAlien;
	}
}
