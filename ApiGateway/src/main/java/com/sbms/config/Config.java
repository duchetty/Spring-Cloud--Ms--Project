package com.sbms.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public RouteLocator coustomRouteLocator(RouteLocatorBuilder builder)
	{
		return builder.routes().route(i->i.path("/CustomerService/**").uri("lb://CUSTOMERSERVICE"))
				.route(i->i.path("/AddressService/**").uri("lb://ADDRESSSERVICE")).build();
	}
}
