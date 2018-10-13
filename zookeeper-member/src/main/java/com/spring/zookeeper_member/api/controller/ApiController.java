package com.spring.zookeeper_member.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@Value("${server.port}")
	private String serverPort;
	
	@GetMapping("/info")
	public String getInfo() {
		return "spring cloud 整合 zookeeper,端口号" + serverPort;
	}
}
