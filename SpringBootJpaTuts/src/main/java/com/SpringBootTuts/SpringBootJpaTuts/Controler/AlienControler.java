package com.SpringBootTuts.SpringBootJpaTuts.Controler;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBootTuts.SpringBootJpaTuts.Service.AlienService;
import com.SpringBootTuts.SpringBootJpaTuts.dao.AlienRepo;
import com.SpringBootTuts.SpringBootJpaTuts.model.Alien;

@Controller
public class AlienControler {
	@Autowired
	AlienRepo repo;
	
	@Autowired
	AlienService alienService;
	
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("home");
		
		return mv;
	}
	
//	@RequestMapping("/addAlien")
//	public ModelAndView addAlien(Alien alien) {
//		ModelAndView mv = new ModelAndView();
//		System.out.println(alien);
//		repo.save(alien);
//		mv.setViewName("home");
//		return mv;
//	}
//	
//	@GetMapping("/allAliens")
//	public ModelAndView getAllAliens(){
//		ModelAndView mv = new ModelAndView();
//		List<Alien> aliens = alienService.getAliens();
//		mv.addObject("alien",aliens);
//		mv.setViewName("home");
////		return alienService.getAliens();
//		return mv;
//	}
//	
//	@GetMapping("/alien/{aId}")
//	public ModelAndView getAlien(@PathVariable("aId") int id) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("alien", alienService.getAlienById(id));
//		mv.setViewName("home");
//		return mv;
//	}
//	@GetMapping("/alienDeleted/{aId}")
//	public ModelAndView deleteAlien(@PathVariable("aId") int id) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("alien", alienService.getAlienById(id));
//		alienService.deleteAlienById(id);
//		mv.setViewName("home");
//		return mv;
//	}
//	
//	@RequestMapping("/findAlienLang")
//	public ModelAndView findAliensByLang(@RequestParam String lang) {
//		ModelAndView mv = new ModelAndView();
//		List<Alien> aliens = alienService.getAlienLang(lang);
//		mv.addObject("aliens",aliens);
////		System.out.println(repo.findByAname("Deep"));
////		System.out.println(repo.findByAidGreaterThan(105));
//		System.out.println(repo.findByLangSorted("Java"));
//		mv.setViewName("show_aliens");
//		
//		return mv;
//		
//	}
	
//	Rest api
	
//	@RequestMapping(path = "/aliens",produces = {"application/xml"}) To restrict data in xml format
	
	@RequestMapping(path = "/aliens")
	@ResponseBody
	public Iterable<Alien> getAliens(){
		return repo.findAll();
	}
	
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}
	
	
}
