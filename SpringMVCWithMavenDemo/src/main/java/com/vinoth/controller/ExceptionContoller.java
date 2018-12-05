package com.vinoth.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ExceptionContoller {

	@ExceptionHandler(Exception.class)
	public String handleArthmeticException(Model m,Exception e){
		System.out.println("something went wrong....");
		m.addAttribute("exception", e);
		return "exception";
	}
	
}
