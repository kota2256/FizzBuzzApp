package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FizzBuzzMapper {

	public int insertOne(int inputNum);
}
