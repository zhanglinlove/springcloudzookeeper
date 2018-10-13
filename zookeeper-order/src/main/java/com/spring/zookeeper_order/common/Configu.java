package com.spring.zookeeper_order.common;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Configu {

	@Bean
	@LoadBalanced
	public RestTemplate getInstance() {
		return new RestTemplate();
	}
}
