package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface historyMapper {
	@Insert("INSERT INTO user_history VALUES(null,#{schedule_id},#{bath_id}, #{user_id}, #{start_time},#{end_time},#{avg_temp},#{is_shower},#{state}, #{h_valve},#{c_valve}, #{temp}, #{water_level}, #{spkler},#{cap},#{fan_onoff},#{fan_speed},#{heat},#{led_onoff},#{led_color},#{led_bright})")
	int inserthistoty(@Param("schedule_id") String schedule_id,@Param("bath_id") String bath_id,@Param("user_id") String user_id, @Param("start_time") String start_time,@Param("end_time") String end_time,@Param("avg_temp") String avg_temp,@Param("is_shower") String is_shower,@Param("state") String state, @Param("h_valve") String h_valve, @Param("c_valve") String c_valve,@Param("temp") String temp,@Param("water_level") String water_level, @Param("spkler") String spkler, @Param("cap") String cap, @Param("fan_onoff") String fan_onoff,@Param("fan_speed") String fan_speed,@Param("heat") String heat,@Param("led_onoff") String led_onoff,@Param("led_color") String led_color,@Param("led_bright") String led_bright);
	

}
