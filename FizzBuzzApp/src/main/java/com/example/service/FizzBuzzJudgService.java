package com.example.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.FizzBuzzResult;

@Service
public class FizzBuzzJudgService {

	// FizzBuzzResult のリスト作成
	public List<FizzBuzzResult> fizzbuzzResultList(int inputNum){
		List<FizzBuzzResult> fizzbuzzResultList = new ArrayList<FizzBuzzResult>();
		for (int i = inputNum;  i < (inputNum + 100); i++) {
			String result = this.fizzbuzzResult(i);
			FizzBuzzResult fizzBuzzResult = new FizzBuzzResult(i, result);
			fizzbuzzResultList.add(fizzBuzzResult);
		}
		return fizzbuzzResultList;
	}
	
	// FizzBuzz判定
	private String fizzbuzzResult(int num){
		String result = "未判定";
		
		if (num % 15 == 0) {		// FizzBuzz判定（15の倍数の場合）
			result = "FizzBuzz";
		} else if (num % 5 == 0) {		// Buzz判定（5の倍数の場合）
			result = "Buzz";
		} else if (num % 3 == 0) {		// Fizz判定（3の倍数の場合）
			result = "Fizz";
		} else {
			result = String.valueOf(num);
		}
		
		return result;
	}
}
