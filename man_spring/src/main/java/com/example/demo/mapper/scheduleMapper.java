package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.UserProfile;
import com.example.demo.model.bath;
import com.example.demo.model.scedule;

@Mapper
public interface scheduleMapper {
	@Insert("INSERT INTO user_schedule VALUES(null,#{user_id}, #{bath_id}, #{h_valve}, #{c_valve}, #{temp}, #{water_level}, #{spkler},#{cap},#{fan_onoff},#{fan_speed},#{heat},#{led_onoff},#{led_color},#{led_bright},default)")
	int insertUserSchedule(@Param("user_id") String user_id, @Param("bath_id") String bath_id, @Param("h_valve") String h_valve, @Param("c_valve") String c_valve,@Param("temp") String temp,@Param("water_level") String water_level, @Param("spkler") String spkler, @Param("cap") String cap, @Param("fan_onoff") String fan_onoff,@Param("fan_speed") String fan_speed,@Param("heat") String heat,@Param("led_onoff") String led_onoff,@Param("led_color") String led_color,@Param("led_bright") String led_bright);
	
	@Select("SELECT * FROM user_schedule WHERE bath_id=#{bath_id}")
	List<scedule> selectScedule(@Param("bath_id") String bath_id);
}
