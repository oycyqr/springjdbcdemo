package com.oyc.jdbcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.oyc.jdbcdemo")
public class SpringjdbcdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjdbcdemoApplication.class, args);
	}
}
