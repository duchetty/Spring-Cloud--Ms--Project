package com.sbms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/customerServiceFallback")
	public ResponseEntity<String> customerServiceFallback()
	{
		return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("Customer Service is down try ofter some time");
				
	}
	@GetMapping("/addressServiceFallback")
	public ResponseEntity<String> addressServiceFallback()
	{
		return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("Address Service is down try ofter some time");
				
	}
}
