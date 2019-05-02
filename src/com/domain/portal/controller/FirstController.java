package com.domain.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

	@GetMapping("/hello")
	public String getIndex(@RequestParam(value = "name", required = false, defaultValue = "boi") String name,
			Model model) {
		model.addAttribute("name", name);
		return "hello";
	}

	@GetMapping("/login")
	public String getLogin(@RequestParam(value = "error", required = false) String error, Model model) {
		if (error != null) {
			model.addAttribute("error", "User and password not valid.");
		}
		return "login";
	}

}
