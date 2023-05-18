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

@RestController
public class bathController {
	
	private bathMapper mapper;
	
	public bathController(bathMapper mapper) {
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
	
	@GetMapping("/bath/{id}")
	public bath getBath(@PathVariable("id") String id) {
		return mapper.getbath(id);
	}
}
