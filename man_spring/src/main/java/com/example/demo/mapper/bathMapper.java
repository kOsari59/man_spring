package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.bath;

@Mapper
public interface bathMapper {
	@Select("SELECT * FROM bath WHERE bath_id=#{id}")
	bath getbath(@Param("id") String id); 
	
	@Select("SELECT state FROM bath WHERE bath_id=#{id}")
	bath getstate(@Param("id") String id); 
	
	@Select("SELECT h_valve FROM bath WHERE bath_id=#{id}")
	bath geth_valve(@Param("id") String id); 
	
	@Select("SELECT c_valve FROM bath WHERE bath_id=#{id}")
	bath getc_valve(@Param("id") String id); 
	
	@Select("SELECT temp FROM bath WHERE bath_id=#{id}")
	bath gettemp(@Param("id") String id); 
	
	@Select("SELECT water_level FROM bath WHERE bath_id=#{id}")
	bath getwater_level(@Param("id") String id); 
	
	@Select("SELECT spkler FROM bath WHERE bath_id=#{id}")
	bath getspkler(@Param("id") String id); 
	
	@Select("SELECT cap FROM bath WHERE bath_id=#{id}")
	bath getcap(@Param("id") String id); 
	
	@Select("SELECT fan_onoff FROM bath WHERE bath_id=#{id}")
	bath getfan_onoff(@Param("id") String id); 
	
	@Select("SELECT fan_speed FROM bath WHERE bath_id=#{id}")
	bath getfan_speed(@Param("id") String id); 
	
	@Select("SELECT heat FROM bath WHERE bath_id=#{id}")
	bath getheat(@Param("id") String id); 
	
	@Select("SELECT led_onoff FROM bath WHERE bath_id=#{id}")
	bath getled_onoff(@Param("id") String id); 
	
	@Select("SELECT led_color FROM bath WHERE bath_id=#{id}")
	bath getled_color(@Param("id") String id); 

	@Select("SELECT led_bright FROM bath WHERE bath_id=#{id}")
	bath getled_bright(@Param("id") String id); 
	
	@Insert("INSERT INTO user_schedule VALUES(null,#{user_id}, #{bath_id}, #{h_valve}, #{c_valve}, #{temp}, #{water_level}, #{spkler},#{cap},#{fan_onoff},#{fan_speed},#{heat},#{led_onoff},#{led_color},#{led_bright},default)")
	int insertUserSchedule(@Param("user_id") String user_id, @Param("bath_id") String bath_id, @Param("h_valve") String h_valve, @Param("c_valve") String c_valve,@Param("temp") String temp,@Param("water_level") String water_level, @Param("spkler") String spkler, @Param("cap") String cap, @Param("fan_onoff") String fan_onoff,@Param("fan_speed") String fan_speed,@Param("heat") String heat,@Param("led_onoff") String led_onoff,@Param("led_color") String led_color,@Param("led_bright") String led_bright);

	@Update("UPDATE bath SET temp=#{temp} WHERE bath_id=#{bath_id}")
	int updatetemp(@Param("temp") String temp, @Param("bath_id") String bath_id);
	
	@Update("UPDATE bath SET state=#{state} WHERE bath_id=#{bath_id}")
	int updatestate(@Param("state") String state, @Param("bath_id") String bath_id);
	
	@Update("UPDATE bath SET h_valve=#{h_valve} WHERE bath_id=#{bath_id}")
	int updateh_valve(@Param("h_valve") String h_valve, @Param("bath_id") String bath_id);
	
	@Update("UPDATE bath SET c_valve=#{c_valve} WHERE bath_id=#{bath_id}")
	int updatec_valve(@Param("c_valve") String c_valve, @Param("bath_id") String bath_id);
	
	@Update("UPDATE bath SET water_level=#{water_level} WHERE bath_id=#{bath_id}")
	int updatewater_level(@Param("water_level") String water_level, @Param("bath_id") String bath_id);
	
	@Update("UPDATE bath SET spkler=#{spkier} WHERE bath_id=#{bath_id}")
	int updatespkler(@Param("spkier") String spkier, @Param("bath_id") String bath_id);
	
	@Update("UPDATE bath SET cap=#{cap} WHERE bath_id=#{bath_id}")
	int updatecap(@Param("cap") String cap, @Param("bath_id") String bath_id);
	
	@Update("UPDATE bath SET fan_speed=#{fan_speed} WHERE bath_id=#{bath_id}")
	int updatefan_speed(@Param("fan_speed") String temp, @Param("bath_id") String bath_id);
	
	@Update("UPDATE bath SET fan_onoff=#{fan_onoff} WHERE bath_id=#{bath_id}")
	int updatefan_onoff(@Param("fan_onoff") String fan_onoff, @Param("bath_id") String bath_id);
	
	@Update("UPDATE bath SET heat=#{heat} WHERE bath_id=#{bath_id}")
	int updateheat(@Param("heat") String heat, @Param("bath_id") String bath_id);
	
	@Update("UPDATE bath SET led_onoff=#{led_onoff} WHERE bath_id=#{bath_id}")
	int updateled_onoff(@Param("led_onoff") String led_onoff, @Param("bath_id") String bath_id);
	
	@Update("UPDATE bath SET led_color=#{led_color} WHERE bath_id=#{bath_id}")
	int updateled_color(@Param("led_color") String led_color, @Param("bath_id") String bath_id);
	
	@Update("UPDATE bath SET led_bright=#{led_bright} WHERE bath_id=#{bath_id}")
	int updateled_bright(@Param("led_bright") String led_bright, @Param("bath_id") String bath_id);

}
