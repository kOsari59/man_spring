package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.bathMapper;
import com.example.demo.mapper.bathinfoMapper;
import com.example.demo.model.bath;
import com.example.demo.model.bath_info;

@RestController
public class BathInfoController {
private bathinfoMapper mapper;
	
	public BathInfoController(bathinfoMapper mapper) {
		this.mapper = mapper;
	}
	
//	@GetMapping("/data/{id}")
//	public bath getBath(@PathVariable("id") String id) {
//		return mapper.getbath(id);
//	}
//	
//	@PutMapping("/led_bright/{id}/{led_bright}")
//	public void putled_bright(@PathVariable("id") String id,@PathVariable("led_bright") String led_bright) {
//		mapper.updateled_bright(led_bright, id);
//	}
	
//	@PostMapping("/bath_info/{id}")
//	public void insertbathinfo(@PathVariable("id") String id, @RequestParam("state") String state, @RequestParam("temp") String temp, 
//			@RequestParam("waterlevel") String waterlevel,@RequestParam("cap") String cap,@RequestParam("hvalve") String hvalve,
//			@RequestParam("cvalve") String cvalve,@RequestParam("spkler") String spkler,@RequestParam("fanonoff") String fanonoff,
//			@RequestParam("fanspeed") String fanspeed,@RequestParam("heat") String heat,@RequestParam("ledonoff") String ledonoff,
//			@RequestParam("ledbright") String ledbright,@RequestParam("ledcolor") String ledcolor) {
//		mapper.insertbathinfo(id);
//	}

	
	@GetMapping("/bath_info/{id}")
	public bath_info getBath(@PathVariable("id") String id) {
		return mapper.getbathinfo(id);
	}
	
	@PostMapping("/update")
	public void insertbathinfo(@RequestBody bath_info model) {
		mapper.insertbathinfo(model.getBathid(),model.getState(),model.getTemp(),model.getWaterlevel(),model.getCap(),model.getHvalve(),model.getCvalve(),model.getSpkler(),
				model.getFanonoff(),model.getFanspeed(),model.getHeat(),model.getLedonoff(),model.getLedbright(),model.getLedcolor());
	}


}
