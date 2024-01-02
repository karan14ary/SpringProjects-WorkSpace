package com.sbp.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbp.employee.entityEmployee.Employee;

@RestController
@RequestMapping("/crud")
public class CrudController {
	@GetMapping(value="{id}")
public Employee getInfo(@PathVariable int id) {
	Employee e1=new Employee(id,"Mohan",45000);
	return e1;
}
}
