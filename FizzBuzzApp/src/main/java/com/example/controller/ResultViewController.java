package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.FizzBuzzResult;
import com.example.model.InputNum;
import com.example.service.FizzBuzzService;

@Controller
public class ResultViewController {

	@Autowired
	private FizzBuzzService fizzbuzzService;
	
	@GetMapping("/fizzbuzzResult")
	public String getResult(Model model) {
		
		// 直近の結果取得
		
		List<FizzBuzzResult> fizzbuzzResultList  = new ArrayList<FizzBuzzResult>();
		
		
		// 過去3件文の入力値取得
		List<InputNum> inputNumList = fizzbuzzService.getMany();
		
		//Model格納
		model.addAttribute("fizzbuzzResultList", fizzbuzzResultList);
		model.addAttribute("inputNumList", inputNumList);
		
		return "fizzbuzzResult";
	}
}
