package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.bath;

@Mapper
public interface bathMapper {

	@Select("SELECT * FROM bath WHERE id=#{id}")
	bath getbath(@Param("id") String id); 

	
//	@Update("UPDATE bath SET temp=#{temp} WHERE bath_id=#{bath_id}")
//	int updatetemp(@Param("temp") String temp, @Param("bath_id") String bath_id);
	
}
