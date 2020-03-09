package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Main {
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String helloWorld(Model model) {
		model.addAttribute("message", "Mainの画面");
		return "main";
	}
}
