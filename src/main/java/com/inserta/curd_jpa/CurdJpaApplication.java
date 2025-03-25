package com.inserta.curd_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.insert.curd_jpa")
public class CurdJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdJpaApplication.class, args);
	}

}
