package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputViewController {

	@GetMapping("/home")
	public String getFizzBuzzHome() {
		return "home";
	}
	
	@PostMapping("/home")
	public String postFizzBuzzForm(
			@RequestParam int num) {
		
		// 数値リスト作成処理（5を受け取ったら5〜+100までの数値のリストを作成）
		
		// FizzBuzz 結果リスト作成処理
		
		// 登録処理
		
		return "redirect:/fizzbuzzResult";
	}
}
