package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.bathMapper;
import com.example.demo.model.bath;
import com.example.demo.model.scedule;

@RestController
public class bathController {
	
	private bathMapper mapper;
	
	public bathController(bathMapper mapper) {
		this.mapper = mapper;
	}
	
	@GetMapping("/data/{id}")
	public bath getBath(@PathVariable("id") String id) {
		return mapper.getbath(id);
	}
	
	@GetMapping("/state/{id}")
	public bath getstate(@PathVariable("id") String id) {
		return mapper.getstate(id);
	}
	
	@GetMapping("/h_valve/{id}")
	public bath geth_valve(@PathVariable("id") String id) {
		return mapper.geth_valve(id);
	}
	
	@GetMapping("/c_valve/{id}")
	public bath getc_valve(@PathVariable("id") String id) {
		return mapper.getc_valve(id);
	}
	
	@GetMapping("/water_level/{id}")
	public bath getwater_level(@PathVariable("id") String id) {
		return mapper.getwater_level(id);
	}
	
	@GetMapping("/spkler/{id}")
	public bath getspkler(@PathVariable("id") String id) {
		return mapper.getspkler(id);
	}
	
	@GetMapping("/cap/{id}")
	public bath getcap(@PathVariable("id") String id) {
		return mapper.getcap(id);
	}
	
	@GetMapping("/fan_onoff/{id}")
	public bath getfan_onoff(@PathVariable("id") String id) {
		return mapper.getfan_onoff(id);
	}
	
	@GetMapping("/fan_speed/{id}")
	public bath getfan_speed(@PathVariable("id") String id) {
		return mapper.getfan_speed(id);
	}
	
	@GetMapping("/heat/{id}")
	public bath getheat(@PathVariable("id") String id) {
		return mapper.getheat(id);
	}
	
	@GetMapping("/led_onoff/{id}")
	public bath getled_onoff(@PathVariable("id") String id) {
		return mapper.getled_onoff(id);
	}
	
	@GetMapping("/led_color/{id}")
	public bath getled_color(@PathVariable("id") String id) {
		return mapper.getled_color(id);
	}
	
	@GetMapping("/led_bright/{id}")
	public bath getled_bright(@PathVariable("id") String id) {
		return mapper.getled_bright(id);
	}
	
	@PutMapping("/temp/{id}/{temp}")
	public void puttemp(@PathVariable("id") String id,@PathVariable("temp") String temp) {
		mapper.updatetemp(temp, id);
	}
	
	@PutMapping("/state/{id}/{state}")
	public void putstate(@PathVariable("id") String id,@PathVariable("state") String state) {
		mapper.updatestate(state,id);
	}
	
	@PutMapping("/h_valve/{id}/{h_valve}")
	public void puth_valve(@PathVariable("id") String id,@PathVariable("h_valve") String h_valve) {
		mapper.updateh_valve(h_valve, id);
	}
	
	@PutMapping("/c_valve/{id}/{c_valve}")
	public void putc_valve(@PathVariable("id") String id,@PathVariable("c_valve") String c_valve) {
		mapper.updatec_valve(c_valve, id);
	}
	
	@PutMapping("/water_level/{id}/{water_level}")
	public void putwater_level(@PathVariable("id") String id,@PathVariable("water_level") String water_level) {
		mapper.updatewater_level(water_level, id);
	}
	
	@PutMapping("/spkler/{id}/{spkier}")
	public void putspkier(@PathVariable("id") String id,@PathVariable("spkier") String spkier) {
		mapper.updatespkler(spkier, id);
	}
	
	@PutMapping("/cap/{id}/{cap}")
	public void putcap(@PathVariable("id") String id,@PathVariable("cap") String cap) {
		mapper.updatecap(cap, id);
	}
	
	@PutMapping("/fan_speed/{id}/{fan_speed}")
	public void putfan_speed(@PathVariable("id") String id,@PathVariable("fan_speed") String fan_speed) {
		mapper.updatefan_speed(fan_speed, id);
	}
	
	@PutMapping("/heat/{id}/{heat}")
	public void putheat(@PathVariable("id") String id,@PathVariable("heat") String heat) {
		mapper.updateheat(heat, id);
	}
	
	@PutMapping("/led_onoff/{id}/{led_onoff}")
	public void putled_onoff(@PathVariable("id") String id,@PathVariable("led_onoff") String led_onoff) {
		mapper.updateled_onoff(led_onoff, id);
	}	
	@PutMapping("/led_color/{id}/{led_color}")
	public void putled_color(@PathVariable("id") String id,@PathVariable("led_color") String led_color) {
		mapper.updateled_color(led_color, id);
	}	
	@PutMapping("/fan_onoff/{id}/{fan_onoff}")
	public void putfan_onoff(@PathVariable("id") String id,@PathVariable("fan_onoff") String fan_onoff) {
		mapper.updatefan_onoff(fan_onoff, id);
	}
	@PutMapping("/led_bright/{id}/{led_bright}")
	public void putled_bright(@PathVariable("id") String id,@PathVariable("led_bright") String led_bright) {
		mapper.updateled_bright(led_bright, id);
	}
}
