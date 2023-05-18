package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.schedule;



@Mapper
public interface ScheduleMapper {
	@Select("SELECT * FROM schedule WHERE bath_id=#{id}")
	schedule getSchedule(@Param("id") String id); 
	
	@Insert("INSERT INTO schedule VALUES(null,#{userid}, #{bathid}, #{temp}, #{waterlevel}, #{cleantime}, #{starttime})")
	int insertschedule(@Param("userid") int i,
			@Param("bathid") int j, @Param("temp") int k, 
			@Param("waterlevel") int l,@Param("cleantime") int m,
			@Param("starttime") int n);
	
	
}
