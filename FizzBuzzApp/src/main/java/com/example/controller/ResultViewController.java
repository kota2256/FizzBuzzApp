package com.example.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.FizzBuzzResult;
import com.example.model.InputNum;
import com.example.service.FizzBuzzJudgService;
import com.example.service.FizzBuzzService;

@Controller
public class ResultViewController {

	@Autowired
	private FizzBuzzService fizzbuzzService;
	@Autowired
	private FizzBuzzJudgService fizzBuzzJudgService;
	
	@GetMapping("/fizzbuzzResult")
	public String getResult(Model model) {
		
		// 直近の入力数値取得
		int inputNum = fizzbuzzService.getOne();
		
		// 入力数値をもとに判定結果を取得
		List<FizzBuzzResult> fizzbuzzResultList  = fizzBuzzJudgService.fizzbuzzResultList(inputNum);
		
		// 過去3件分の入力値取得
		List<InputNum> inputNumList = fizzbuzzService.getMany();
		
		//Model格納
		model.addAttribute("fizzbuzzResultList", fizzbuzzResultList);
		model.addAttribute("inputNumList", inputNumList);
		
		return "fizzbuzzResult";
	}
}
