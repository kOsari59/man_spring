package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.bath;
import com.example.demo.model.bath_info;

@Mapper
public interface bathinfoMapper {
	
	@Insert("INSERT INTO bath_info VALUES(null,#{bathid}, #{state}, #{temp}, #{waterlevel}, #{cap},"
			+ " #{hvalve}, #{cvalve},#{spkler},#{fanonoff},#{fanspeed},#{heat}"
			+ ",#{ledonoff},#{ledbright},#{ledcolor})")
	int insertbathinfo(@Param("bathid") int bathid,
			@Param("state") int state, @Param("temp") int temp, 
			@Param("waterlevel") int waterlevel,@Param("cap") int cap,
			@Param("hvalve") int hvalve, @Param("cvalve") int cvalve, 
			@Param("spkler") int spkler, @Param("fanonoff") int fanonoff,
			@Param("fanspeed") int fanspeed,@Param("heat") int heat,
			@Param("ledonoff") int ledonoff,@Param("ledbright") int ledbright,
			@Param("ledcolor") int ledcolor);

	@Select("SELECT * FROM bath_info WHERE bathid=#{id}")
	bath_info getbathinfo(@Param("id") String id); 
	
//	@Update("UPDATE bath SET temp=#{temp} WHERE bath_id=#{bath_id}")
//	int updatetemp(@Param("temp") String temp, @Param("bath_id") String bath_id);
	
}
