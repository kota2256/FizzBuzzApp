package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.service.FizzBuzzService;

@Controller
public class InputViewController {

	@Autowired
	private FizzBuzzService fizzbuzzService;
	
	@GetMapping("/home")
	public String getFizzBuzzHome() {
		return "home";
	}
	
	@PostMapping("/home")
	public String postFizzBuzzForm(@RequestParam int num) {
		
		// 登録処理
		fizzbuzzService.addOne(num);
		
		return "redirect:/fizzbuzzResult";
	}
}
