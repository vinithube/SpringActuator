package com.example.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
//@Controller
//@ResponseBody
@RestController
@RequestMapping("/demoactuator")
public class SpringActuatorApplication {

	//configure application.properties
	//management.endpoints.web.exposure.include=*

	//how to check health ?
	//http://localhost:8080/actuator/health
	//http://localhost:8080/actuator

	public static void main(String[] args) {
		SpringApplication.run(SpringActuatorApplication.class, args);
	}

	@GetMapping("/link")
	public String getActuatorDetails(){
		//you can find more details here
		return "https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html#actuator.endpoints";
	}
}
