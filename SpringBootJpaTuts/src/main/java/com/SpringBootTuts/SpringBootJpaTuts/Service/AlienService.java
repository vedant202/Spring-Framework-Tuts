package com.SpringBootTuts.SpringBootJpaTuts.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBootTuts.SpringBootJpaTuts.model.Alien;
import com.SpringBootTuts.SpringBootJpaTuts.dao.AlienRepo;

@Service
public class AlienService {
	@Autowired
	AlienRepo aRepo;
	
	public List<Alien> getAliens(){
		List<Alien> aliensList = new ArrayList<>();
		aRepo.findAll().forEach(alien->aliensList.add(alien));
		return aliensList;
	}
	
	public Alien getAlienById(int id) {
		return aRepo.findById(id).orElse(new Alien());
	}
	
	public void deleteAlienById(int id) {
		aRepo.deleteById(id);
	}
	
	public List<Alien> getAlienLang(String lang) {
		List<Alien> aliens = aRepo.findByLang(lang);
		return aliens;
	}
	
}
