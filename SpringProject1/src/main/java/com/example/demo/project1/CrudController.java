package com.example.demo.project1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {
	@GetMapping("/create")
	public String create() {
		return "creating";
	}
	@GetMapping("/read")
	public String read() {
		return "reading";
	}
	@GetMapping("/update")
	public String update() {
		return "updating";
	}
	@GetMapping("/delete")
	public String delete() {
		return "deleting";
	}

}
