package com.vinoth.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vinoth.model.Alien;

@Controller
public class HomeController {
	
	
	List<Alien> aliensList=new ArrayList<Alien>();

	@RequestMapping("/")
	public String context(){
		System.out.println("context method is called in HomeController");
		return "home";
	}
	
	@RequestMapping("home")
	public String home(){
		System.out.println("home method is called in HomeController");
		return "home";
	}
	
	@RequestMapping("HomeForAddition")
	public String homeForAddition(){
		System.out.println("homeForAddition method is called in HomeController");
		return "home";
	}
	
	/*@RequestMapping("add")
	public String add(@RequestParam("t1") int t1, @RequestParam("t2") int t2, ModelAndView m){
		System.out.println("add method is called in HomeController");
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		int r= t1+t2;
		System.out.println("r : " + r);
		m.addObject("res", r);
		System.out.println("m : " + m);
		System.out.println("m.getModel().toString() : " + m.getModel().toString());
		return "result";
	}*/
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("t1") int t1, @RequestParam("t2") int t2, ModelAndView mv){
		System.out.println("add method is called in HomeController");
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		int r= t1+t2;
		System.out.println("r : " + r);
		mv.addObject("res", r);
		mv.setViewName("result");
		//System.out.println("mv : " + mv);
		//System.out.println("mv.getModel().toString() : " + mv.getModel().toString());
		return mv;
	}
	
	@RequestMapping("devide")
	public ModelAndView devide(@RequestParam("t1") int t1, @RequestParam("t2") int t2, ModelAndView mv){
		System.out.println("devide method is called in HomeController");
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		int r= t1/t2;
		System.out.println("r : " + r);
		mv.addObject("res", r);
		mv.setViewName("result");
		return mv;
	}
	
	@RequestMapping("addAlien")
	public ModelAndView addAlien(@ModelAttribute("alien") Alien alien, ModelAndView mv){
		System.out.println("addAlien method is called in HomeController");
		System.out.println("alien : " + alien);
		System.out.println("aliensList : " + aliensList);
		System.out.println("aliensList size before : " + aliensList.size());
		aliensList.add(alien);
		System.out.println("aliensList size after : " + aliensList.size());
		mv.addObject("res", aliensList);
		mv.setViewName("result");
		//System.out.println("mv : " + mv);
		//System.out.println("mv.getModel().toString() : " + mv.getModel().toString());
		return mv;
	}
	
}
