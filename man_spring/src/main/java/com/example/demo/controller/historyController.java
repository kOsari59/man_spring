package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.historyMapper;
import com.example.demo.model.history;
import com.example.demo.model.scedule;


@RestController
public class historyController {
private historyMapper mapper;
	
	public historyController (historyMapper mapper) {
		this.mapper = mapper;
		
	}
	
	@PostMapping("/history")
	public void posthistoty(@RequestBody history history) {
		mapper.inserthistoty(
				history.getSchedule_id(),
				history.getBath_id(), 
				history.getUser_id(),
				history.getStart_time(), 
				history.getEnd_time(), 
				history.getAvg_temp(),
				history.getIs_shower(),
				history.getState(),
				history.getH_valve(),
				history.getC_valve(),
				history.getTemp(),
				history.getWater_level(),
				history.getSpkler(),
				history.getCap(),
				history.getFan_onoff(),
				history.getFan_speed(),
				history.getHeat(),
				history.getLed_onoff(),
				history.getLed_color(),
				history.getLed_bright());
	}
}
