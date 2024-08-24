package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.dao.EmployeeDao;
import com.nit.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping("/getAllEmployees")
	public String getAllEmployees(Model model) {
		List<Employee> emps = employeeDao.getAllEmployees();
		model.addAttribute("emps", emps);
		return "show_employees";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(Model model) {
		model.addAttribute("emp", new Employee());
		return "add_employee";
	}
	
	@RequestMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute Employee emp) {
		employeeDao.saveEmployee(emp);
		return "redirect:/getAllEmployees";
	}
}
