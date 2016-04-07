package com.eagree.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.eagree.web")
public class WebConfig {
/*
 * At this stage with the empty class body, no view resolver has been configured
 * the default view resolver would be used. Component scanning is not enabled
 * This means all the controllers have to be defined explicitly using @Bean
 * And this dispatch servlet is configured to handle all the requests; that
 * includes the request for static resources.
 * Question: How requests for static resources are resolved?
 */
	
}
