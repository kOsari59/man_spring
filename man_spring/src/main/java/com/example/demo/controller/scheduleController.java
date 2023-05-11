package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.scheduleMapper;
import com.example.demo.model.UserProfile;
import com.example.demo.model.scedule;

@RestController
public class scheduleController {
	private scheduleMapper mapper;
	
	public scheduleController (scheduleMapper mapper) {
		this.mapper = mapper;
		
	}
	
	@PostMapping("/schedule")
	public void postUserSchedule(@RequestBody scedule scedule) {
		mapper.insertUserSchedule(scedule.getUser_id(),scedule.getBath_id(),scedule.getH_valve(),scedule.getC_valve(),scedule.getTemp(),scedule.getWater_level(),scedule.getSpkler(),scedule.getCap(),scedule.getFan_onoff(),scedule.getFan_speed(),scedule.getHeat(),scedule.getLed_onoff(),scedule.getLed_color(),scedule.getLed_bright());
	}
	
	@GetMapping("/schedule/{id}")
	public List<scedule> getSchedule(@PathVariable("id") String id) {
		return mapper.selectScedule(id);
	}

}
