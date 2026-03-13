package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.FizzBuzzMapper;

@Service
public class FizzBuzzService {
	@Autowired
	private FizzBuzzMapper fizzbuzzMapper;
	
	// 入力数値の登録処理
	public void addOne(int inputNum) {
		fizzbuzzMapper.insertOne(inputNum);
	}
	
}
