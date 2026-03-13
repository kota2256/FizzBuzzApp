package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.InputNum;

@Mapper
public interface FizzBuzzMapper {

	// 入力数値の登録
	public int insertOne(int inputNum);
	
	// 過去3件の履歴取得
	public List<InputNum> findMany();
}
