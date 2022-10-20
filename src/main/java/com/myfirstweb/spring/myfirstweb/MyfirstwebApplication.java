package com.myfirstweb.spring.myfirstweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MyfirstwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstwebApplication.class, args);
	}

}
