package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.ControlMapper;
import com.example.demo.model.control;

@RestController
public class ControlController {
private ControlMapper mapper;
	
	public ControlController(ControlMapper mapper) {
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

	
	@GetMapping("/control/{id}")
	public control getBath(@PathVariable("id") String id) {
		return mapper.getControl(id);
	}
	
	@PostMapping("/control")
	public void insertbathinfo(@RequestBody control model) {
		mapper.insertcontrol(model.getUserid(),model.getBathid(),model.getCap(),model.getHvalve(),model.getCvalve(),model.getCleantime());
	}


}
