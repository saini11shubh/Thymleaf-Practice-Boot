package com.practice.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String about( Model model) {
		System.out.println("Inside about handler...");
		model.addAttribute("name","Shubham");
		model.addAttribute("currentDate", new Date().toLocaleString());
		return "about";
		//about.html
	}
	
	@GetMapping("/example-loop")
	public String iterateHandler(Model model) {
		List<String> names = List.of("Ankit","laxmi","karan","Johan");
		model.addAttribute("names",names);
		return "iterator";
	}
	
	//handler for  conditional statements
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		System.out.print("conditional handler executed..");
		m.addAttribute("isActive",true);
		m.addAttribute("Gender", "f");
		List<Integer> mylist = List.of(14,45,485,58,78,55);
		m.addAttribute("mylist",mylist);
		return "condition";
	}
	
	@GetMapping("/fragments")
	public String fragmentsHandler(Model m) {
		m.addAttribute("title","I like a samosa");
		m.addAttribute("subtitle",LocalDateTime.now().toString());
		return "fragment";
	}
}
