package com.ynshun.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class TestController {
	private Logger logger = LoggerFactory.getLogger(TestController.class);

	@GetMapping("hello")
	public Object hello() {
		logger.info("--------------------hello---------------------");
		return "hello";
	}

	@GetMapping("world")
	public Object world() {
		logger.info("--------------------world---------------------");
		return "world";
	}

}
