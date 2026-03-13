package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.FizzBuzzResult;

@Controller
public class ResultViewController {

	@GetMapping("/fizzbuzzResult")
	public String getResult(Model model) {
		
		// 直近の結果取得
		
		List<FizzBuzzResult> fizzbuzzResultList  = new ArrayList<FizzBuzzResult>();
		
		
		// 過去3件文の入力値取得
		List<Integer> inputNumList = new ArrayList<Integer>();
		inputNumList.add(10);
		inputNumList.add(15);
		inputNumList.add(23);
		
		//Model格納
		model.addAttribute("fizzbuzzResultList", fizzbuzzResultList);
		model.addAttribute("inputNumList", inputNumList);
		
		return "fizzbuzzResult";
	}
}
