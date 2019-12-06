package com.backendPrueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BackendController {
	
	@GetMapping("/greeting")
	public String greering(@RequestParam(name="name", required=false,defaultValue = "World") String name, Model model) {
		model.addAttribute("name",name);
		return "greeting";
	}
	
	@RequestMapping("/")
    public String home() {
        return "Hello World!";
    }
}
