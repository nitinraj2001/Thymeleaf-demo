package com.nitinraj.springboot.thymeleafdemo.controller;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import com.nitinraj.springboot.thymeleafdemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	List<Employee> theEmployees;
	
	@PostConstruct
	public void LoadData() {
		
		Employee emp1=new Employee(1,"nitin","raj","nitinraj2001@gmail.com");
		
		Employee emp2=new Employee(2,"ashish","kumarSingh","ashishkumar2003@gmail.com");
		
		Employee emp3=new Employee(3,"kanchan","rajput","komalsingh1998@gmail.com");
		
		theEmployees=new ArrayList<Employee>();
		
		theEmployees.add(emp1);
		
		theEmployees.add(emp2);
		
		theEmployees.add(emp3);
		
	}
	
	@GetMapping("/list")
	public String getEmployees(Model themodel) {
		
		themodel.addAttribute("employees", theEmployees);
		
		return "list-employee";
		
	}
}
