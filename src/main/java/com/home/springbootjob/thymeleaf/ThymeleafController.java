package com.home.springbootjob.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
	
	@GetMapping
	public String thymeleaf(Model model) {
		model.addAttribute("formInput", new FormInput());
		return "thymeleaf";
	}
	
	@PostMapping
	public String submitThymeleaf(@ModelAttribute FormInput formInput, Model model) {
		model.addAttribute("formInput", formInput);
		return "thymeleaf";
	}
	
}
