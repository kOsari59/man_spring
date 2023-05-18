package com.example.demo.controller;

import org.apache.ibatis.ognl.ASTThisVarRef;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.ScheduleMapper;
import com.example.demo.model.bath_info;
import com.example.demo.model.schedule;

@RestController
public class ScheduleController {
	private ScheduleMapper mapper;
	
	public ScheduleController(ScheduleMapper mappper) {
		this.mapper = mappper;
	}
	
	@GetMapping("/schedule/{id}")
	public schedule getBath(@PathVariable("id") String id) {
		return mapper.getSchedule(id);
	}
	
	@PostMapping("/schedule")
	public void insertbathinfo(@RequestBody schedule model) {
		mapper.insertschedule(model.getUserid(),model.getBathid(),model.getTemp(),model.getWaterlevel(),model.getCleantime(),model.getStarttime());
	}


}
