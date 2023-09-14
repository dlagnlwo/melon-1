package com.melon.repository.common;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.melon.dto.common.LoginDto;

@Mapper
public interface LoginRepository {
	// Login
	public LoginDto login(@Param("m") LoginDto m);
	// Join
	public void insertUser(@Param("m") LoginDto m);
	// Check
	public int check(@Param("m") LoginDto m);
}
