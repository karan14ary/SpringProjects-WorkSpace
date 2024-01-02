package com.demo.example.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/form")
public class FormController {
	@PostMapping
	public String getFromData(@RequestParam String username,@RequestParam String mail,@RequestParam String password,@RequestParam String gender,@RequestParam String date,@RequestParam String month,@RequestParam String year,@RequestParam String phone  ) {
		return("UserName: "+username+
				"<br><br> Email: "+mail+
				" <br><br>Password: "+password+
				" <br><br>Gender: "+gender+
				" <br><br>D.O.B: "+date+"/"+month+"/"+year+
				" <br><br>PhoneNo: "+phone);
	}

}
