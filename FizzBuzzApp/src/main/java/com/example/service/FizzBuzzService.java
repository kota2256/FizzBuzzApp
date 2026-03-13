package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.InputNum;
import com.example.repository.FizzBuzzMapper;

@Service
public class FizzBuzzService {
	@Autowired
	private FizzBuzzMapper fizzbuzzMapper;
	
	// 入力数値の登録処理
	public void addOne(int inputNum) {
		fizzbuzzMapper.insertOne(inputNum);
	}
	
	// 過去3件の履歴取得
	public List<InputNum> getMany(){
		return fizzbuzzMapper.findMany();
	}
	
}
