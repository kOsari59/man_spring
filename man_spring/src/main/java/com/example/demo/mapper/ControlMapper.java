package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.control;


@Mapper
public interface ControlMapper {
	
	@Select("SELECT * FROM control WHERE bath_id=#{id}")
	control getControl(@Param("id") String id); 

	
	@Insert("INSERT INTO control VALUES(null,#{userid}, #{bathid}, #{cap}, #{hvalve}, #{cvalve}, #{cleantime})")
	int insertcontrol(@Param("userid") int userid,
			@Param("bathid") int bathid, @Param("cap") int cap, 
			@Param("hvalve") int hvalve,@Param("cvalve") int cvalve,
			@Param("cleantime") int cleantime);
}
