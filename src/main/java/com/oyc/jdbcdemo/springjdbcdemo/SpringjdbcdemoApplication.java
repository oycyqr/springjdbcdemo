package com.oyc.jdbcdemo.springjdbcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.oyc.jdbcdemo")
@EnableJpaRepositories("com.oyc.jdbcdemo.Repository")
public class SpringjdbcdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjdbcdemoApplication.class, args);
	}
}
