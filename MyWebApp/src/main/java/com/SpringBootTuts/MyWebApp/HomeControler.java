package com.SpringBootTuts.MyWebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeControler {
	
//	@RequestMapping("home")
//	public String home(HttpServletRequest request) {
//		HttpSession session = request.getSession();
//		String name = request.getParameter("name");
//		
//		System.out.println("Hii "+name);
//		session.setAttribute("name", name);
//		return "home";
//	}
	
//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("name") String myName) {
//		ModelAndView mv = new ModelAndView();
//		System.out.println("Hii "+myName);
//		mv.addObject("name",myName);
//		mv.setViewName("home");
//		
//		return mv;
//	}
	
	@RequestMapping("home")
	//Alien alien to accept all the parameters
	public ModelAndView home(Alien alien) {
		ModelAndView mv = new ModelAndView();
		System.out.println("Hii "+alien.getAname());
		mv.addObject("obj",alien);
		mv.setViewName("home");
		
		return mv;
	}
}
